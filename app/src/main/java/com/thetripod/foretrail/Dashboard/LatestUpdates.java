package com.thetripod.foretrail.Dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class LatestUpdates  extends Fragment {

    public static LatestUpdates newInstance() {
        LatestUpdates fragment = new LatestUpdates();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

}
