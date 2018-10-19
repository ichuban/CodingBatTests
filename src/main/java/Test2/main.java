package Test2;

import java.util.Arrays;

/*
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]*/
public class main {


        public static void main( String[] args )
        {
            wordsFront wordsFront = new wordsFront();

            System.out.println(Arrays.toString(wordsFront.getFrontNumber(3)));

        }
    }