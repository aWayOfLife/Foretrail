package com.thetripod.foretrail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity{

    private EditText name;
    private ImageView nameContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_citizen_profile);
        name=(EditText)findViewById(R.id.citizen_Name);
        nameContinue=findViewById(R.id.citizen_name_continue);
        nameContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProfileActivity.this,Welcome.class);
                intent.putExtra("name",name.getText().toString().trim());
                startActivity(intent);
            }
        });
        }
}
