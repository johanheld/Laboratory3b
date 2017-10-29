package com.example.johan.laboratory3b;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by johan on 2017-10-29.
 */

public class ListAdapter2 extends ArrayAdapter
{
    private LayoutInflater inflater;
    public ListAdapter2(@NonNull Context context, @LayoutRes int resource, @NonNull List objects)
    {
        super(context, resource, objects);
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Nullable
    @Override
    public Object getItem(int position)
    {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        TextView tvInfo;

        if (convertView == null)
            convertView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);

        Instruction instruction = (Instruction) getItem(position);
        tvInfo = (TextView)convertView.findViewById(android.R.id.text1);
        tvInfo.setText(instruction.getWhatToDo());

        return convertView;
    }
}
