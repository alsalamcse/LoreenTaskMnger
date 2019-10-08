package com.example.loreentaskmnger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        Thread th=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(3*1000);
                    FirebaseAuth auth=FirebaseAuth.getInstance();

                    if (auth.getCurrentUser()==null|| auth.getCurrentUser().getEmail()==null)
                    {
                        Intent i=new Intent(getApplication(),SignIn.class);
                        startActivity(i);
                        finish();
                    }
                    else
                    {
                        Intent i=new Intent(getApplication(),MainTasksActivity.class);
                        startActivity(i);
                        finish();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        th.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
