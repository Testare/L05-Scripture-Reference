package edu.byu.testare.scripturereferencel05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SelectorActivity extends AppCompatActivity {

    static String scriptureRef = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "Your favorite scripture is: ";
                s += ((EditText)findViewById(R.id.bookText)).getText();
                s += " " + ((EditText)findViewById(R.id.chapterNum)).getText();
                s += ":" + ((EditText)findViewById(R.id.verseNum)).getText();
                scriptureRef = s;
                startActivity(new Intent(SelectorActivity.this, DisplayActivity.class));
            }
        });
    }
}
