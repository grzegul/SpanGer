package io.github.grzegul.spanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnPush;
    private TextView polishWord, spanishWord, germanWord;
    private static final String [] dbPolish = new String[]{"słowa", "wiosna", "lato", "jesień", "zima"};
    private static final String [] dbSpanish = new String []{"palabras", "primavera", "verano", "otońo", "invierno"};
    private static final String [] dbGerman = new String []{"?word", "Frühling", "Sommer", "Herbst", "Winter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPush = (Button) findViewById(R.id.btnPush);
        polishWord = (TextView) findViewById(R.id.polishWord);
        spanishWord = (TextView) findViewById(R.id.spanishWord);
        germanWord = (TextView) findViewById(R.id.germanWord);

        btnPush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = extractWords(randomWord());
                //String s = "wio la je";
                polishWord.setText(s.split(" ")[0]);
                spanishWord.setText(s.split(" ")[1]);
                germanWord.setText(s.split(" ")[2]);
            }
        });



    }

    public String extractWords(int index) {
        /*createDbPolish();
        createDbSpanish();
        createDbGerman();*/

        return dbPolish[index] + " " + dbSpanish[index] + " " + dbGerman[index];
    }


    public int randomWord() {
        Random random = new Random();
        int num = random.nextInt(5);
        return num;
    }
}
