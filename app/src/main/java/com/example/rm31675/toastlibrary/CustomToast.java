package com.example.rm31675.toastlibrary;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by rm31675 on 17/12/2016.
 */
public class CustomToast {
    public static void showWarning(Activity activity, String texto) {
        showMessage(activity, R.layout.toast_atencao, texto);
    }

    public static void showInfo(Activity activity, String texto) {
        showMessage(activity, R.layout.toast_info, texto);
    }

    private static void showMessage(Activity activity, int layout, String texto) {
        Context context = activity;
        LayoutInflater inflater = activity.getLayoutInflater();

        View customToastroot =inflater.inflate(layout, null);

        TextView textview1 = (TextView) customToastroot.findViewById(R.id.textView1);

        Toast customtoast = new Toast(context);

        textview1.setText(texto);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL |
                Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
}
