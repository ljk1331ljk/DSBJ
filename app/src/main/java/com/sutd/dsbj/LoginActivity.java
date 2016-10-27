package com.sutd.dsbj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view){
        Intent intent = new Intent(getApplicationContext(), EventsActivity.class);
        startActivity(intent);

    }
    public void forgetpassword(View view){

    }

}
