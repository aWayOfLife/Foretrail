package com.thetripod.foretrail.Dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class MissingNearby extends Fragment {

    public static MissingNearby newInstance() {
        MissingNearby fragment = new MissingNearby();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

}
