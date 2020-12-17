package com.example.mybottomnavigationactivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentEmail extends Fragment {
    private String tag="TAG";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"FragmentEmail: onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(tag,"FragmentEmail: onCreateView");
        return inflater.inflate(R.layout.fragment_email, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(tag,"FragmentEmail: onCreatedView");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(tag,"FragmentEmail: onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag,"FragmentEmail: onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag,"FragmentEmail: onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag,"FragmentEmail: onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag,"FragmentEmail: onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(tag,"FragmentEmail: onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag,"FragmentEmail: onDestroy");
    }
}