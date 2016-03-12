package nttvn.dn.justlikeme.gcm;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import nttvn.dn.justlikeme.MyApplication;
import nttvn.dn.justlikeme.R;
import nttvn.dn.justlikeme.model.Buddy;


/**
 * Created by NinHN on 3/1/16.
 */
public class GcmIntentService extends IntentService {

    private static final String TAG = GcmIntentService.class.getSimpleName();

    public static final String KEY = "key";
    public static final String REGISTER = "register";

    public GcmIntentService() {
        super(TAG);
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        String key = intent.getStringExtra(KEY);
        switch (key) {
            case REGISTER:
                registerGCM();
            default:
                // if key is specified, register with GCM
        }

    }

    /**
     * Registering with GCM and obtaining the gcm registration id
     */
    private void registerGCM() {
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        try {
            InstanceID instanceID = InstanceID.getInstance(this);
            String token = instanceID.getToken(getString(R.string.gcm_defaultSenderId),
                    GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);

            Log.e(TAG, "GCM Registration Token: " + token);

            //Save buddy into local
            Buddy buddy = new Buddy();
            buddy.setToken(token);
            MyApplication.getInstance().getPrefManager().storeBuddy(buddy);


        } catch (Exception e) {
            Log.e(TAG, "Failed to complete token refresh", e);

        }
//        // Notify UI that registration has completed, so the progress indicator can be hidden.
//        Intent registrationComplete = new Intent(Config.REGISTRATION_COMPLETE);
//        LocalBroadcastManager.getInstance(this).sendBroadcast(registrationComplete);
    }


}
