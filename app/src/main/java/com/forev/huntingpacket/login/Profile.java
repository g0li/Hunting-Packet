package com.forev.huntingpacket.login;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.forev.huntingpacket.R;

public class Profile extends AppCompatActivity {
    String name,dob,email,phno;
    TextView nameTV,dobTV,emailTV,phnoTV;

    @Override   
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        SharedPreferences sb=getSharedPreferences("Hunting Packet",MODE_PRIVATE);
        name=sb.getString("name","Roshan\nSingh");
        email=sb.getString("email","iprogramyourapp@gmail.com");
        phno=sb.getString("phonenumber","+919087654321");
        dob=sb.getString("dob","14 October,1996");
        nameTV=findViewById(R.id.name);
        dobTV=findViewById(R.id.dob);
        emailTV=findViewById(R.id.email);
        phnoTV=findViewById(R.id.caller);
        nameTV.setText(name);
        dobTV.setText(dob);
        emailTV.setText(email);
        phnoTV.setText(phno);
        findViewById(R.id.exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}
