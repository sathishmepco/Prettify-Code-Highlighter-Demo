package com.cdac.androidcodehighlighter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class CCodeFragment extends Fragment {

    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_c, container, false);
        webView = root.findViewById(R.id.webView);
        loadCode();
        return root;
    }

    private void loadCode(){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setInitialScale(200);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl("file:///android_asset/c_demo.html");
    }
}