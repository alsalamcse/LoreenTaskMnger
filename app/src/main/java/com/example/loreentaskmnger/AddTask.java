package com.example.loreentaskmnger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import com.google.android.gms.common.data.DataBufferSafeParcelable;

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

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler();
            }
        });


    }

    private void dataHandler()
    {
        String title=edTitle.getText().toString();
        String subject=edSubject.getText().toString();
        int seekbar=sbimportant.getProgress();
        boolean isok=true;


        if (title.length()<1)
        {
            edTitle.setError("title length Error");
            isok=false;
        }
        if (subject.length()<1)
        {
            edSubject.setError("subject length Error");
            isok=false;
        }
    }


}
