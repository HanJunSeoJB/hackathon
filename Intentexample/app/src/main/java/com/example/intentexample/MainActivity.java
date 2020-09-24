package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView rose;
    private TextView sf;
    private String str;
    private String str1;
    private Button btn_select1;
    private Button btn_select2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sf = (TextView)findViewById(R.id.sf);
        rose = (TextView)findViewById(R.id.rose);

        btn_select1 = (Button)findViewById(R.id.btn_select1);
        btn_select2 = (Button)findViewById(R.id.btn_select2);
        btn = (Button)findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("str", str);
                startActivity(intent);

            }
        });



    }
}