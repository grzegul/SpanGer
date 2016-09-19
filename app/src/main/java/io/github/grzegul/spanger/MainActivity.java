package io.github.grzegul.spanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnPush;
    private TextView polishWord, spanishWord, germanWord;
    private static final String [] dbPolish = new String[]{"słowa", "wiosna", "lato", "jesień", "zima"};
    private static final String [] dbSpanish = new String []{"palabras", "primavera", "verano", "otońo", "invierno"};
    private static final String [] dbGerman = new String []{"Worte", "Frühling", "Sommer", "Herbst", "Winter"};

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
                String[] komplet = extractWords(randomWord());
                polishWord.setText(komplet[0]);
                spanishWord.setText(komplet[1]);
                germanWord.setText(komplet[2]);
            }
        });
    }

    public String[] extractWords(int index) {
        //String file = TextFile.read("dBs.txt");
        //TreeSet<String> words = new TreeSet<String>(new TextFile("dBs.txt", "\\W+"));
        // Display the capitalized words:
        //System.out.println(file);
        String[] komplet = new String[3];
        komplet[0] = dbPolish[index];
        komplet[1] = dbSpanish[index];
        komplet[2] = dbGerman[index];

        return komplet;
    }


    public int randomWord() {
        Random random = new Random();
        int num = random.nextInt(dbPolish.length);
        return num;
    }
}
