package com.thetripod.foretrail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;



public class EnterContactDetails extends AppCompatActivity {

    private EditText phoneNumber;
    private ImageView continueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_citizen_auth);
        phoneNumber=(EditText)findViewById(R.id.citizenPhone);
        continueButton=(ImageView) findViewById((R.id.citizen_continue));
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number =phoneNumber.getText().toString().trim();
                if(number.isEmpty()||number.length()<10) {
                    phoneNumber.setError("Enter number");
                    phoneNumber.requestFocus();
                    return;
                }
                String phonenumberfull="+91"+number;
                Intent intent=new Intent(EnterContactDetails.this,VerifyPhone.class);
                intent.putExtra("phonenumber",phonenumberfull);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {

        super.onStart();
        if(FirebaseAuth.getInstance().getCurrentUser()!=null)
        {
            Intent intent=new Intent(this,Welcome.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }
}