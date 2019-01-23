package com.yunusuzun.qrcodereader;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pub.devrel.easypermissions.EasyPermissions;

public class FirstActivity extends AppCompatActivity {

    private Button tara;
    private String[] permissions = {Manifest.permission.CAMERA};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        EasyPermissions.requestPermissions(this, "QR Kodu okuyabilmek için kamera izni gerekiyor", 1001,
                permissions);

        tara = findViewById(R.id.scan);

        tara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(EasyPermissions.hasPermissions(FirstActivity.this, permissions))
                    changeActivity(new SecondActivity());
                else
                    EasyPermissions.requestPermissions(FirstActivity.this, "QR Kodu okuyabilmek için kamera izni gerekiyor", 1001, permissions);
            }
        });

    }

    private void changeActivity(Activity activity){

        Intent intent = new Intent(this, activity.getClass());
        startActivity(intent);
        finish();

    }

}
