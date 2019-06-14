package com.ioay.androidnativewidgets.togglebuttonswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.ioay.androidnativewidgets.R;

public class Main2Activity extends AppCompatActivity {
    /*
    * Toggle Button - Switch
    * */

    private ToggleButton toggleButtonMain2;
    private Switch aSwitchMain2;
    private Button buttonMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toggleButtonMain2 = findViewById(R.id.toggleButton_main2);
        aSwitchMain2 = findViewById(R.id.switch_main2);
        buttonMain2 = (Button) findViewById(R.id.button_main2);

        buttonMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean switchStatus = aSwitchMain2.isChecked();
                boolean toggleStatus = toggleButtonMain2.isChecked();

                Toast.makeText(getApplicationContext(), "Switch Status : " + switchStatus + "\n"
                        + "Toggle Status : " + toggleStatus, Toast.LENGTH_LONG).show();
            }
        });

        aSwitchMain2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(Main2Activity.this, "Switch Status : " + isChecked, Toast.LENGTH_LONG).show();
                Log.e("Switch Status ", String.valueOf(isChecked));
            }
        });

        toggleButtonMain2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("Toggle Status", String.valueOf(isChecked));
            }
        });
    }
}
