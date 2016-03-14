package nttvn.dn.justlikeme.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import nttvn.dn.justlikeme.common.Constants;
import nttvn.dn.justlikeme.model.Buddy;
import nttvn.dn.justlikeme.model.Hashtag;

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
    private static final String KEY_HASH_LIST = "hash_list";
    private static final String KEY_NOTIFICATIONS = "notifications";

    // Constructor
    public MyPreferenceManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public void storeBuddy(Buddy buddy) {
        String hashList = Constants.BLANK;
        if (buddy != null && buddy.getHashtags() != null) {
            for (Hashtag hash : buddy.getHashtags()) {
                hashList += hash.getHash() + Constants.COMMA;
            }
        }
        editor.putString(KEY_TOKEN_ID, buddy.getToken());
        editor.putString(KEY_USER_NAME, buddy.getName());
        editor.putString(KEY_HASH_LIST, hashList);
        editor.commit();

        Log.e(TAG, "User is stored in shared preferences. " + buddy.getName() + ", " + buddy.getToken() + ", " + hashList);
    }

    public Buddy getBuddy() {
        if (pref.getString(KEY_TOKEN_ID, null) != null) {
            Buddy buddy = new Buddy();

            String token, name;
            token = pref.getString(KEY_TOKEN_ID, null);
            name = pref.getString(KEY_USER_NAME, null);
            String tag = pref.getString(KEY_HASH_LIST, null);

            if (tag != null && !Constants.BLANK.equals(tag)) {
                String[] tagList = tag.split(Constants.COMMA);
                List<Hashtag> hashtagList = new ArrayList<Hashtag>();
                Log.d(TAG, "After add, list have item : " + tagList.toString());
                Hashtag hashtag;
                for (String hashtagItem : tagList) {
                    hashtag = new Hashtag();
                    if (!Constants.BLANK.equals(hashtagItem)) {
                        hashtag.setHash(hashtagItem);
                        hashtagList.add(hashtag);
                    }
                }
                buddy.setHashtags(hashtagList);
                Log.d(TAG, "After add, list have item : " + hashtagList.size());
            }

            buddy.setToken(token);
            buddy.setName(name);

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
