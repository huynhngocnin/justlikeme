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
public class UpdateLocationTask extends AsyncTask<Buddy, Void, Boolean> {

    private List<TaskListener> myListeners = new ArrayList<TaskListener>();

    public void addListener(TaskListener tl) {
        myListeners.add(tl);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("UpdateLocationTask", "Create UpdateLocationTask");
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        for (TaskListener tl : myListeners) {
            tl.onResultAvailable(aBoolean);
        }
        Log.d("UpdateLocationTask", "Done");
    }

    @Override
    protected Boolean doInBackground(Buddy... params) {
        try {
            Log.d("UpdateLocationTask", "Open Excute");
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            boolean result = restTemplate.postForObject(new URI(Url.UPDATE_LOCATION), params[0], Boolean.class);
            Log.d("UpdateLocationTask", "Requested");
            return result;
        } catch (Exception e) {
            Log.e("UpdateLocationTask", e.getMessage(), e);
        }
        return false;
    }

}
