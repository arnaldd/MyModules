package sg.edu.rp.c346.id20039583.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvCode, tvname, tvYear, tvSemester, tvModCred, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvCode = findViewById(R.id.textViewCode);
        tvname = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModCred = findViewById(R.id.textViewModCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonback);


        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 346);
        tvCode.setText("Module Code: C" + value);

        String Modulename = intentReceived.getStringExtra("AndroidProgramming");
        tvname.setText("Module Name " + Modulename);

        int year = intentReceived.getIntExtra("year", 2020);
        tvYear.setText("Academic year: " + year);

        int semester = intentReceived.getIntExtra("year", 1);
        tvSemester.setText("Semester: " + semester);

        int ModuleCredit = intentReceived.getIntExtra("ModuleCredit", 1);
        tvModCred.setText("Module Credit: " + ModuleCredit);

        String venue = intentReceived.getStringExtra("E62E");
        tvVenue.setText("Venue: " + venue);




        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();

            }
        });

















    }
}