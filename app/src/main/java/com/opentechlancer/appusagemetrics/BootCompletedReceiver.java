package com.opentechlancer.appusagemetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompletedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent serviceIntent = new Intent(context, AppUsageMetricsService.class);
        context.startService(serviceIntent);
    }
}
