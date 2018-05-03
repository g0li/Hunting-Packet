package com.forev.huntingpacket.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.forev.huntingpacket.R;

public class Login_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_third);
        findViewById(R.id.backarrow).setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View view) { onBackPressed();}});
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View view) { saveNameFunction();}});

    }
    void saveNameFunction()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("Hunting Packet",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        EditText editText=findViewById(R.id.password);
        editor.putString("name",editText.getText().toString());
        editor.apply();
        startActivity(new Intent(Login_third.this,Login_fourth.class));
    }
}
