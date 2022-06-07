package com.example.restapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.restapp.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button nButton;
    private ActivityMainBinding binding;
    private final List<String> mensajes = Arrays.asList(
            "Hola Como estas?",
            "Habia una vez un perro",
            "Se cayo y se pego",
            "jsjsjsjs",
            "alla en la fuente",
            "habia un chorrito",
            "se hacia grandote",
            " y se hacia chiquito"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView = findViewById(R.id.Saludo);
        nButton = findViewById(R.id.btn1);

        mTextView.setText(mensajes.get(1));
    }
}