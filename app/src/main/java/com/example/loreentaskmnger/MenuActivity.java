package com.example.loreentaskmnger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    ImageView ivInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

         final ImageView ivInfo =findViewById(R.id.itmImageInfo);
        ivInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                PopupMenu popupMenu=new PopupMenu(MenuActivity.this,ivInfo);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MenuActivity.this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}
