package android.example.miwok3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //Set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the {@link NumbersActivity}
                Intent numberIntent = new Intent (MainActivity.this, NumbersActivity.class);
                //Start the new activity
                startActivity(numberIntent);
            }


        });

        // Find the view that shows the family category
        TextView family = (TextView) findViewById(R.id.family);
        //Set a click listener on that view
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent (MainActivity.this, FamilyActivity.class);
                //Start the new activity
                startActivity(familyIntent);
            }


        });

        // Find the view that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //Set a click listener on that view
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent (MainActivity.this,PhrasesActivity.class);
                //Start the new activity
                startActivity(phrasesIntent);
            }


        });

        // Find the view that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        //Set a click listener on that view
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent (MainActivity.this, ColorsActivity.class);
                //Start the new activity
                startActivity(colorsIntent);
            }


        });
    }
}