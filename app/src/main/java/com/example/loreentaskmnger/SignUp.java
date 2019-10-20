package com.example.loreentaskmnger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

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
            createAcount(email,password,firstname,lastname,phone);

        }
    }

    private void createAcount(String email, String password, String firstname, String lastname, String phone)
    {
        FirebaseAuth auth= FirebaseAuth.getInstance();
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    Toast.makeText(SignUp.this, "sign up Successful", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else
                {
                    edEmail.setError("sign up up failed");
                }
            }
        });
    }
}
