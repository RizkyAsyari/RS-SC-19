package com.example.siagakorona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvRumahSakit;
    private ArrayList<RumahSakit> list = new ArrayList<>();
    ImageView akun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRumahSakit = findViewById(R.id.rv_rs);
        rvRumahSakit.setHasFixedSize(true);

        list.addAll(RumahSakitData.getListData());
        showRecyclerList();

        akun = findViewById(R.id.iv_akun);
        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent akun = new Intent(MainActivity.this,AkunActivity.class);
                startActivity(akun);
            }
        });

    }
    private void showRecyclerList(){
        rvRumahSakit.setLayoutManager(new LinearLayoutManager(this));
        ListRumahSakitAdapter listHeroAdapter = new ListRumahSakitAdapter(list);
        rvRumahSakit.setAdapter(listHeroAdapter);
    }

}
