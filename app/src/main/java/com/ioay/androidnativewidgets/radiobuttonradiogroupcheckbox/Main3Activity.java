package com.ioay.androidnativewidgets.radiobuttonradiogroupcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.ioay.androidnativewidgets.R;

public class Main3Activity extends AppCompatActivity {

    private CheckBox checkBoxLang1, checkBoxLang2, checkBoxLang3;
    private RadioButton radioButtonLang1, radioButtonLang2, radioButtonLang3;
    private Button buttonMain3;
    private String stringResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        checkBoxLang1 = findViewById(R.id.checkBox_lang1);
        checkBoxLang2 = findViewById(R.id.checkBox_lang2);
        checkBoxLang3 = findViewById(R.id.checkBox_lang3);

        radioButtonLang1 = findViewById(R.id.radioButton_lang1);
        radioButtonLang2 = findViewById(R.id.radioButton_lang2);
        radioButtonLang3 = findViewById(R.id.radioButton_lang3);

        buttonMain3 = findViewById(R.id.button_main3);

        buttonMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxLang1.isChecked()) {
                    stringResult = stringResult + " Java";
                }
                if (checkBoxLang2.isChecked()) {
                    stringResult = stringResult + " React Native";
                }
                if (checkBoxLang3.isChecked()) {
                    stringResult = stringResult + " Flutter";
                }

                Toast.makeText(Main3Activity.this, stringResult, Toast.LENGTH_LONG).show();
                stringResult = "";
            }
        });

        radioButtonLang3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("Check Status : Turkey", String.valueOf(isChecked));
            }
        });
    }
}
