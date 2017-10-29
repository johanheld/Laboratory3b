package com.example.johan.laboratory3b;

/**
 * Created by johan on 2017-10-02.
 */

public class Instruction
{
    private String content;
    private String whatToDo;

    public Instruction(String whatToDo, String content)
    {
        this.content = content;
        this.whatToDo = whatToDo;
    }

    public String getContent()
    {
        return content;
    }

    public String getWhatToDo()
    {
        return whatToDo;
    }
}
