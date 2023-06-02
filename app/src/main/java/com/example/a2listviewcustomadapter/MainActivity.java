package com.example.a2listviewcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvSinhVien;
    ArrayList<SinhVien>mangSinhVien;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvSinhVien = (ListView) findViewById(R.id.listViewSinhVien);
        mangSinhVien = new ArrayList<SinhVien>();
        mangSinhVien.add(new SinhVien("Lương Chung Hội", 2001));
        mangSinhVien.add(new SinhVien("Nguyễn Văn Hoàng", 2001));
        mangSinhVien.add(new SinhVien("Trần Hoàng Long", 2002));
        mangSinhVien.add(new SinhVien("Trần Khả Vy", 2000));
        mangSinhVien.add(new SinhVien("Lữ Bố", 1969));

        SinhVienAdapter adapter = new SinhVienAdapter(
                MainActivity.this,
                R.layout.dong_sinh_vien,
                mangSinhVien
        );

        lvSinhVien.setAdapter(adapter);
    }
}