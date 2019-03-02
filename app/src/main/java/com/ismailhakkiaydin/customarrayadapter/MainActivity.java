package com.ismailhakkiaydin.customarrayadapter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView ulkelerListesi;

    String[] ulkeAdlari;
    String[] ulkeTanimlari;
    int[] bayrakResimleri = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources resources = getResources();
        ulkeAdlari = resources.getStringArray(R.array.ulkeAdlari);
        ulkeTanimlari = resources.getStringArray(R.array.ulke_tanimlari);
        ulkelerListesi = findViewById(R.id.ulkelerListesi);

        CustomAdapter adapter=new CustomAdapter(this,ulkeAdlari, ulkeTanimlari, bayrakResimleri);
        ulkelerListesi.setAdapter(adapter);

    }
}
