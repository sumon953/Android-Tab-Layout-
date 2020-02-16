package com.example.tablayoutdemo.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tablayoutdemo.R;

public class Bangladesh extends Fragment {

    EditText first,secound;
    Button button;
    TextView result;
    int res;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.bangla,container, false);

        first = view.findViewById(R.id.first);
        secound = view.findViewById(R.id.secound);
        button = view.findViewById(R.id.click);
        result = view.findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mynum1= first.getText().toString();
                final int mnum1=Integer.parseInt(mynum1);

                String mynum2=secound.getText().toString();
                final int mnum2=Integer.parseInt(mynum2);

                res = mnum1+mnum2;
                result.setText(Integer.toString(res));
            }
        });


        return view;


    }



}
