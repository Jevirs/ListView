package com.android.jevirs.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jevirs on 2015/2/28.
 */
public class SampleAdapter extends ArrayAdapter {

    private int resourceId;
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public SampleAdapter(Context context, int resource, List<Sample> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Sample sample = (Sample) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.text);
        imageView.setImageResource(sample.getImageViewId());
        textView.setText(sample.getText());
        return view;
    }
}
