package com.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1a, btn1b, btn2a, btn2b, btn3a, btn3b, btnreset;
    Integer nilaiA, nilaiB;
    TextView tampilNilaiA, tampilNilaiB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilNilaiA = (TextView) findViewById(R.id.tv_team_a);
        tampilNilaiB = (TextView) findViewById(R.id.tv_team_b);

        btn1a = (Button) findViewById(R.id.btn1a);
        btn1b = (Button) findViewById(R.id.btn1b);
        btn2a = (Button) findViewById(R.id.btn2a);
        btn2b = (Button) findViewById(R.id.btn2b);
        btn3a = (Button) findViewById(R.id.btn3a);
        btn3b = (Button) findViewById(R.id.btn3b);

        btnreset = (Button) findViewById(R.id.btnReset);

        nilaiA = 0;
        nilaiB = 0;

        btn3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                up3a();
                tampilNilaiA.setText(nilaiA.toString());
            }
        });
        btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                up3b();
                tampilNilaiB.setText(nilaiB.toString());
            }
        });
        btn2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                up2a();
                tampilNilaiA.setText(nilaiA.toString());
            }
        });
        btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                up2b();
                tampilNilaiB.setText(nilaiB.toString());
            }
        });
        btn1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                up1a();
                tampilNilaiA.setText(nilaiA.toString());
            }
        });
        btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                up1b();
                tampilNilaiB.setText(nilaiB.toString());
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
                tampilNilaiB.setText(nilaiB.toString());
                tampilNilaiA.setText(nilaiA.toString());
            }
        });
    }

    public void up3a() {
        nilaiA += 3;
        tampilNilaiA.setText(nilaiA.toString());
    }
    public void up3b() {
        nilaiB += 3;
        tampilNilaiB.setText(nilaiB.toString());
    }
    public void up2a() {
        nilaiA += 2;
        tampilNilaiA.setText(nilaiA.toString());
    }
    public void up2b() {
        nilaiB += 2;
        tampilNilaiB.setText(nilaiB.toString());
    }
    public void up1a() {
        nilaiA += 1;
        tampilNilaiA.setText(nilaiA.toString());
    }
    public void up1b() {
        nilaiB += 1;
        tampilNilaiB.setText(nilaiB.toString());
    }
    public void reset() {
        nilaiA = 0;
        nilaiB = 0;
        tampilNilaiA.setText(Integer.toString(nilaiA));
        tampilNilaiB.setText(Integer.toString(nilaiB));
    }
}
