package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Cate extends Fragment{

    public static Cate newInstands(){
        return new Cate();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.categori, container, false);
        Button btn_cate_love = (Button)view.findViewById(R.id.btn_cate_love);
        Button btn_cate_thanks = (Button)view.findViewById(R.id.btn_cate_thanks);

        btn_cate_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity2)getActivity()).replaceFragment(Cate_love.newInstance());
            }
        });
        btn_cate_thanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity2)getActivity()).replaceFragment(Cate_thanks.newInstance());
            }
        });

        return view;

    }
}
