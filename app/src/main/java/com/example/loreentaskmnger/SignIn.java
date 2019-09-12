package com.example.loreentaskmnger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
    private EditText edPassword,edemail;
    private Button btnsignin,btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        edemail=(EditText)findViewById(R.id.edemail);
        edPassword=(EditText)findViewById(R.id.edPassword);
        btnsignin=(Button)findViewById(R.id.btnsignin);
        btnsignup=(Button)findViewById(R.id.btnsignup);

    }
}
