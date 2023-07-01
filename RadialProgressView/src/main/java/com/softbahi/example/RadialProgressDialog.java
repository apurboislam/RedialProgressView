package com.softbahi.example;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;

import com.softbahi.radialprogressview.R;

public class RadialProgressDialog {
    static ProgressDialog coreprog;
    public static void showRadialProgressDialog(Context contextx, boolean show){
        if (show) {
            if (coreprog == null) {
                coreprog = new ProgressDialog(contextx);
                coreprog.setCancelable(false);
                coreprog.setCanceledOnTouchOutside(false);
                coreprog.requestWindowFeature(1);
                coreprog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
           coreprog.show();
           coreprog.setContentView(R.layout.progress_dialog);
            ((LinearLayout) coreprog.findViewById(R.id.linear)).addView(new RadialProgressView(contextx));
        } else if (coreprog != null) {
            coreprog.dismiss();
        }

    }
}
