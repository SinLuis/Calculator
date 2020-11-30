package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    ImageView image;
    TextView orderText, Angka;
    TextView harga;
    int hasil;
    String tempNama, tempHarga;
    Integer angka1=1, angka2=0, jumlah=0;

    Button TambahAngka, KurangAngka, TambahQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        image = (ImageView)findViewById(R.id.OrderImage);
        orderText = (TextView) findViewById(R.id.OrderText);
        harga = (TextView) findViewById(R.id.OrderHarga);
        Angka = (TextView) findViewById(R.id.angka);
        TambahAngka = (Button) findViewById(R.id.tambahAngka);
        KurangAngka = (Button)findViewById(R.id.kurangAngka);
        TambahQty = (Button) findViewById(R.id.tambahQty);
        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();



        if(bundle!=null){
            tempNama = bundle.getString("OrderText");
            tempHarga = bundle.getString("OrderHarga");

        }
            int tempImage = bundle.getInt("OrderImage");

            image.setImageResource(tempImage);
            orderText.setText(tempNama);
            harga.setText(tempHarga);

        TambahAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    angka2 = Integer.parseInt(Angka.getText().toString());
                } catch(NumberFormatException nfe) {

                }

                jumlah = angka1 + angka2;
                Angka.setText(jumlah.toString());
            }
        });


        KurangAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                try {

                    angka2 = Integer.parseInt(Angka.getText().toString());
                } catch(NumberFormatException nfe) {

                }

                if(angka2>0){
                    jumlah = angka2 - angka1;
                    Angka.setText(jumlah.toString());
                }

            }
        });


        TambahQty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Order.this, MyOrder.class);

                bundle.putInt("MyOrderImage", tempImage);
                intent1.putExtras(bundle);
                intent1.putExtra("MyOrderText", tempNama);
                intent1.putExtra("MyOrderHarga", tempHarga);
                intent1.putExtra("MyOrderJumlah", Angka.getText().toString());

                startActivity(intent1);

            }
        });




    }

}