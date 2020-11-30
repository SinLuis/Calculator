package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Drinks extends AppCompatActivity implements View.OnClickListener {

    int DrinkImage[] = {R.drawable.airmineral,R.drawable.jusmangga, R.drawable.jusapel};

    private CardView AirMineral, JusMangga, JusApel;
    private ImageButton IconKeranjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        AirMineral = (CardView) findViewById(R.id.airMineral);
        JusMangga = (CardView) findViewById(R.id.jusMangga);
        JusApel = (CardView) findViewById(R.id.jusApel);
        IconKeranjang = (ImageButton) findViewById(R.id.iconKeranjang);

        AirMineral.setOnClickListener(this);
        JusMangga.setOnClickListener(this);
        JusApel.setOnClickListener(this);
        IconKeranjang.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        Bundle bundle = new Bundle();

        switch (v.getId()){
            case R.id.airMineral : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",DrinkImage[0]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Air Mineral");
                intent.putExtra("OrderHarga", "Rp.3.000");
                startActivity(intent);
                break;
            case R.id.jusMangga : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",DrinkImage[1]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Jus Mangga");
                intent.putExtra("OrderHarga", "Rp.10.000");
                startActivity(intent);
                break;

                case R.id.jusApel : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",DrinkImage[2]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Jus Apel");
                intent.putExtra("OrderHarga", "Rp.10.000");
                startActivity(intent);
                break;

            case R.id.iconKeranjang : intent = new Intent(this, MyOrder.class);
                startActivity(intent);
                break;
        }

    }
}