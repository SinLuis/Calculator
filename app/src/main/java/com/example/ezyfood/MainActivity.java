package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView Drink, Foods, Snacks, TopUp;
    private ImageButton IconKeranjang;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drink =(CardView) findViewById(R.id.drinksID);
        Snacks =(CardView) findViewById(R.id.snacksID);
        Foods = (CardView) findViewById(R.id.foodsID);
        TopUp = (CardView) findViewById(R.id.topUpID);
        IconKeranjang = (ImageButton) findViewById(R.id.iconKeranjang);

        Drink.setOnClickListener(this);
        Snacks.setOnClickListener(this);
        Foods.setOnClickListener(this);
        TopUp.setOnClickListener(this);
        IconKeranjang.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
            switch (v.getId()){
                case R.id.drinksID : intent = new Intent( this, Drinks.class );
                startActivity(intent);
                break;

                case R.id.snacksID : intent = new Intent (this, Snacks.class);
                startActivity(intent);
                break;

                case R.id.foodsID : intent = new Intent (this, Foods.class);
                    startActivity(intent);
                    break;

                case R.id.topUpID : intent = new Intent (this, TopUp.class);
                    startActivity(intent);
                    break;

                    case R.id.iconKeranjang : intent = new Intent(this, MyOrder.class);
                        startActivity(intent);
                        break;
            }
    }
}