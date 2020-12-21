package com.example.vote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<String, Integer> votes = new HashMap<>();
        final Button Jbutton = findViewById(R.id.bJohn);
        final Button Mbutton = findViewById(R.id.bMary);
        final Button Sbutton = findViewById(R.id.bSteve);
        final Button Tbutton = findViewById(R.id.bTally);
        final TextView textOutput = findViewById(R.id.textView);
        votes.put("John",0);
        votes.put("Mary",0);
        votes.put("Steve",0);
        Jbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Integer currentVotes = votes.get("John");
                currentVotes += 1;
                votes.put("John", currentVotes);
            }
        });
        Mbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Integer currentVotes = votes.get("Mary");
                currentVotes += 1;
                votes.put("Mary", currentVotes);
            }
        });
        Sbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Integer currentVotes = votes.get("Steve");
                currentVotes += 1;
                votes.put("Steve", currentVotes);
            }
        });
        Tbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Integer JVotes = votes.get("John");
                Integer MVotes = votes.get("Mary");
                Integer SVotes = votes.get("Steve");
                if (JVotes > MVotes){
                    if (JVotes > SVotes){
                        textOutput.setText("Jonh Wins!");
                    }
                    else if (JVotes == SVotes){
                        textOutput.setText("Jonh and Steve Draw!");
                    }
                    else {
                        textOutput.setText("Steve Wins!");
                    }
                }
                else if (JVotes == MVotes && JVotes > SVotes){
                    textOutput.setText("Mary and John Draw!");
                }
                else {
                    if (MVotes > SVotes){
                        textOutput.setText("Mary Wins!");
                    }
                    else if (MVotes == SVotes){
                        textOutput.setText("Mary and Steve Draw!");
                    }
                    else {
                        textOutput.setText("Steve Wins!");
                    }
                }
            }
        });



    }
}