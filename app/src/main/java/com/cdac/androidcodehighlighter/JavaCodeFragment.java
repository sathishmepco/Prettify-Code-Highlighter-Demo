package com.cdac.androidcodehighlighter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class JavaCodeFragment extends Fragment {

    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_java, container, false);
        webView = root.findViewById(R.id.webView);
        loadCode();
        return root;
    }

    private void loadCode(){
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setLoadWithOverviewMode(true);
//        webView.getSettings().setUseWideViewPort(true);
//        webView.setScrollContainer(false);
        float density = getActivity().getResources().getDisplayMetrics().density;
        int initialScaleLevel = 100;
        if(density == 3){
            initialScaleLevel = 190;
        }else if(density == 2){
            initialScaleLevel = 130;
        }else if(density == 4){
            initialScaleLevel = 240;
        }
        webView.setInitialScale(initialScaleLevel);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl("file:///android_asset/java_demo.html");
    }
}