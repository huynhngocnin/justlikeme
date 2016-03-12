package nttvn.dn.justlikeme.service;

import android.os.AsyncTask;
import android.util.Log;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import nttvn.dn.justlikeme.activity.HashListActivity;
import nttvn.dn.justlikeme.common.Url;
import nttvn.dn.justlikeme.listener.TaskListener;

/**
 * Created by ninhn on 2016/03/12.
 */
public class GetListHashTask extends AsyncTask<String, Void, List<String>> {

    private List<TaskListener> myListeners = new ArrayList<TaskListener>();

    public void addListener(TaskListener tl) {
        myListeners.add(tl);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("GetListHashTask", "Create GetListHashTask");
    }

    @Override
    protected List<String> doInBackground(String... params) {
        try {
            Log.d("GetListHashTask", "Open Excute");
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

//            Object obj = restTemplate.getForObject(Url.GET_LIST_HASH, Object.class);
//            String hashList = restTemplate.getForObject(Url.GET_LIST_HASH, String.class);
//            Log.d("GetListHashTask", hashList.toString());
//            hashList.replace("[", "");
//            hashList.replace("]","");
//            return hashList.split(",");

            Object obj = restTemplate.getForObject(Url.GET_LIST_HASH, Object.class);
            List<String> arrays = (List<String>) obj;
            return arrays;
        } catch (Exception e) {
            Log.e("GetListHashTask", e.getMessage(), e);
        }
        return null;
    }

    @Override
    protected void onPostExecute(List<String> hashtagList) {
        super.onPostExecute(hashtagList);
        for (TaskListener tl : myListeners) {
            tl.onResultAvailable(HashListActivity.GET_LIST_HASH, hashtagList);
        }
        Log.d("GetListHashTask", "Done");
    }
}
