package com.company;

/**
 * Created by hp on 2/22/2017.
 */
public class Sheep implements Animal
{
    public Sheep()
    {
        System.out.println("Sheep is Made");
    }

    @Override
    public Animal makecopy() {
        System.out.println("Sheep is Being Made");

        Sheep sheepObject = null;

        try {
            sheepObject = (Sheep) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("The Sheep was Turned to Mush");
            e.printStackTrace();
        }
        return sheepObject;
    }
    public String toString()
    {
        return "Baa Baa Baa";
    }
}
