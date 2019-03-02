package com.ismailhakkiaydin.customarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    Context context;
    String[] ulkeAdlari;
    String[] ulkeTanimlari;
    int[] resimler;

    CustomAdapter(Context c, String[] ulkeAdlari, String[] ulkeTanimlari, int resimlerDizisi[]) {

        super(c, R.layout.listview_satir, R.id.textView, ulkeAdlari);
        this.context = c;
        this.ulkeAdlari = ulkeAdlari;
        this.ulkeTanimlari = ulkeTanimlari;
        this.resimler = resimlerDizisi;
    }

    class ViewYerTutucu{

        ImageView resim;
        TextView ulke;
        TextView tanim;

        ViewYerTutucu(View v){
            resim= (ImageView) v.findViewById(R.id.imageView);
            ulke= (TextView) v.findViewById(R.id.textView);
            tanim= (TextView) v.findViewById(R.id.textView2);
        }


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View tek_satir = convertView;
        ViewYerTutucu tutucu=null;

        if (tek_satir == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            tek_satir = inflater.inflate(R.layout.listview_satir, parent, false);
            tutucu=new ViewYerTutucu(tek_satir);
            tek_satir.setTag(tutucu);

        }
        else{
            tutucu= (ViewYerTutucu) tek_satir.getTag();

        }


        tutucu.resim.setImageResource(resimler[position]);
        tutucu.ulke.setText(ulkeAdlari[position]);
        tutucu.tanim.setText(ulkeTanimlari[position]);
 /*  ImageView img_teksatir =(ImageView) tek_satir.findViewById(R.id.imageView);
        TextView ulkeAdi_teksatir=  (TextView) tek_satir.findViewById(R.id.textView);
        TextView ulkeTanim_teksatir=  (TextView) tek_satir.findViewById(R.id.textView2);

      /* img_teksatir.setImageResource(resimler[position]);
        ulkeAdi_teksatir.setText(ulkeAdlari[position]);
        ulkeTanim_teksatir.setText(ulkeTanimlari[position]);
*/


        return tek_satir;
    }
}


