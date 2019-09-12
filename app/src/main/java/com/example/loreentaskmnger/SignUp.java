package com.example.loreentaskmnger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity
{
    private EditText edFirstName,edLastName,edPhone,edEmail,edPasssword,edRewitePassword;
    private Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edFirstName=(EditText)findViewById(R.id.edFirstName);
        edLastName=(EditText)findViewById(R.id.edLastName);
        edPhone=(EditText)findViewById(R.id.edPhone);
        edEmail=(EditText)findViewById(R.id.edEmail);
        edPasssword=(EditText)findViewById(R.id.edPassword);
        edRewitePassword=(EditText)findViewById(R.id.edRewitePassword);
        btnsave=(Button)findViewById(R.id.btnsave);

    }
}
