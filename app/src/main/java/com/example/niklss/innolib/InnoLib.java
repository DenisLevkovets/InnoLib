package com.example.niklss.innolib;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 02.02.2018.
 */

public class InnoLib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button search = (Button) findViewById(R.id.search);
        Button catalog = (Button) findViewById(R.id.catalog);
//        ImageView iview = (ImageView) findViewById(R.id.imageView2);
//        iview.setImageDrawable(Drawable.createFromPath("/app/src/main/res/drawable/inn.png"));
        catalog.setOnClickListener(clCatalog);

    }
        View.OnClickListener clCatalog = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InnoLib.this, Catalogs.class);
                startActivity(intent);
            }
        };
}

