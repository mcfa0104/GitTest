package ca.duncanmcfarlane.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> daysArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daysArray.add("Sunday");
        daysArray.add("Monday");
        daysArray.add("Tuesday");
        daysArray.add("Wednesday");
        daysArray.add("Thursday");
        daysArray.add("Friday");
        daysArray.add("Saturday");
    }

    // TODO: 2016-08-30 "need to add some code here"


    @Override
    protected void onStart() {
        super.onStart();
        for (String day : daysArray) {
            Toast.makeText(MainActivity.this, "The day is " + day, Toast.LENGTH_SHORT).show();
            for (int i = 0; i < 5000; i++) {
                int count =+ i;
            }
        }
    }
}
