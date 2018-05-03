package com.forev.huntingpacket.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.forev.huntingpacket.R;

public class Login_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_first);
        findViewById(R.id.skipper).setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View view) {skipFunction();}});
        findViewById(R.id.getstarted).setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View view) {getStarted();}});
    }
    void skipFunction()
    {
        finish();
    }
    void getStarted()
    {
        startActivity(new Intent(Login_first.this,Login_second.class));
        Toast.makeText(this, "Get Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        skipFunction();
    }
}
