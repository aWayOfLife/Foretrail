package com.thetripod.foretrail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.executor.TaskExecutor;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class VerifyPhone extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private ImageView signUpButton;
    private String verificationCode;
    private ProgressBar progressBar;
    private EditText otpCode;
    private TextView setNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_citizen_auth_otp);
        signUpButton=(ImageView) findViewById(R.id.citizen_sign_in);
        setNumber=findViewById(R.id.number);

        //progressBar=(ProgressBar)findViewById(R.id.progressBar);
        otpCode=(EditText)findViewById(R.id.citizenOTP);
        mAuth=FirebaseAuth.getInstance();
         String getPhoneNumber=getIntent().getStringExtra("phonenumber");
        setNumber.setText(getPhoneNumber);


        phoneVerificationCode(getPhoneNumber);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String otpEntered=otpCode.getText().toString().trim();
                if(otpEntered.isEmpty()||otpEntered.length()<6)
                {
                    otpCode.setError("enter the code..");
                    otpCode.requestFocus();
                    return;
                }

                verifyCode(otpEntered);
            }
        });
    }


    private void verifyCode(String code)
    {
        PhoneAuthCredential credential=PhoneAuthProvider.getCredential(verificationCode,code);
        signInWithCredential(credential);

    }

    private void signInWithCredential(PhoneAuthCredential credential) {

        mAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                    Intent intent=new Intent(VerifyPhone.this,ProfileActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(VerifyPhone.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });
    }


    private void phoneVerificationCode(String number)
    {
       // progressBar.setVisibility(View.VISIBLE);
        PhoneAuthProvider.getInstance().verifyPhoneNumber(number,60, TimeUnit.SECONDS, TaskExecutors.MAIN_THREAD,mCallback);
    }


    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallback= new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            verificationCode=s;
        }

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

            String code=phoneAuthCredential.getSmsCode();
            if(code!=null)
            {

                otpCode.setText(code);
                verifyCode(code);
            }
        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {

            Toast.makeText(VerifyPhone.this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    };



}
