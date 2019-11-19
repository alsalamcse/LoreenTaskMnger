package com.example.loreentaskmnger.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.example.loreentaskmnger.data.TasksAdapter;

public class MenuItem extends TasksAdapter {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    public MenuItem(@NonNull Context context) {
        super(context);
    }
}
