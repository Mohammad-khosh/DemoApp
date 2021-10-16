git pull --rebase origin mainpackage com.coddingkhosh.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.coddingkhosh.demoapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}