package id.ac.poliban.mi.sultan.latihan08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getSupportActionBar() != null)
            getSupportActionBar().setTitle("Second Activity");
    }
}
