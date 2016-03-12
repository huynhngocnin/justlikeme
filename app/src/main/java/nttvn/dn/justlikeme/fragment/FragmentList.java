package nttvn.dn.justlikeme.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import nttvn.dn.justlikeme.MyApplication;
import nttvn.dn.justlikeme.R;
import nttvn.dn.justlikeme.adapter.BuddyAdapter;
import nttvn.dn.justlikeme.helper.DividerItemDecoration;
import nttvn.dn.justlikeme.listener.TaskListener;
import nttvn.dn.justlikeme.model.Buddy;
import nttvn.dn.justlikeme.service.GetListBuddyTask;

/**
 * Created by NinHN on 3/9/16.
 */
public class FragmentList extends Fragment implements TaskListener {

    private RecyclerView recyclerView;
    private BuddyAdapter buddyAdapter;
    private ArrayList<Buddy> buddyArrayList = new ArrayList<Buddy>();
    private ProgressDialog progressDialog;

    public FragmentList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = (RecyclerView) getActivity().findViewById(R.id.list_person);
        buddyAdapter = new BuddyAdapter(getContext(), buddyArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(buddyAdapter);

        //get data from server
        getBuddyList();

        buddyAdapter.notifyDataSetChanged();
    }


    private void getBuddyList() {
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.show();

        GetListBuddyTask taskGetListBuddy = new GetListBuddyTask();
        taskGetListBuddy.addListener(this);
        taskGetListBuddy.execute(MyApplication.getInstance().getPrefManager().getBuddy());
    }

    @Override
    public void onResultAvailable(Object... objects) {
        buddyArrayList = (ArrayList<Buddy>) objects[0];

        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }
}