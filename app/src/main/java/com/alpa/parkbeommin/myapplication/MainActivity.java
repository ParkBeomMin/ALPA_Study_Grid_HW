package com.alpa.parkbeommin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView g1;
    ArrayList<Fruit> fruits = new ArrayList<>();
    FruitAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Grid_Method();
    }
    void init(){
        g1 = (GridView) findViewById(R.id.grid);
        fruits.add(new Fruit("사과","1000"));
        fruits.add(new Fruit("바나나","1500"));
        fruits.add(new Fruit("키위","3000"));
        fruits.add(new Fruit("오렌지","2000"));
        fruits.add(new Fruit("파인애플","5000"));
        fruits.add(new Fruit("딸기","2500"));
        adapter = new FruitAdapter(fruits, this);
        g1.setAdapter(adapter);
    }


    void Grid_Method(){
        g1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, fruits.get(i).getName()+" " + fruits.get(i).getPrice()+"원입니다.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
