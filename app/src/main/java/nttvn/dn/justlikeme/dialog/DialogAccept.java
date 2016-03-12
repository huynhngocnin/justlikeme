package nttvn.dn.justlikeme.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import nttvn.dn.justlikeme.MyApplication;
import nttvn.dn.justlikeme.R;
import nttvn.dn.justlikeme.listener.TaskListener;
import nttvn.dn.justlikeme.model.PokeType;
import nttvn.dn.justlikeme.service.PokeAcceptTask;

/**
 * Created by NamNV on 3/12/2016.
 * Author: IMicMic
 */
public class DialogAccept implements TaskListener {
    private Context context;

    public void actionAccept(Context context, final String yourToken, final String name, final String hash) {
        this.context = context;
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_accept);

        TextView tv_txtDA1 = (TextView) dialog.findViewById(R.id.text_accept_name);
        tv_txtDA1.setText(name);

        TextView tv_txtDA2 = (TextView) dialog.findViewById(R.id.text_accept_hash);
        tv_txtDA2.setText(hash);


        Button btn_accept = (Button) dialog.findViewById(R.id.btn_accept);
        btn_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                actionAcceptDetail(yourToken);
            }
        });

        Button btn_cancel = (Button) dialog.findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                actionCancelDetail();
            }
        });
        dialog.show();
    }

    private void actionAcceptDetail(String yourToken) {
        String myToken = MyApplication.getInstance().getPrefManager().getBuddy().getToken();
        PokeAcceptTask taskAccept = new PokeAcceptTask();
        taskAccept.addListener(this);
        taskAccept.execute(myToken, yourToken, PokeType.ACCEPT.toString());
    }

    private void actionCancelDetail() {
    }

    @Override
    public void onResultAvailable(Object... objects) {
       
    }
}
