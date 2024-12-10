package com.example.custom_spinner2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class CustomAdapter extends BaseAdapter {
    private Context context;
    private country[] countries ;

    private LayoutInflater inflater;

    public CustomAdapter(Context context, country[] countries) {
        this.context = context;
        this.countries= countries;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {

        return countries.length;
    }

    @Override
    public Object getItem(int position)
    {
        return countries[position];
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.spinnerview, parent, false);
        ImageView flag = (ImageView) view.findViewById(R.id.iV);
        TextView countryname2 = (TextView) view.findViewById(R.id.namecon);
        TextView capital = (TextView) view.findViewById(R.id.Capital);
        countryname2.setText(countries[i].getCountryname());
        capital.setText(countries[i].getCapital());
        flag.setImageResource(countries[i].getFlag());

        return view;
    }
}
