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
public class GetListBuddyTask extends AsyncTask<Buddy, Void, List<Buddy>> {

    private List<TaskListener> myListeners = new ArrayList<TaskListener>();

    public void addListener(TaskListener tl) {
        myListeners.add(tl);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("GetListBuddyTask", "Create GetListBuddyTask");
    }

    @Override
    protected void onPostExecute(List<Buddy> buddie) {
        super.onPostExecute(buddie);
        for (TaskListener tl : myListeners) {
            tl.onResultAvailable(buddie);
        }
        Log.d("GetListBuddyTask", "Done");
    }

    @Override
    protected List<Buddy> doInBackground(Buddy... params) {
        try {
            Log.d("GetListBuddyTask", "Open Excute");
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            //Buddy[] buddies = restTemplate.postForObject(new URI(Url.GET_LIST_BUDDY), params[0], Buddy[].class);
            Object obj = restTemplate.postForObject(new URI(Url.GET_LIST_BUDDY), params[0], Object.class);
            List<Buddy> buddies = (List<Buddy>) obj;
            Log.d("GetListBuddyTask", "Requested");
            return buddies;
        } catch (Exception e) {
            Log.e("GetListBuddyTask", e.getMessage(), e);
        }
        return null;
    }
}
