package com.company;

/**
 * Created by hp on 2/22/2017.
 */
public class Main
{
    public static void main(String args[])
    {
        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep sallyRef = sally;

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println("Sally");

        System.out.println("ClonedSheep");

        System.out.println("Sally HashCode: " + System.identityHashCode((sally)));

        System.out.println("Sally Ref HashCode: " + System.identityHashCode((sallyRef)));

        System.out.println("Cloned HashCode: " + System.identityHashCode((clonedSheep)));


    }
}
