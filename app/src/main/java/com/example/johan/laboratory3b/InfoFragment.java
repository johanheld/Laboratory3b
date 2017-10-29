package com.example.johan.laboratory3b;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment
{
    private TextView tvWhatToDo;
    private TextView tvContent;

    public InfoFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        init(view);
        return view;
    }

    private void init(View view)
    {
        tvWhatToDo = (TextView)view.findViewById(R.id.tvWhatToDo);
        tvContent = (TextView)view.findViewById(R.id.tvContent);
    }

    public void setWhatToDo(String s)
    {
        tvWhatToDo.setText(s);
    }

    public void setContent(String s)
    {
        tvContent.setText(s);
    }

}
