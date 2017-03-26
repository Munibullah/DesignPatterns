package com.company;

/**
 * Created by hp on 2/22/2017.
 */
public class CloneFactory
{
    public Animal getClone (Animal animalSample)
    {
        return animalSample.makecopy();
    }
}
