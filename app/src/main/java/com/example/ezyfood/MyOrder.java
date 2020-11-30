package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOrder extends AppCompatActivity {
    Button buttonPay;
    ImageView myOrderImage;
    TextView myOrderText, myOrderHarga, myOrderJumlah, myOrderTotal;
    String tempNama, tempHarga, tempJumlah;
    Integer total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        myOrderImage = (ImageView) findViewById(R.id.MyOrderImage);
        myOrderText = (TextView) findViewById(R.id.MyOrderText);
        myOrderHarga = (TextView) findViewById(R.id.MyOrderHarga);
        myOrderJumlah = (TextView) findViewById(R.id.MyOrderJumlah);
        myOrderTotal = (TextView) findViewById(R.id.MyOrderTotal);
        buttonPay = (Button) findViewById(R.id.ButtonPay);
        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            tempNama = bundle.getString("MyOrderText");
            tempHarga = bundle.getString("MyOrderHarga");
            tempJumlah = bundle.getString("MyOrderJumlah");

        }
        int tempImage = bundle.getInt("MyOrderImage");

        myOrderImage.setImageResource(tempImage);
        myOrderText.setText(tempNama);
        myOrderHarga.setText(tempHarga);
        myOrderJumlah.setText(tempJumlah);

        int tempJumlahQty = Integer.parseInt(tempJumlah);

        if(tempHarga.equals("Rp.3.000")){
            total = tempJumlahQty*3000;
            myOrderTotal.setText("Rp." + total.toString());
        }else if(tempHarga.equals("Rp.5.000")){
            total = tempJumlahQty*5000;
            myOrderTotal.setText("Rp." + total.toString());
        }else if(tempHarga.equals("Rp.10.000")){
            total = tempJumlahQty*10000;
            myOrderTotal.setText("Rp." + total.toString());
        }else if(tempHarga.equals("Rp.15.000")){
            total = tempJumlahQty*15000;
            myOrderTotal.setText("Rp." + total.toString());
        }else if(tempHarga.equals("Rp.20.000")){
            total = tempJumlahQty*20000;
            myOrderTotal.setText("Rp." + total.toString());
        }

    buttonPay.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Intent intent1 = new Intent(MyOrder.this, AfterPayment.class);
           startActivity(intent1);
        }
    });


    }
}