package nttvn.dn.justlikeme.service;

import android.os.AsyncTask;
import android.util.Log;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nttvn.dn.justlikeme.common.Url;
import nttvn.dn.justlikeme.listener.TaskListener;

/**
 * Created by ninhn on 2016/03/12.
 */
public class PokeAcceptTask extends AsyncTask<String, Void, Boolean> {

    private List<TaskListener> myListeners = new ArrayList<TaskListener>();

    public void addListener(TaskListener tl) {
        myListeners.add(tl);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("PokeAcceptTask", "Create PokeAcceptTask");
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        for (TaskListener tl : myListeners) {
            tl.onResultAvailable(Url.KEY_POKE_ACCEPT, aBoolean);
        }
        Log.d("PokeAcceptTask", "Done");
    }

    @Override
    protected Boolean doInBackground(String... params) {
        try {
            Log.d("PokeAcceptTask", "Open Excute");
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

            HashMap<String, String> param = new HashMap<>();
            param.put("tokenSend", params[0]);
            param.put("tokenReceive", params[1]);
            param.put("pokeType", params[2]);
            restTemplate.postForEntity(Url.POKE_ACCEPT, null, Boolean.class, param);
            Log.d("PokeAcceptTask", "Requested");
            return false;
        } catch (Exception e) {
            Log.e("PokeAcceptTask", e.getMessage(), e);
        }
        return false;
    }
}
