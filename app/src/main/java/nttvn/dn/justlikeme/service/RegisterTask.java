package nttvn.dn.justlikeme.service;

import android.os.AsyncTask;
import android.util.Log;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import nttvn.dn.justlikeme.common.Url;
import nttvn.dn.justlikeme.listener.TaskListener;
import nttvn.dn.justlikeme.model.Buddy;

/**
 * Created by ninhn on 2016/03/12.
 */
public class RegisterTask extends AsyncTask<Buddy, Buddy, Buddy> {

    private List<TaskListener> myListeners = new ArrayList<TaskListener>();

    public void addListener(TaskListener tl) {
        myListeners.add(tl);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("RegisterTask", "Create RegisterTask");
    }

    @Override
    protected Buddy doInBackground(Buddy... params) {
        try {
            Log.d("RegisterTask", "Open Excute");
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            Buddy buddy = restTemplate.postForObject(new URI(Url.REGISTER), params[0], Buddy.class);
            Log.d("RegisterTask", "Requested");
            if (buddy != null)
                Log.d("RegisterTask", buddy.getName() + " - " + buddy.getToken());
            else
                Log.d("RegisterTask", "FAIL");
            return buddy;
        } catch (Exception e) {
            Log.e("RegisterTask", e.getMessage(), e);
        }
        return null;
    }

    @Override
    protected void onPostExecute(Buddy buddy) {
        super.onPostExecute(buddy);
        for (TaskListener tl : myListeners) {
            tl.onResultAvailable(Url.KEY_REGISTER, buddy);
        }
        Log.d("RegisterTask", "Done");
    }

}
