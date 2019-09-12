package com.example.loreentaskmnger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class Setting extends AppCompatActivity
{
    private SeekBar Seksize;
    private Button btnSave2;
    private Switch soot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Seksize=findViewById(R.id.Seksize);
        btnSave2=findViewById(R.id.btnSave2);
        soot=findViewById(R.id.soot);
    }
}
