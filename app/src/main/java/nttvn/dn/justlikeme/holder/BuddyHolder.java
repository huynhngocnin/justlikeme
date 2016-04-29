package nttvn.dn.justlikeme.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nttvn.dn.justlikeme.R;

/**
 * Created by ninhn on 2016/03/11.
 */
public class BuddyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView viewNewPoint, textName, textHash, textPoke;
    public IMyViewHolderClicks mListener;

    public BuddyHolder(View view) {
        super(view);
        viewNewPoint = (TextView) view.findViewById(R.id.view_new_point);
        textName = (TextView) view.findViewById(R.id.text_person_name);
        textHash = (TextView) view.findViewById(R.id.text_person_hashtag);
        textPoke = (TextView) view.findViewById(R.id.text_poke);
        textPoke.setOnClickListener(this);
        view.setOnClickListener(this);
    }

    public void initIMyViewHolderClicks( IMyViewHolderClicks listener){
        mListener = listener;
    }

    @Override
    public void onClick(View view) {
        if (view instanceof TextView) {
            mListener.onTomato((TextView) view);
        } else {
            mListener.onPotato(view);
        }
    }

    public static interface IMyViewHolderClicks {
        public void onPotato(View caller);
        public void onTomato(TextView textView);
    }
}