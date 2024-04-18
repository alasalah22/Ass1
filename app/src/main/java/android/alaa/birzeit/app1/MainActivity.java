package android.alaa.birzeit.app1;



import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String tag="Life cycle : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button next=findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_LONG).show();

        Log.d(tag,"onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy called", Toast.LENGTH_LONG).show();
        Log.d("MainActivity", "onDestroy called");
    }
}