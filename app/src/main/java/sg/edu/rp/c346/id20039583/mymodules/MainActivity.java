package sg.edu.rp.c346.id20039583.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvAndroid,tviPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.textViewAndroid);
        tviPad = findViewById(R.id.textViewiPad);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Module Code","C346");
                intent.putExtra("Module Name","Android Programming");
                intent.putExtra("Academic year","2022");
                intent.putExtra("Semester","1");
                intent.putExtra("Module Credit","4");
                intent.putExtra("Venue","W62E");

                startActivity(intent);


            }
        });

        tviPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent J = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(J);
            }
        });


    }
}