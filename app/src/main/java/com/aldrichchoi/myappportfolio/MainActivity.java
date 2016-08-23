package com.aldrichchoi.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "";
                int duration = Toast.LENGTH_SHORT;

                switch (v.getId()){
                    case R.id.button:
                        text = "This will launch popular movies app";
                        break;
                    case R.id.button2:
                        text = "This will launch stock hawk app";
                        break;
                    case R.id.button3:
                        text = "This will launch build it bigger app";
                        break;
                    case R.id.button4:
                        text = "This will launch make your app material app";
                        break;
                    case R.id.button5:
                        text = "This will launch go obiquitous app";
                        break;
                    case R.id.button6:
                        text = "This will launch my capstone project app";
                        break;
                }
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        };

        Button popularMovies = (Button)findViewById(R.id.button);
        Button stockHawk = (Button)findViewById(R.id.button2);
        Button buildItBigger = (Button)findViewById(R.id.button3);
        Button makeYourAppMaterial = (Button)findViewById(R.id.button4);
        Button goObiquitous = (Button)findViewById(R.id.button5);
        Button capstone = (Button)findViewById(R.id.button6);

        popularMovies.setOnClickListener(listener);
        stockHawk.setOnClickListener(listener);
        buildItBigger.setOnClickListener(listener);
        makeYourAppMaterial.setOnClickListener(listener);
        goObiquitous.setOnClickListener(listener);
        capstone.setOnClickListener(listener);

    }

}
