package com.example.johan.laboratory3b;

import java.util.ArrayList;

/**
 * Created by johan on 2017-10-02.
 */

public class Controller
{
    private InfoFragment infoFragment;
    private ArrayList<Instruction> instructions;

    public Controller(InfoFragment fragment, ArrayList instructionList)
    {
        this.infoFragment = fragment;
        this.instructions = instructionList;
    }

    public void listItemClicked(int item)
    {
        Instruction instruction = instructions.get(item);

        infoFragment.setWhatToDo(instruction.getWhatToDo());
        infoFragment.setContent(instruction.getContent());
    }
}
