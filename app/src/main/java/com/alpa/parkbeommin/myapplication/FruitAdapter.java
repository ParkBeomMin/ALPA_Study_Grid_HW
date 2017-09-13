package com.alpa.parkbeommin.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by parkbeommin on 2017. 9. 13..
 */

public class FruitAdapter extends BaseAdapter {
    ArrayList<Fruit> arrayList;
    Context c;

    public FruitAdapter(ArrayList<Fruit> arrayList, Context c) {
        this.arrayList = arrayList;
        this.c = c;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(c);
        if(view == null) {
            view = inflater.inflate(R.layout.mylayout, null);
        }
        ImageView i1 = (ImageView)view.findViewById(R.id.img);
        TextView t1 = (TextView)view.findViewById(R.id.name_tv);
        TextView t2= (TextView)view.findViewById(R.id.price_tv);

        Fruit one;
        one = arrayList.get(i);
        t1.setText(one.getName());
        t2.setText(one.getPrice()+"원");
setImg(one.getName(), i1);
        return view;
    }

    void setImg(String name, ImageView i1){
        switch (name){
            case "사과":
                i1.setImageResource(R.drawable.if_apple_650370);
                break;
            case "딸기":
                i1.setImageResource(R.drawable.if_strawberry_650364);
                break;
            case "키위":
                i1.setImageResource(R.drawable.if_kiwi_650368);
                break;
            case "바나나":
                i1.setImageResource(R.drawable.if_bananas_650369);
                break;
            case "오렌지":
                i1.setImageResource(R.drawable.if_orange_650367);
                break;
            case "파인애플":
                i1.setImageResource(R.drawable.if_pineapple_650363);
                break;
        }
    }
}
