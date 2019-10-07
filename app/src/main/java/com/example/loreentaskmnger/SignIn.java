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

public class SignIn extends AppCompatActivity {
    private EditText edPassword,edemail;
    private Button btnsignin,btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        edemail = (EditText) findViewById(R.id.edemail);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnsignin = (Button) findViewById(R.id.btnsignin);
        btnsignup = (Button) findViewById(R.id.btnsignup);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent in=new Intent(getApplication(),MainTasksActivity.class);
              startActivity(in);
                dataHandler();

            }
        });


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplication(),SignUp.class);
                startActivity(i);

              //  dataHandler();
            }
        });
    }

            private void dataHandler() {
                String email =edemail .getText().toString();
                String pasword= edPassword.getText().toString();
                boolean isok=true;
                if (email.length()<4)
              {
                   edemail.setError("Email length Error");
                    isok=false;
                }
                if (email.indexOf("@")<0|| email.indexOf(".")<0) {
                    edemail.setError("email wrong format ");
                   isok = false;
                }
               if (pasword.length()<8)
                {
                    edPassword.setError("password length error");
                    isok=false;
               }
               // if (isValidEmailAddress(email)==false)
              //  {
              //      edemail.setError("Invalid Email");
              //      isok=false;
                }
            //    if (isok)
              //  {
              //     singIn(email,pasword);
             //   }
           // }
            public boolean isValidEmailAddress(String email) {
                String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
                java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
                java.util.regex.Matcher m = p.matcher(email);
                return m.matches();


        }
        private void singIn(String email , String password)
        {
            FirebaseAuth auth= FirebaseAuth.getInstance();
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        //todo go to main screen(all task activity)
                        //Toast.makeText(SignIn.this, " Sign successful.", Toast.LENGTH_SHORT).show();
                     //Intent i=new Intent(SignIn.this,TempAllTaskActivity.class);
                        Intent i=new Intent(getApplication(),MainTasksActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        edemail.setError("email or password is wrong");
                        //Toast.makeText(SignIn.this,"signIn faild."+)
                    }
                }
            });
        }


}
