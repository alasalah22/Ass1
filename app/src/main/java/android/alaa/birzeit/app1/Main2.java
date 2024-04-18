package android.alaa.birzeit.app1;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    String shapeList[] = {"Car", "Apple"};

    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        list = (ListView) findViewById(R.id.shapeListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), shapeList);

        list.setAdapter(CustomAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("shape_list_View", "solid is clicked @ position : " + position);
                if(position==0){
                    startActivity(new Intent(MainActivity2.this, carr.class));
                }
                else if(position==1){
                    startActivity(new Intent(MainActivity2.this, apple.class));

                }
            }
        });
    }
}
