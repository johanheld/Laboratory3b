package com.example.johan.laboratory3b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ListFragment listFragment;
    private InfoFragment infoFragment;
    Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.app.FragmentManager fm = getFragmentManager();

        ArrayList<Instruction> instructionList = new ArrayList<>();
        instructionList.add(new Instruction(getString(R.string.what_to_do), getString(R.string.content)));
        instructionList.add(new Instruction(getString(R.string.what_to_do2), getString(R.string.content2)));
        instructionList.add(new Instruction(getString(R.string.what_to_do3), getString(R.string.content3)));

        listFragment = (ListFragment)fm.findFragmentById(R.id.listFragment);
        infoFragment = (InfoFragment)fm.findFragmentById(R.id.contentFragment);
        controller = new Controller(infoFragment, instructionList);
        listFragment.setController(controller);
        listFragment.setList(instructionList);
        controller.listItemClicked(0);
    }
}
