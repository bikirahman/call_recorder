package com.github.axet.callrecordingtest.services;

import android.content.Context;

public class OnExternalReceiver extends com.github.axet.androidlibrary.services.OnExternalReceiver {
    @Override
    public void onBootReceived(Context context) {
        super.onBootReceived(context);
        RecordingService.startIfEnabled(context);
    }
}
