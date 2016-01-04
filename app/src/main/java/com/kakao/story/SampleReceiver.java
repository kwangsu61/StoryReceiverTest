package com.kakao.story;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by kwangsu on 2016. 1. 4..
 */
public class SampleReceiver extends BroadcastReceiver {
    public static final String ACTION_SAMPLE = "com.kakao.intent.action.ACTION_SAMPLE";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("StorySample", "onReceive " + intent);

        if (ACTION_SAMPLE.equals(intent.getAction())) {
            Toast.makeText(context, ACTION_SAMPLE + " Received " + context.getPackageName(), Toast.LENGTH_LONG).show();
        }
    }
}
