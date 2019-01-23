package com.example.admin.farmerapptabbed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter{
    Context context;
    int[] images1;
    String[] names1;


    public CustomAdapter(Context context, int[] images1, String[] names1) {
        this.context=context;
        this.images1=images1;
        this.names1=names1;


    }

    @Override
    public int getCount() {
        return images1.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.list_view,viewGroup,false);
        TextView textView,textView1;
        ImageView imageView;

        textView=view.findViewById(R.id.textview1);
        textView1=view.findViewById(R.id.textview2);
        textView1.setText(names1[i]);
        imageView=view.findViewById(R.id.circleimage1);
        textView.setText(names1[i]);
        imageView.setImageResource(images1[i]);
        return view;
    }
}
