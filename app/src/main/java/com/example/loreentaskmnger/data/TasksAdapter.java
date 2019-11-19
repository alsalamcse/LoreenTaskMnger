package com.example.loreentaskmnger.data;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.loreentaskmnger.R;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

public abstract class TasksAdapter extends ArrayAdapter<MyTask>
{

    public TasksAdapter(@NonNull Context context)
    {
        super(context, R.layout.taskitem);
    }

    public abstract TasksAdapter(@NonNull Context context);

    public abstract TasksAdapter(@NonNull Context context);

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View vitem= LayoutInflater.from(getContext()).inflate(R.layout.taskitem,parent,false);
        final TextView tvTitle=vitem.findViewById(R.id.itmTvTitle);
        TextView tvSubject=vitem.findViewById(R.id.itmTvSubject);
        RatingBar rbPrio=vitem.findViewById(R.id.itmRatingBar);
        CheckBox chIsComplete=vitem.findViewById(R.id.itmChbxlsCompleted);
        //getting data source
        final ImageView ivInfo =vitem.findViewById(R.id.itmImageInfo);
        final MyTask myTask = getItem(position);

        chIsComplete.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    //todo delete this item
                    FirebaseUtils.getReference().child(myTask.getKey()).removeValue(new DatabaseReference.CompletionListener() {
                        @Override
                        public void onComplete(@Nullable DatabaseError databaseError, @NonNull DatabaseReference databaseReference) {
                            if (databaseError==null)
                            {
                                Toast.makeText(getContext(), "delete", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(getContext(), "not delete", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });

        ivInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               //PopupMenu popup = new PopupMenu(TasksAdapter.this,ivInfo);
              //  popup.getMenuInflater().inflate(R.menu.);
                Toast.makeText(getContext(), "sucessful", Toast.LENGTH_SHORT).show();
            }
        });
        //connect item view to data source
        tvTitle.setText(myTask.getTittle());
        tvSubject.setText(myTask.getSubject());
        rbPrio.setRating(myTask.getImportant());
        chIsComplete.setChecked(false);
        return vitem;
    }

    protected abstract void onCreate(Bundle savedInstanceState);
}
