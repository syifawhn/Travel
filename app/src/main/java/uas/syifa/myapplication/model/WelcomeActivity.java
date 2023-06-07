package uas.syifa.myapplication.model;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import uas.syifa.myapplication.MainActivity;
import uas.syifa.myapplication.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(Bundle savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView starBtn=findViewById(R.id.startBtn);
        starBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Welcome.Activity.this, MainActivity.class));
            }
        });
    }
}
