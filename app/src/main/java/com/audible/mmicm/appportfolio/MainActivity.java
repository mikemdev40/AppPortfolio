package com.audible.mmicm.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        Button button = (Button)view;
        String buttonName = button.getText().toString();
        Log.d("button name", "the button pressed was" + buttonName);
        Toast.makeText(this, "This button will launch " + buttonName, Toast.LENGTH_SHORT).show();
    }
}
