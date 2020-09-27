package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Cate_love extends Fragment {

    public static Cate_love newInstance(){

        return new Cate_love();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cate_love, container, false);
        Button btn_love_flower1 = (Button)view.findViewById(R.id.btn_love_flower1);

        btn_love_flower1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity2)getActivity()).replaceFragment(Cate_love_flower.newInstance());
            }
        });
        return view;
    }
}
