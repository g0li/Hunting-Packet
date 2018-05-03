package com.forev.huntingpacket.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.forev.huntingpacket.R;

public class Login_fourth extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_fourth);
        setGreeting();
        findViewById(R.id.backarrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savePasswordFunction();
            }
        });
        editText = findViewById(R.id.password);
        findViewById(R.id.showpassword).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showHidePassword();
            }
        });

    }
    void setGreeting()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("Hunting Packet",MODE_PRIVATE);
        String name=sharedPreferences.getString("name","");
        TextView greetings=findViewById(R.id.textView5);
        greetings.setText("So "+name.split(" ")[0]+"! Let's setup your password");
    }
    void savePasswordFunction()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("Hunting Packet",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("password",editText.getText().toString());
        editor.apply();
        startActivity(new Intent(Login_fourth.this,Login_fifth.class));
    }
    void showHidePassword()
    {
        if(editText.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance()))
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        else         if(editText.getTransformationMethod().equals(PasswordTransformationMethod.getInstance()))
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

    }

}
