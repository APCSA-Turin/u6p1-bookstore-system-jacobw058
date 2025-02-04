package com.example.project;

public class IdGenerate{ 
//This class represents an ID generator with only static methods to manage and generate IDs.

    //represents the current ID in string form
    private static String currentId = "99";
    //represents the current ID in int form
    private static int current = 99;


    //getter method for the current ID in string form
    public static String getCurrentId() {
        return currentId;
    }

    //resets the current ID to its base value, 99
    public static void reset() {
        currentId = "99";
    } 

    //generates a new id, also increases currentId (both String and int forms) by 1
    public static String generateID() {
        current++;
        currentId = "" + current;
        return currentId;
    } 
}