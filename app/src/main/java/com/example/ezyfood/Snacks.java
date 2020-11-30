package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Snacks extends AppCompatActivity implements View.OnClickListener{

    int SnacksImage [] = {R.drawable.taro, R.drawable.cheetos, R.drawable.oreo};
    private CardView Taro, Cheetos, Oreo;
    private ImageButton IconKeranjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

    Taro = (CardView) findViewById(R.id.taro);
    Cheetos = (CardView) findViewById(R.id.cheetos);
    Oreo = (CardView) findViewById(R.id.oreo);
    IconKeranjang = (ImageButton)findViewById(R.id.iconKeranjang);

    Taro.setOnClickListener(this);
    Cheetos.setOnClickListener(this);
    Oreo.setOnClickListener(this);
    IconKeranjang.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        Bundle bundle = new Bundle();


        switch (v.getId()){
            case R.id.taro : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",SnacksImage[0]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Taro");
                intent.putExtra("OrderHarga", "Rp.5.000");
                startActivity(intent);
                break;
            case R.id.cheetos : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",SnacksImage[1]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Cheetos");
                intent.putExtra("OrderHarga", "Rp.5.000");
                startActivity(intent);
                break;
            case R.id.oreo : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",SnacksImage[2]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Oreo");
                intent.putExtra("OrderHarga", "Rp.5.000");
                startActivity(intent);
                break;

            case R.id.iconKeranjang : intent = new Intent(this, MyOrder.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}