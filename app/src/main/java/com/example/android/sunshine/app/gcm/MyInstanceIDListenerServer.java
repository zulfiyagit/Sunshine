package com.example.android.sunshine.app.gcm;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by user on 08.06.2016.
 */
public class MyInstanceIDListenerServer extends InstanceIDListenerService {
    public static final String LOG_TAG = "MyInstanceIDLS";

    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent (this, RegistrationIntentService.class); // send Intent to RegistrationIntentService
        startService(intent);

    }


}
