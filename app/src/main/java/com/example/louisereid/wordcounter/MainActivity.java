package com.example.louisereid.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private WordCounter wordCounter;

    private EditText enterWords;
    private Button countButton;
    private TextView textAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordCounter = new WordCounter();

        enterWords = (EditText) findViewById(R.id.enterWords);
        countButton = (Button) findViewById(R.id.countButton);
        textAnswer = (TextView) findViewById(R.id.textAnswer);
    }

    public void onButtonClick(View button){
        String words = enterWords.getText().toString();
//        wordCounter.addSentence(words);
//        textAnswer.setText(wordCounter.wordsSize());
        textAnswer.setText(wordCounter.numWords(words));
    }
}
