package com.example.hw33mounth;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment {

        private Button GO;
        private EditText editText;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fragment_main, container, false);
        }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GO = view.findViewById(R.id.btn_go);
        editText = view.findViewById(R.id.edit_text);
        GO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle chemodanchikKrasavhick = new Bundle();
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container , new SecondFragment()).addToBackStack("").commit();

            }
        });
    }
}