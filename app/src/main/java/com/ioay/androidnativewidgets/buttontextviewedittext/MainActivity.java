package com.ioay.androidnativewidgets.buttontextviewedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ioay.androidnativewidgets.R;

public class MainActivity extends AppCompatActivity {

    /*
     * Button - EditText - TextView
     * */

    private TextView textViewMain;
    private EditText editTextMain;
    private Button buttonMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMain = findViewById(R.id.textView_main);
        editTextMain = findViewById(R.id.editText_main);
        buttonMain = findViewById(R.id.button_main);

        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextMain.getText().toString();

                if (!TextUtils.isEmpty(value)) {
                    if (value.length() < 6) {
                        textViewMain.setText("At Least 6 char needed ! ");
                    } else {
                        textViewMain.setText(value);
                    }
                } else {
                    textViewMain.setText("No Input !");
                }
                editTextMain.setText("");
            }
        });
    }
}
