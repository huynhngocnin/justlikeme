package nttvn.dn.justlikeme.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.wefika.flowlayout.FlowLayout;

import java.util.ArrayList;
import java.util.Random;

import nttvn.dn.justlikeme.Home;
import nttvn.dn.justlikeme.R;

/**
 * Created by NinHN on 3/10/16.
 */
public class HashListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final String TAG = HashListActivity.class.getSimpleName();

    private AutoCompleteTextView autoCompleteTextView;
    private Adapter adapter;

    private FlowLayout mHashtagContainer;
    private ArrayList<String> hashtagList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashtag);
        // Set up the login form.
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto_text_input);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.hashtag_item, getlistHashHint());

        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);


        autoCompleteTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        autoCompleteTextView.setOnItemClickListener(this);

        setHashtags();

        Button mEmailSignInButton = (Button) findViewById(R.id.btn_hash_enter);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateBuddyHash();
                nextToHome();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selected = ((TextView) view).getText().toString();
        Toast.makeText(this, "Da chon " + selected, Toast.LENGTH_LONG).show();
        mHashtagContainer.addView(addTextViewHash(selected));

    }

    private void updateBuddyHash() {

    }

    private void nextToHome() {
        //Next to hashlist screen
        Intent intent = new Intent(HashListActivity.this, Home.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        //Close this screen
        finish();
    }

    private String[] getlistHashHint() {
        String[] nameList = {"NinHN", "KhanhHT", "LinhDB", "NamNV"};
        return nameList;
    }

    private void setHashtags() {

        mHashtagContainer = (FlowLayout) findViewById(R.id.hashtag_container);
        hashtagList = getHashtagsFromAnySource();

        for (final String hashtag : hashtagList) {
            mHashtagContainer.addView(addTextViewHash(hashtag));
        }
    }

    private void changeHashtag(View v, String hashtag) {

//        TextView textView = (TextView) v;
//        //textView.setText(hashtag + " OK");
//        //textView.setBackgroundResource(R.drawable.round_corners_selected);
//        if (textView.getContentDescription() == "0") {
//            textView.setBackgroundColor(getRandomHashtagColor(this));
//
//            textView.setContentDescription("1");
//            applyTaDaAnimation(v);
//            Snackbar.make(v, "#" + hashtag + " selected", Snackbar.LENGTH_LONG).show();
//        } else {
//            textView.setBackgroundColor(0x00000000);
//            textView.setContentDescription("0");
//            Snackbar.make(v, "#" + hashtag + " unselect", Snackbar.LENGTH_LONG).show();
//        }
    }

    private void removeHash(View v) {
        mHashtagContainer.removeView(v);
    }

    private int getRandomHashtagColor(Context context) {
        int[] hashtagColors = context.getResources().getIntArray(R.array.hashtag_colors);
        int randomColor = hashtagColors[new Random().nextInt(hashtagColors.length)];
        return randomColor;
    }

    private ArrayList<String> getHashtagsFromAnySource() {
        ArrayList<String> hashtagList = new ArrayList<>();
        hashtagList.add("Cheetos");
        hashtagList.add("Beer");
        hashtagList.add("Milk");
        hashtagList.add("CocaCola");
        hashtagList.add("DairyProducts");
        hashtagList.add("Soda");
        hashtagList.add("Cake");
        return hashtagList;
    }

    private void applyTaDaAnimation(final View targetView) {
        YoYo.with(Techniques.Tada)
                .duration(600)
                .playOn(targetView);
    }

    private TextView addTextViewHash(final String hashtag) {
        FlowLayout.LayoutParams hashTagLayoutParams = new FlowLayout.LayoutParams(FlowLayout.LayoutParams.WRAP_CONTENT, FlowLayout.LayoutParams.WRAP_CONTENT);
        hashTagLayoutParams.setMargins(16, 16, 16, 16);

        TextView textView = (TextView) getLayoutInflater().inflate(R.layout.hashtag_item, null);
        textView.setText("#" + hashtag);
        textView.setBackgroundColor(getRandomHashtagColor(this));
        textView.setContentDescription("0");
        textView.setLayoutParams(hashTagLayoutParams);
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    changeHashtag(v, hashtag);
                }
                return false;
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeHash(v);
            }
        });
        return textView;
    }
}
