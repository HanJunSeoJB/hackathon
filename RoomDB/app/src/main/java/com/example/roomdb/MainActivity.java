package com.example.roomdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText text;
    private TextView result;
    private int id = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.text);
        result = (TextView)findViewById(R.id.result);

        final AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "flower-db")
                .allowMainThreadQueries()
                .build();

        result.setText(db.flowerDao().getAll().toString());
        findViewById(R.id.add_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.flowerDao().insert(new flower(text.getText().toString()));
                result.setText(db.flowerDao().getAll().toString());
            }
        });

        findViewById(R.id.del_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.flowerDao().delete(flower);
                id++;
            }
        });

    }
}