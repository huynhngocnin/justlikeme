package nttvn.dn.justlikeme.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import nttvn.dn.justlikeme.R;

/**
 * Created by NamNV on 3/12/2016.
 * Author: IMicMic
 */
public class DialogCucko {
    public void actionCucko(Context context, final String name) {

        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_cucko);

        TextView tv_cucko = (TextView) dialog.findViewById(R.id.text_cucko_name);
        tv_cucko.setText(name);


        Button dialogButton = (Button) dialog.findViewById(R.id.btn_close);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                actionCuckoDetail();
            }
        });

        dialog.show();
    }

    private void actionCuckoDetail() {

    }
}
