package nttvn.dn.justlikeme.gcm;

import com.google.android.gms.iid.InstanceIDListenerService;
import android.content.Intent;
import android.util.Log;
/**
 * Created by NinHN on 3/10/16.
 */
public class MyInstanceIDListenerService extends InstanceIDListenerService {
    private static final String TAG = MyInstanceIDListenerService.class.getSimpleName();

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. This call is initiated by the
     * InstanceID provider.
     */
    @Override
    public void onTokenRefresh() {
        Log.e(TAG, "onTokenRefresh");
        // Fetch updated Instance ID token and notify our app's server of any changes (if applicable).
        Intent intent = new Intent(this, GcmIntentService.class);
        startService(intent);
    }
}
