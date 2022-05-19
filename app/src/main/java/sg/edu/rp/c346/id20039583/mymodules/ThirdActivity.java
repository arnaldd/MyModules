package sg.edu.rp.c346.id20039583.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvCode2, tvname2, tvYear2, tvSemester2, tvModCred2, tvVenue2;
    Button btnBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvCode2 = findViewById(R.id.textViewCode2);
        tvname2 = findViewById(R.id.textViewName2);
        tvYear2 = findViewById(R.id.textViewYear2);
        tvSemester2 = findViewById(R.id.textViewSemester2);
        tvModCred2 = findViewById(R.id.textViewModCredit2);
        tvVenue2 = findViewById(R.id.textViewVenue2);
        btnBack2 = findViewById(R.id.buttonback2);


        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 346);
        tvCode2.setText("Module Code: C" + value);

        String Modulename = intentReceived.getStringExtra("AndroidProgramming");
        tvname2.setText("Module Name " + Modulename);

        int year = intentReceived.getIntExtra("year", 2020);
        tvYear2.setText("Academic year: " + year);

        int semester = intentReceived.getIntExtra("year", 1);
        tvSemester2.setText("Semester: " + semester);

        int ModuleCredit = intentReceived.getIntExtra("ModuleCredit", 1);
        tvModCred2.setText("Module Credit: " + ModuleCredit);

        String venue = intentReceived.getStringExtra("E62E");
        tvVenue2.setText("Venue: " + venue);




        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });




    }
}