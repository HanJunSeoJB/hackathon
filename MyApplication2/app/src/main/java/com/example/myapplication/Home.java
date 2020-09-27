package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Home extends Fragment{

    public static Home newInstance(){
        return new Home();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        Button btn_luvpra = (Button)view.findViewById(R.id.btn_chu_flower);
        Button btn_dasan = (Button)view.findViewById(R.id.btn_sept_flower);

        btn_luvpra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity2)getActivity()).replaceFragment(Home_chu_flower.newInstance());
            }
        });

        btn_dasan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ((MainActivity2)getActivity()).replaceFragment(Home_sept_flower.newInstance());
            }
        });

        return view;

    }
}
