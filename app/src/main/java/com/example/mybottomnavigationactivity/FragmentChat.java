package com.example.mybottomnavigationactivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentChat extends Fragment {
    private String tag="TAG";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"FragmentChat: onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(tag,"FragmentChat: onCreateView");
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(tag,"Fragment: onCreatedView");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(tag,"FragmentChat: onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag,"FragmentChat: onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag,"FragmentChat: onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag,"FragmentChat: onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag,"FragmentChat: onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(tag,"FragmentChat: onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag,"FragmentChat: onDestroy");
    }
}