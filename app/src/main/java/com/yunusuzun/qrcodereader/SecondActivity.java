package com.yunusuzun.qrcodereader;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dlazaro66.qrcodereaderview.QRCodeReaderView;

public class SecondActivity extends AppCompatActivity implements QRCodeReaderView.OnQRCodeReadListener{

    private QRCodeReaderView qrCodeReaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        qrCodeReaderView = findViewById(R.id.qrCodeReader); // activity_second layoutundaki view
        qrCodeReaderView.setAutofocusInterval(2000L);       // otomatik odaklanma süresi bunu değiştirebilirsin isteğine göre, her 2 saniyede 1 odaklanacak
        qrCodeReaderView.setQRDecodingEnabled(true);        // False yaparsan decode etmez
        qrCodeReaderView.setOnQRCodeReadListener(this);     // alttaki methodu her QR okuduğunda çalıştırmak için listener set ediyoruz
        qrCodeReaderView.setBackCamera();                   // Arka kamerayı ayarlıyor okuma için
        qrCodeReaderView.startCamera();

        Button btnPage=(Button)findViewById(R.id.nasil);
        btnPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,NasilActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onQRCodeRead(String text, PointF[] points) {

        switch (text){

            case "birincialet":
            case "ikincialet":
            case "ucuncualet":
            case "dorduncualet":
            case "besincialet":
            case "altincialet":
            case "yedincialet":
            case "sekizincialet":
            case "dokuzuncualet":
            case "onuncualet":
            case "onbirincialet":
            case "onikincialet":
                changeActivity(text);
                break;
            default:
                Toast.makeText(this, "Tanınmayan QR", Toast.LENGTH_SHORT).show();

        }

    }

    private void changeActivity(String text){

        qrCodeReaderView.stopCamera(); // activity değiştirmeden önce kamerayı durduruyoruz.

        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("text", text);
        startActivity(intent);
        finish();

    }

    @Override
    protected void onPause() {
        super.onPause();
        qrCodeReaderView.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();
        qrCodeReaderView.startCamera();
    }
}
