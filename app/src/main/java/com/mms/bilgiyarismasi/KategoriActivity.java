package com.mms.bilgiyarismasi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class KategoriActivity extends AppCompatActivity {

    ListView listView;
    String mBaslik[] = {"Spor","Müzik","Bilim","Sanat","Teknoloji", "Edebiyat", "Tarih", "Coğrafya", "Sinema", "Matematik"};
    String mAciklama[] = {"2 soru","2 soru","2 soru","2 soru","2 soru", "2 soru", "2 soru", "2 soru", "2 soru", "2 soru"};
    int mresim[] = {R.drawable.spoor,R.drawable.music,R.drawable.art,R.drawable.science,R.drawable.technology, R.drawable.edebiyat, R.drawable.tarih, R.drawable.cografya, R.drawable.cinema, R.drawable.math};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoriler);

        listView = findViewById(R.id.listView);
        benimAdapter adapter = new benimAdapter(this,mBaslik,mAciklama,mresim);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 9) {

                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsMath.class);
                    startActivity(intent);
                }


                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsSpor.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsMuzik.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsBilim.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsSanat.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsTeknoloji.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsEdebiyat.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsTarih.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsCografya.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(getApplicationContext(), QuizQuestionsSinema.class);
                    startActivity(intent);
                }

            }
        });

    }

    class benimAdapter extends ArrayAdapter<String>{
        Context context;
        String rBaslik[];
        String rAciklama[];
        int rresim[];

        benimAdapter (Context c, String baslik[], String Aciklama[], int resim[]){
            super(c, R.layout.custom_listview, R.id.text1, baslik);
            this.context = c;
            this.rBaslik = baslik;
            this.rAciklama = Aciklama;
            this.rresim = resim;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View satir = layoutInflater.inflate(R.layout.custom_listview,parent,false);
            ImageView resim = satir.findViewById(R.id.resim);
            TextView benimBaslik = satir.findViewById(R.id.text1);
            TextView benimAciklama = satir.findViewById(R.id.text2);

            resim.setImageResource(rresim[position]);
            benimBaslik.setText(rBaslik[position]);
            benimAciklama.setText(rAciklama[position]);


            return satir;



        }


    }

}