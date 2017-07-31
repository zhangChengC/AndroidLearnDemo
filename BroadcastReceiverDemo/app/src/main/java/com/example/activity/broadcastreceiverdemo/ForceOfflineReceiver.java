package com.example.activity.broadcastreceiverdemo;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/**
 * Created by duyh on 2017/7/26.
 */

public class ForceOfflineReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Warning");
        builder.setMessage("You are forced to be offline.Please try to login again.");
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityCollector.finishAll();
                Intent intent = new Intent(context,LoginActivity.class);
                context.startActivity(intent);
            }
        });
        builder.show();
    }
}
