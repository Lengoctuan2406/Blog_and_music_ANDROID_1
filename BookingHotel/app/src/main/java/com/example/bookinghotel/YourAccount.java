package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bookinghotel.database.DatabaseHandler;
import com.example.bookinghotel.database._0_users;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class YourAccount extends AppCompatActivity {
    ImageView icon_arrowback_accountFragment;
    EditText _130;
    TextView _125;
    Calendar calendar = Calendar.getInstance();
    DatabaseHandler db = new DatabaseHandler(this);

    public void findViewById() {
        icon_arrowback_accountFragment = findViewById(R.id._124);
        _130 = (EditText) findViewById(R.id._130);
        _125 = (TextView) findViewById(R.id._125);
    }

    public void setOnClickListener() {
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                updateCalender();
            }

            private void updateCalender(){
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
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_account);
        findViewById();
        setOnClickListener();
        others();
    }
}