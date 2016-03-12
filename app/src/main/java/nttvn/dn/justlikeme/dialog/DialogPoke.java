package nttvn.dn.justlikeme.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import nttvn.dn.justlikeme.MyApplication;
import nttvn.dn.justlikeme.R;
import nttvn.dn.justlikeme.listener.TaskListener;
import nttvn.dn.justlikeme.model.PokeType;
import nttvn.dn.justlikeme.service.PokeAcceptTask;

/**
 * Created by NamNV on 3/12/2016.
 * Author: IMicMic
 */
public class DialogPoke implements TaskListener {
    private Context context;

    public void actionPoke(Context context, final String yourToken, final String titleDialog, final String bodyDialog) {
        this.context = context;

        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_poke);

        TextView tv_titile = (TextView) dialog.findViewById(R.id.text_poke_name);
        tv_titile.setText(titleDialog);

        TextView tv_body = (TextView) dialog.findViewById(R.id.text_poke_hash);
        tv_body.setText(bodyDialog);

        Button dialogButton = (Button) dialog.findViewById(R.id.btn_poke);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                actionPokeDetail(yourToken);
            }
        });

        dialog.show();
    }

    private void actionPokeDetail(String yourToken) {
        String myToken = MyApplication.getInstance().getPrefManager().getBuddy().getToken();
        PokeAcceptTask taskPoke = new PokeAcceptTask();
        taskPoke.addListener(this);
        taskPoke.execute(myToken, yourToken, PokeType.POKE.toString());

    }

    @Override
    public void onResultAvailable(Object... objects) {
        Toast.makeText(this.context, this.context.getString(R.string.poke_sent), Toast.LENGTH_LONG).show();
    }
}
