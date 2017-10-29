package com.example.johan.laboratory3b;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment
{
    private ListView list;
    private Controller controller;

    public ListFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        init(view);
        return view;
    }

    private void init(View view)
    {
        list = (ListView)view.findViewById(R.id.lvList);
    }

    public void setList(ArrayList instructions)
    {
        list.setAdapter(new ListAdapter2(getContext(),android.R.layout.simple_list_item_1, instructions));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                controller.listItemClicked(position);
            }
        });
    }

    public void setController(Controller controller)
    {
        this.controller = controller;
    }
}
