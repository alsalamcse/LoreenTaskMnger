package com.example.loreentaskmnger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler();
            }
        });




    }

    private void dataHandler()
    {
        String firstname=edFirstName.getText().toString();
        String lastname=edLastName.getText().toString();
        String phone=edPhone.getText().toString();
        String email=edEmail.getText().toString();
        String password=edPasssword.getText().toString();
        String RewitePassword=edRewitePassword.getText().toString();
        boolean isOk=true;
        if (email.length()<4 || email.indexOf('@')<0 || email.indexOf('.')<0)
        {
            edEmail.setError("wrong Email");
            isOk=false;
        }
        if (password.length()<8 || password.equals(RewitePassword)==false)
        {
            edRewitePassword.setError("Have to be at least 8 char and the same password");
            edPasssword.setError("Have to be at least 8 char and the same password");
            isOk=false;
        }
        if (firstname.length()==0)
        {
            edFirstName.setError("enter name");
            isOk=false;
        }
        if (isOk)
        {

        }
    }
}
