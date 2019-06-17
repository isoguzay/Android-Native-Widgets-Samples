package com.ioay.androidnativewidgets.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.ioay.androidnativewidgets.R;

import java.util.ArrayList;

public class Main9Activity extends AppCompatActivity {

    private Spinner spinner;
    private Button buttonShow;
    private ArrayList<String> laptops = new ArrayList<String>();
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        spinner = findViewById(R.id.spinner);
        buttonShow = findViewById(R.id.button_main9);

        laptops.add("Apple");
        laptops.add("Hp");
        laptops.add("Dell");
        laptops.add("Asus");
        laptops.add("Msi");

        arrayAdapter = new ArrayAdapter<String>(Main9Activity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, laptops);

        spinner.setAdapter(arrayAdapter);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Item : " + spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Selected Item Now : " + laptops.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
