package com.example.loreentaskmnger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class AddTask extends AppCompatActivity
{
    private EditText edTitle;
    private EditText edSubject;
    private SeekBar sbimportant;
    private Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        edTitle=(EditText)findViewById(R.id.edTitle);
        edSubject=(EditText)findViewById(R.id.edSubject);
        sbimportant=(SeekBar)findViewById(R.id.sbimportant);
        btnsave=(Button)findViewById(R.id.btnsave);
        //btnsave.setOnClickListener((view) {dataHandler();


    }


}
