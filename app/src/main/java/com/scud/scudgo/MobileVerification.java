package com.scud.scudgo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MobileVerification extends Activity {

    Button requestOTP_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_activity);

        requestOTP_btn=findViewById(R.id.request_otp);

        requestOTP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MobileVerification.this,OTPScreen.class);
                startActivity(in);
            }
        });
    }
}
