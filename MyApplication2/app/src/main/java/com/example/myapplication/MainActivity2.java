package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {

    Button btn_home, btn_cate, btn_bag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_main2);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame, Home.newInstance()).commit();

        btn_home = (Button)findViewById(R.id.btn_home);
        btn_cate = (Button)findViewById(R.id.btn_cate);
        btn_bag = (Button)findViewById(R.id.btn_bag);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Home home = new Home();
                transaction.replace(R.id.frame, home);
                transaction.commit();
            }
        });

        btn_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Cate category = new Cate();
                transaction.replace(R.id.frame, category);
                transaction.commit();
            }
        });

        btn_bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }



    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment).commit();
    }

}
