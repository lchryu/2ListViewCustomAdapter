package com.example.a2listviewcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<SinhVien>arraySinhVien;
    private int position;
    private View convertView;
    private ViewGroup parent;

    public SinhVienAdapter(Context myContext, int myLayout, List<SinhVien> arraySinhVien) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.arraySinhVien = arraySinhVien;
    }

    @Override
    public int getCount() {
        return arraySinhVien.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        this.position = position;
        this.convertView = convertView;
        this.parent = parent;
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        // Ánh xạ và gán giá trị
        TextView txtHoTen = (TextView) convertView.findViewById(R.id.textViewHoTen);
        txtHoTen.setText(arraySinhVien.get(position).HoTen.toString());

        TextView txtNamSinh = (TextView) convertView.findViewById(R.id.textViewNamSinh);
        txtNamSinh.setText(String.valueOf(arraySinhVien.get(position).NamSinh));

        return convertView;
    }
}
