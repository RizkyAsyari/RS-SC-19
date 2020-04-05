package com.example.siagakorona;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailRumahSakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rumah_sakit);

        Glide.with(this)
                .load(getIntent().getIntExtra("photo",0))
                .into((ImageView)findViewById(R.id.civ_rs));

        ((TextView)findViewById(R.id.tv_rs_name)).setText(getIntent().getStringExtra("name"));
        ((TextView)findViewById(R.id.tv_rs_detail)).setText(getIntent().getStringExtra("detail"));

    }
}
