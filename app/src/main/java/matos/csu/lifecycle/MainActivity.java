package matos.csu.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //class variables
    private Context context;
    private int duration = Toast.LENGTH_SHORT;

    //Matching GUI controls to Java objects
    private Button btnExit;
    private LinearLayout myScreen;
    private String PREFNAME = "myPrefFile1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //display the main screen
        setContentView(R.layout.activity_main);

        //wiring GUI controls and matching Java objects
        btnExit = (Button) findViewById(R.id.button1);
        myScreen = (LinearLayout)findViewById(R.id.myScreen1);

        //set GUI listeners, watchers,...
        btnExit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        
        //show the current state's name
        context = getApplicationContext();
        Toast.makeText(context, "onCreate", duration).show();
    } //onCreate

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(context, "onDestroy", duration).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //save state data (background color) for future use
        //??? saveStateData(chosenColor);

        Toast.makeText(context, "onPause", duration).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(context, "onRestart", duration).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(context, "onResume", duration).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //if appropriate, change background color to chosen value
        //??? updateMeUsingSavedStateData();

        Toast.makeText(context, "onStart", duration).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(context, "onStop", duration).show();
    }


} //Activity
