package com.bkacad.nnt.listviewd01k12bt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.bkacad.nnt.listviewd01k12bt.adapter.MyAdapter;
import com.bkacad.nnt.listviewd01k12bt.model.Country;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvCountry;

    // Adapter
    private MyAdapter myAdapter;

    // Dữ liệu
    private List<Country> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCountry = findViewById(R.id.lvCountry);
        // Fake dữ liệu
        countryList = new ArrayList<>();
        countryList.add(new Country(84,"Việt Nam","Hà Nội","https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/1280px-Flag_of_Vietnam.svg.png",331210,100000000));
        countryList.add(new Country(84,"Việt Nam","Hà Nôi","https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/1280px-Flag_of_Vietnam.svg.png",331210,100000000));
        countryList.add(new Country(84,"Việt Nam","Hà Nôi","https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/1280px-Flag_of_Vietnam.svg.png",331210,100000000));

        // Set Adapter cho listview
        myAdapter = new MyAdapter(this, countryList);
        lvCountry.setAdapter(myAdapter);

        // Xử lý sự kiện
        lvCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,countryList.get(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });

        // Nhấn giữ xoá
        lvCountry.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Xoá khỏi datasource -> báo cho adpater biết dữ liệu thay đổi
                countryList.remove(i);
                myAdapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}