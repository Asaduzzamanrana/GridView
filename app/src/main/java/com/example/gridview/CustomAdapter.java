package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flags;
    String[] countrynames;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context,String[] countrynames,int[] flags){
        this.context=context;
        this.countrynames = countrynames;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return countrynames.length;
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

        if (convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.viewlayout, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.imageviewid);
        TextView textView = convertView.findViewById(R.id.textviewid);

        imageView.setImageResource(flags[position]);
        textView.setText(countrynames[position]);

        return convertView;
    }
}
