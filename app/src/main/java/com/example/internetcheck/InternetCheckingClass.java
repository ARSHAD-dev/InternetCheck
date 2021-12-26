package com.example.internetcheck;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/*
** Created by ArshadKhan...
 */

import androidx.constraintlayout.widget.ConstraintLayout;

public class InternetCheckingClass {
    private Context context;

    public InternetCheckingClass(Context context) {
        this.context = context;
    }

    public boolean isConnectingToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

}
