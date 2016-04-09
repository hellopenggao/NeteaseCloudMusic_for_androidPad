package gp.neteasecloudmusic.proxy_playpanel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gp.neteasecloudmusic.R;

public class PlayPanelFragment extends Fragment {
    static PlayPanelFragment fragment;

    public PlayPanelFragment() {
        // Required empty public constructor
    }

    public static PlayPanelFragment getInstance(String param1, String param2) {
        if (fragment == null)
            fragment = new PlayPanelFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_play_panel, container, false);
    }

}
