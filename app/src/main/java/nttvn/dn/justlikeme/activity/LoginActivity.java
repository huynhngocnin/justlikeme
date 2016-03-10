package nttvn.dn.justlikeme.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import nttvn.dn.justlikeme.MyApplication;
import nttvn.dn.justlikeme.R;
import nttvn.dn.justlikeme.gcm.GcmIntentService;
import nttvn.dn.justlikeme.model.Buddy;


/**
 * A login screen that offers login via username.
 */
public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();

    // UI references.
    private EditText mName;

    private Buddy buddy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        mName = (EditText) findViewById(R.id.input_name);

        if(checkBuddy()){
            registerGCM();
        }

        Button mEmailSignInButton = (Button) findViewById(R.id.btn_login_enter);
        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                updateBuddyName();
                nextToHashList();
            }
        });
    }

    private boolean checkBuddy() {
        //Get buddy if exist
        buddy = MyApplication.getInstance().getPrefManager().getBuddy();
        if (buddy != null) {
            mName.setText(buddy.getName());
            return false;
        }
        return true;
    }

    private void registerGCM() {
        //Register new buddy
        Intent intent = new Intent(this, GcmIntentService.class);
        intent.putExtra(GcmIntentService.KEY, GcmIntentService.REGISTER);
        startService(intent);
    }

    private void updateBuddyName(){
        //Update buddy name
        buddy = MyApplication.getInstance().getPrefManager().getBuddy();
        buddy.setName(mName.getText().toString());
        MyApplication.getInstance().getPrefManager().storeBuddy(buddy);
    }
    private void nextToHashList(){
        //Next to hashlist screen
        Intent intent = new Intent(LoginActivity.this, HashListActivity.class);
        startActivity(intent);
        //Close this screen
        finish();
    }
}

