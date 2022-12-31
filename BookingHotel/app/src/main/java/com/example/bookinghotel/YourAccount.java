package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.bookinghotel.database.DatabaseHandler;
import com.example.bookinghotel.database._0_users;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class YourAccount extends AppCompatActivity {
    ImageView icon_arrowback_accountFragment;
    EditText _130, _128, _132, _137;
    TextView _125;
    RadioButton _134, _135;
    Calendar calendar = Calendar.getInstance();
    DatabaseHandler db = new DatabaseHandler(this);

    public void findViewById() {
        icon_arrowback_accountFragment = findViewById(R.id._124);
        _130 = (EditText) findViewById(R.id._130);
        _125 = (TextView) findViewById(R.id._125);
        _128 = findViewById(R.id._128);
        _132 = findViewById(R.id._132);
        _137 = findViewById(R.id._137);
        _134 = findViewById(R.id._134);
        _135 = findViewById(R.id._135);
    }

    public void setOnClickListener() {
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                String Format = "dd/MM/yyyy";
                SimpleDateFormat sdf = new SimpleDateFormat(Format, Locale.TAIWAN);

                _130.setText(sdf.format(calendar.getTime()));
            }
        };
        _130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(YourAccount.this, date, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        icon_arrowback_accountFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(YourAccount.this, MainActivity.class);
                i.putExtra("fragment", 4);
                startActivity(i);
            }
        });
    }

    public void others() {
        SQLiteDatabase db = new DatabaseHandler(this).getWritableDatabase();
        String selectQuery = "SELECT name_client, date_of_birth_client" +
                ", email_client, phone_client, gender_client " +
                "FROM users WHERE role_client='login'";
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            _128.setText(cursor.getString(0));
            _130.setText(cursor.getString(1));
            _132.setText(cursor.getString(2));
            _137.setText(cursor.getString(3));
            if(cursor.getString(4) == "Nam"){
                _135.setChecked(true);
            } else {
                _134.setChecked(true);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_account);
        findViewById();
        others();
        setOnClickListener();
    }
}