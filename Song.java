package com.company;

public class Song {

    public static void verseChorus(String number, String object)
    {
        System.out.println("This old man, he played " + number + ".");
        System.out.println("He played knick-knack on my " + object + ";");
        System.out.println("With a knick-knack paddywhack,");
        System.out.println("Give the dog a bone,");
        System.out.println("This old man came rolling home.\n");
    }


    public static void main(String[] args)
    {
        verseChorus("one", "thumb");
        verseChorus("two", "shoe");
        verseChorus("three", "knee");
        verseChorus("four", "door");
        verseChorus("five", "hive");
        verseChorus("six", "sticks");

    }

}