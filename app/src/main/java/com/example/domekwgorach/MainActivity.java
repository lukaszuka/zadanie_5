package com.example.domekwgorach;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView nazwa;
    private Button like, delete;
    private TextView count;
    private int county = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nazwa = findViewById(R.id.nazwa);
        like = findViewById(R.id.like);
        delete = findViewById(R.id.delete);
        count = findViewById(R.id.count);

        like.setOnClickListener(v -> {
            county++;
            updateCount();
        });

        delete.setOnClickListener(v -> {
            if (county > 0) {
                county--;
            }
            updateCount();
        });
    }

    private void updateCount() {
        count.setText(county + " Polubień");
    }
}
