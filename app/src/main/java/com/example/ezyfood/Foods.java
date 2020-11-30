package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Foods extends AppCompatActivity implements View.OnClickListener{

    int FoodsImage []= {R.drawable.nasigoreng, R.drawable.miegoreng, R.drawable.sate};
    private CardView NasiGoreng, MieGoreng, Sate;
    private ImageButton IconKeranjang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        NasiGoreng = (CardView)findViewById(R.id.nasiGoreng);
        MieGoreng = (CardView) findViewById(R.id.mieGoreng);
        Sate = (CardView) findViewById(R.id.sate);
        IconKeranjang = (ImageButton) findViewById(R.id.iconKeranjang);

        NasiGoreng.setOnClickListener(this);
        MieGoreng.setOnClickListener(this);
        Sate.setOnClickListener(this);
        IconKeranjang.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        Bundle bundle = new Bundle();


        switch (v.getId()){
            case R.id.nasiGoreng : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",FoodsImage[0]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Nasi Goreng");
                intent.putExtra("OrderHarga", "Rp.20.000");
                startActivity(intent);
                break;

            case R.id.mieGoreng : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",FoodsImage[1]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Mie Goreng");
                intent.putExtra("OrderHarga", "Rp.15.000");
                startActivity(intent);
                break;
            case R.id.sate : intent = new Intent(this, Order.class);

                bundle.putInt("OrderImage",FoodsImage[2]);
                intent.putExtras(bundle);
                intent.putExtra("OrderText", "Sate");
                intent.putExtra("OrderHarga", "Rp.20.000");
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