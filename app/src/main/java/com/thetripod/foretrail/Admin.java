package com.thetripod.foretrail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private TextView cancel;
    private TextView continue_admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_admin_auth);
        username=(EditText)findViewById(R.id.admin_username);
        password=findViewById(R.id.password_admin);
        continue_admin=(TextView)findViewById(R.id.admin_continue_text);
        continue_admin.setClickable(true);
        continue_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.toString().trim().equals("admin")&&password.toString().trim().equals("admin"))
                {
                    Intent intent=new Intent(Admin.this,Welcome.class);

                    startActivity(intent);
                }
                else
                    return;
            }
        });


        cancel=findViewById(R.id.admin_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin.this,MainActivity.class);

                startActivity(intent);
            }
        });
}
}
