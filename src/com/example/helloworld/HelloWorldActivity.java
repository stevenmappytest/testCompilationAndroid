package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        TextView text = new TextView(this);
        text.setText("Hello World !");
        setContentView(text);
    }
}
