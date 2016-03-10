package nttvn.dn.justlikeme.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import nttvn.dn.justlikeme.model.Buddy;

/**
 * Created by NinHN on 3/10/16.
 */
public class MyPreferenceManager {
    private String TAG = MyPreferenceManager.class.getSimpleName();

    // Shared Preferences
    SharedPreferences pref;

    // Editor for Shared preferences
    SharedPreferences.Editor editor;

    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private static final String PREF_NAME = "justlikeme";

    // All Shared Preferences Keys
    private static final String KEY_TOKEN_ID = "token_id";
    private static final String KEY_USER_NAME = "user_name";
    private static final String KEY_NOTIFICATIONS = "notifications";

    // Constructor
    public MyPreferenceManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public void storeBuddy(Buddy buddy) {
        editor.putString(KEY_TOKEN_ID, buddy.getToken());
        editor.putString(KEY_USER_NAME, buddy.getName());
        editor.commit();

        Log.e(TAG, "User is stored in shared preferences. " + buddy.getName() + ", " + buddy.getToken());
    }

    public Buddy getBuddy() {
        if (pref.getString(KEY_TOKEN_ID, null) != null) {
            String token, name;
            token = pref.getString(KEY_TOKEN_ID, null);
            name = pref.getString(KEY_USER_NAME, null);

            Buddy buddy = new Buddy(token, name);
            return buddy;
        }
        return null;
    }

    public void addNotification(String notification) {

        // get old notifications
        String oldNotifications = getNotifications();

        if (oldNotifications != null) {
            oldNotifications += "|" + notification;
        } else {
            oldNotifications = notification;
        }

        editor.putString(KEY_NOTIFICATIONS, oldNotifications);
        editor.commit();
    }

    public String getNotifications() {
        return pref.getString(KEY_NOTIFICATIONS, null);
    }

    public void clear() {
        editor.clear();
        editor.commit();
    }
}
