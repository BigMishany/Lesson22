package com.bgw.lesson2.lesson2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends Activity {
    Button button;
    public static Intent createStartIntetn_1(Context context) {
        Intent intent = new Intent(context, Main2Activity.class);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Build.VERSION.SDK_INT >= 21) {
                   button.setText("Радость и счастье");
                } else {
                    button.setText("Боль и страдание");
                }
            }
        });

    }

}
