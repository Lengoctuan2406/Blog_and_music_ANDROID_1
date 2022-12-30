package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bookinghotel.database.DatabaseHandler;
import com.example.bookinghotel.database._0_users;

public class LogIn extends AppCompatActivity {
    EditText _81, _82;
    TextView _84;
    Button _83;
    DatabaseHandler db = new DatabaseHandler(this);

    public void findViewById() {
        _84 = findViewById(R.id._84);
        _83 = findViewById(R.id._83);
        _81 = findViewById(R.id._81);
        _82 = findViewById(R.id._82);
    }

    public void setOnClickListener() {
        _83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _0_users user = db.checkAccount(_81.getText().toString(), _82.getText().toString());
                if(user.user_id != "" && user.name_client != "") {
                    db.logIn(user);
                    Toast toast = Toast.makeText(getApplicationContext(), "Log in successfully!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                    //chuyển màn hình
                    Intent i = new Intent(LogIn.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim._2_slide_center_to_left, R.anim._2_slide_right_to_center);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Incorrect account or password!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                    toast.show();
                }
            }
        });
        _84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LogIn.this, SignUp.class);
                startActivity(i);
            }
        });
    }

    public void others() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        findViewById();
        setOnClickListener();
        others();
    }
}