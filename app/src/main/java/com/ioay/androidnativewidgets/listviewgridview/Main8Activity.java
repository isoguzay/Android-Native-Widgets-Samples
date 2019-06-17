package com.ioay.androidnativewidgets.listviewgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.ioay.androidnativewidgets.R;

import java.util.ArrayList;

public class Main8Activity extends AppCompatActivity {

    private GridView listView;
    private ArrayList<String> laptops = new ArrayList<String>();
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        listView = findViewById(R.id.listview_main8);

        laptops.add("Apple");
        laptops.add("Hp");
        laptops.add("Dell");
        laptops.add("Asus");
        laptops.add("Msi");

        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                laptops);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                laptops.get(position);

                Toast.makeText(getApplicationContext(),(position+1) +" - List Item : " + laptops.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
