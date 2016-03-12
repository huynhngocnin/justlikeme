package nttvn.dn.justlikeme.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.wefika.flowlayout.FlowLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import nttvn.dn.justlikeme.Home;
import nttvn.dn.justlikeme.MyApplication;
import nttvn.dn.justlikeme.R;
import nttvn.dn.justlikeme.common.Constants;
import nttvn.dn.justlikeme.listener.TaskListener;
import nttvn.dn.justlikeme.model.Buddy;
import nttvn.dn.justlikeme.model.Hashtag;
import nttvn.dn.justlikeme.service.GetListHashTask;
import nttvn.dn.justlikeme.service.RegisterTask;

/**
 * Created by NinHN on 3/12/16.
 */
public class HashListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, TaskListener {

    private static final String TAG = HashListActivity.class.getSimpleName();
    public static final int GET_LIST_HASH = 1;
    public static final int SEND_BUDDY_INFO = 2;

    private AutoCompleteTextView autoCompleteTextView;
    private TextView textViewSelected;

    private FlowLayout mHashtagContainer;
    private ArrayList<String> hashtagList;
    private List<Hashtag> buddyHashList = new ArrayList<Hashtag>();
    private ArrayAdapter adapter;
    private ProgressDialog progressDialog;

    private Buddy buddy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashtag);
        //Call to get list hash hint
        callListHashHint();

        //Get buddy info
        buddy = MyApplication.getInstance().getPrefManager().getBuddy();
        // Set up the login form.
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto_text_input);

        autoCompleteTextView.setOnItemClickListener(this);

        setHashtags();

        Button mEmailSignInButton = (Button) findViewById(R.id.btn_hash_enter);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateBuddyHash();
                sendHashUpdateToServer();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selected = ((TextView) view).getText().toString();
        //Toast.makeText(this, "Da chon " + selected, Toast.LENGTH_LONG).show();
        autoCompleteTextView.setText(Constants.BLANK);
        if (!hashtagList.contains(selected)) {
            hashtagList.add(selected);
            //Add hashListBuddy
            Hashtag hashbuddy = new Hashtag();
            hashbuddy.setHash(selected);
            buddyHashList.add(hashbuddy);
            textViewSelected = addTextViewHash(selected);
            mHashtagContainer.addView(textViewSelected);
            applyTaDaAnimation(textViewSelected);
        }
    }

    private void updateBuddyHash() {
        buddy.setHashtags(buddyHashList);
        MyApplication.getInstance().getPrefManager().storeBuddy(buddy);
    }

    private void sendHashUpdateToServer() {
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.show();

        RegisterTask taskRegister = new RegisterTask();
        taskRegister.addListener(this);
        taskRegister.execute(buddy);
    }

    private void nextToHome() {
        //Next to hashlist screen
        Intent intent = new Intent(HashListActivity.this, Home.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        //Close this screen
        finish();
    }


    private void callListHashHint() {
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.show();

        //Service get all hashtag
        GetListHashTask taskGetListHash = new GetListHashTask();
        taskGetListHash.addListener(this);
        taskGetListHash.execute();
    }

    @Override
    public void onResultAvailable(Object... objects) {
        int type = (Integer) objects[0];
        if (GET_LIST_HASH == type) {

            List<String> listHash = (List<String>) objects[1];

            adapter = new ArrayAdapter(this, R.layout.hashtag_hint, listHash);
            autoCompleteTextView.setThreshold(1);
            autoCompleteTextView.setAdapter(adapter);
            if (progressDialog != null) {
                progressDialog.cancel();
            }
        } else if (SEND_BUDDY_INFO == type) {

            nextToHome();
        }
    }

    private void setHashtags() {

        mHashtagContainer = (FlowLayout) findViewById(R.id.hashtag_container);
        hashtagList = getHashtagsFromAnySource();

        for (final String hashtag : hashtagList) {
            mHashtagContainer.addView(addTextViewHash(hashtag));
        }
    }

    private void removeHash(final View v, final String hashtag) {
        applyHideAnimation(v);
        //Remove listHashCheck
        hashtagList.remove(hashtag);
        //Remove listHashBuddy
        removeHash(hashtag);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 0.7s
                mHashtagContainer.removeView(v);
            }
        }, 700);
    }

    private int getRandomHashtagColor(Context context) {
        int[] hashtagColors = context.getResources().getIntArray(R.array.hashtag_colors);
        int randomColor = hashtagColors[new Random().nextInt(hashtagColors.length)];
        return randomColor;
    }

    private ArrayList<String> getHashtagsFromAnySource() {
        ArrayList<String> hashtagList = new ArrayList<>();
        if (buddy != null && buddy.getHashtags() != null && buddy.getHashtags().size() > 0) {
            buddyHashList = buddy.getHashtags();
            for (Hashtag tag : buddy.getHashtags()) {
                hashtagList.add(tag.getHash());
            }
        }
        return hashtagList;
    }

    private void applyTaDaAnimation(final View targetView) {
        YoYo.with(Techniques.Tada)
                .duration(800)
                .playOn(targetView);
    }

    private void applyHideAnimation(final View targetView) {
        YoYo.with(Techniques.ZoomOut)
                .duration(800)
                .playOn(targetView);
    }

    private TextView addTextViewHash(final String hashtag) {
        FlowLayout.LayoutParams hashTagLayoutParams = new FlowLayout.LayoutParams(FlowLayout.LayoutParams.WRAP_CONTENT, FlowLayout.LayoutParams.WRAP_CONTENT);
        hashTagLayoutParams.setMargins(16, 16, 16, 16);
        TextView textView = (TextView) getLayoutInflater().inflate(R.layout.hashtag_item, null);
        textView.setText("#" + hashtag);
        textView.setBackgroundColor(getRandomHashtagColor(this));
        textView.setLayoutParams(hashTagLayoutParams);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeHash(v, hashtag);
            }
        });
        return textView;
    }

    private void removeHash(String hashtag) {
        for (Hashtag hash : buddyHashList) {
            if (hash.getHash().equals(hashtag)) {
                buddyHashList.remove(hash);
                return;
            }
        }
    }

}
