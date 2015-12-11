package com.motorolasolutions.echee.simpleintercepttouchevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class TouchEventActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_event);

        final Button btnClickMe = (Button) findViewById(R.id.btnClickMe);

        btnClickMe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnClickMe.setText("Down");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnClickMe.setText("Click Me");
                }
                return true;
            }
        });
    }
}
