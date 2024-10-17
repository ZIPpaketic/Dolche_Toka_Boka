package com.example.dolce_gash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class zxc1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zxc1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void NavigateTO(View v){
        Intent intent = new Intent(zxc1.this, zxc2.class);
        startActivity(intent);

    }
    public void NavigateTO1(View v1){

            Intent intent1 = new Intent(zxc1.this, zxc5.class);
            startActivity(intent1);


    }
    public void NavigateTO2(View v1){

        Intent intent1 = new Intent(zxc1.this, zxc6.class);
        startActivity(intent1);


    }

}