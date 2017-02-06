package com.example.admin.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = (MyView) findViewById(R.id.myView);
        myView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX();
                float y = event.getY();
                if(x >= 0 && x < (myView.getWidth()/2)){ // Left side
                    if(y > 0 && y < (myView.getHeight()/2)) // Section 1
                        Toast.makeText(MainActivity.this, "Section 1", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this, "Section 3", Toast.LENGTH_SHORT).show();
                }else{ // Right side
                    if(y > 0 && y < (myView.getHeight()/2)) // Section 2
                        Toast.makeText(MainActivity.this, "Section 2", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this, "Section 4", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });
    }
}
