package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int [] flags = {R.drawable.bangladesh,R.drawable.india,R.drawable.pakistan,
            R.drawable.srilanka, R.drawable.nepal,R.drawable.brazil,
            R.drawable.argentina, R.drawable.germany,R.drawable.america,R.drawable.canada};
    private GridView gridView;
    String[] countrynames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countrynames = getResources().getStringArray(R.array.country_name);
        gridView = findViewById(R.id.gridviewid);

        CustomAdapter adapter=new CustomAdapter(this,countrynames,flags);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value =countrynames[position];
                Toast.makeText(MainActivity.this, value,  Toast.LENGTH_SHORT).show();
            }
        });
    }
}
