package com.ioay.androidnativewidgets.timepickerdatepicker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.ioay.androidnativewidgets.R;
import com.ioay.androidnativewidgets.buttontextviewedittext.MainActivity;

import java.util.Calendar;

public class Main7Activity extends AppCompatActivity {

    private EditText editTextTime, editTextDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        editTextTime = findViewById(R.id.editText_time);
        editTextDate = findViewById(R.id.editText_date);

        editTextTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(Main7Activity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        editTextTime.setText(hourOfDay + " : " + minute);
                    }
                }, hour, minute, true);

                timePickerDialog.setTitle("Please Choose The Time");
                timePickerDialog.setButton(TimePickerDialog.BUTTON_POSITIVE, "Set", timePickerDialog);
                timePickerDialog.setButton(TimePickerDialog.BUTTON_NEGATIVE, "Cancel", timePickerDialog);
                timePickerDialog.show();
            }
        });

        editTextDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(calendar.YEAR);
                int month = calendar.get(calendar.MONTH);
                int day = calendar.get(calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(Main7Activity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        editTextDate.setText(year + "/" + month + "/" + dayOfMonth);
                    }
                }, year, month, day);

                datePickerDialog.setTitle("Please Choose The Date");
                datePickerDialog.setButton(TimePickerDialog.BUTTON_POSITIVE, "Set", datePickerDialog);
                datePickerDialog.setButton(TimePickerDialog.BUTTON_NEGATIVE, "Cancel", datePickerDialog);
                datePickerDialog.show();

            }
        });

    }
}
