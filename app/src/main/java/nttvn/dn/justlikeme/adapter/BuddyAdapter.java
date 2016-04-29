package nttvn.dn.justlikeme.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import nttvn.dn.justlikeme.R;
import nttvn.dn.justlikeme.common.Constants;
import nttvn.dn.justlikeme.holder.BuddyHolder;
import nttvn.dn.justlikeme.model.Buddy;
import nttvn.dn.justlikeme.model.Hashtag;

/**
 * Created by NinHN on 3/11/16.
 */
public class BuddyAdapter extends RecyclerView.Adapter<BuddyHolder> {

    private Context mContext;
    private ArrayList<Buddy> buddyArrayList;

    public BuddyAdapter(Context mContext, ArrayList<Buddy> buddies) {
        this.mContext = mContext;
        this.buddyArrayList = buddies;
    }

    @Override
    public BuddyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_person, parent, false);

        BuddyHolder buddyHolder = new BuddyHolder(itemView);

        buddyHolder.initIMyViewHolderClicks(new BuddyHolder.IMyViewHolderClicks() {
            @Override
            public void onPotato(View caller) {

            }

            @Override
            public void onTomato(TextView textView) {

            }
        });

        return buddyHolder;
    }

    @Override
    public void onBindViewHolder(BuddyHolder holder, int position) {
        Buddy buddy = this.buddyArrayList.get(position);

        holder.textName.setText(buddy.getName());

        String txtHoder = Constants.BLANK;
        for (Hashtag tag :
                buddy.getHashtags()) {
            txtHoder += tag.getHash() + Constants.COMMA_SPACE;
        }
        txtHoder.substring(0, txtHoder.lastIndexOf(Constants.COMMA_SPACE) - 1);
        holder.textHash.setText(txtHoder);

    }

    @Override
    public int getItemCount() {
        return this.buddyArrayList.size();
    }


}