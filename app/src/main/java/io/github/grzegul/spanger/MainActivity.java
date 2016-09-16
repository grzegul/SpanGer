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
    private static final Map<Integer, String> dbPolish = new HashMap<Integer, String>();
    private static void createDbPolish(){
        dbPolish.put(0, "słowa");
        dbPolish.put(1, "wiosna");
        dbPolish.put(2, "lato");
        dbPolish.put(3, "jesień");
        dbPolish.put(4, "zima");
    }
    private static final Map<Integer, String> dbSpanish = new HashMap<Integer, String>();
    private static void createDbSpanish(){
        dbSpanish.put(0, "palabras");
        dbSpanish.put(1, "primavera");
        dbSpanish.put(2, "verano");
        dbSpanish.put(3, "otońo");
        dbSpanish.put(4, "invierno");
    }
    private static final Map<Integer, String> dbGerman = new HashMap<Integer, String>();
    private static void createDbGerman(){
        dbGerman.put(0, "?word");
        dbGerman.put(1, "Frühling");
        dbGerman.put(2, "Sommer");
        dbGerman.put(3, "Herbst");
        dbGerman.put(4, "Winter");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        createDbPolish();
        createDbSpanish();
        createDbGerman();
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
        System.out.println("index" + index);

        return dbPolish.get(index) + " " + dbSpanish.get(index) + " " + dbGerman.get(index);
    }


    public int randomWord() {
        Random random = new Random();
        int num = random.nextInt(dbPolish.size());
        return num;
    }
}
