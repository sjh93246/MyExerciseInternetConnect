package com.example.myexerciseinternetconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int status = NetworkStatus.getConnectivityStatus(getApplicationContext());
        switch (status){
            case 1 :
                Toast.makeText(getApplicationContext(), "와이파이 연결상태 " + status, Toast.LENGTH_LONG).show();

            case 2 :
                Toast.makeText(getApplicationContext(), "모바일 연결상태 " + status, Toast.LENGTH_LONG).show();

            case 3:
                Toast.makeText(getApplicationContext(), "연결되지 않음 " + status, Toast.LENGTH_LONG).show();
        };

    }
}
