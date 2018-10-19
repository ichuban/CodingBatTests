package Test1;/*
Given an array of strings, return the count of the number of strings with the given length.
Test1.wordsCount(["a", "bb", "b", "ccc"], 1) → 2
Test1.wordsCount(["a", "bb", "b", "ccc"], 3) → 1
Test1.wordsCount(["a", "bb", "b", "ccc"], 4) → 0
*/



public class main {

    public static void main( String[] args )
    {
        wordsCount wordsCount = new wordsCount();

        System.out.println(wordsCount.stringLength(1));
        System.out.println(wordsCount.stringLength(3));
        System.out.println(wordsCount.stringLength(4));
    }
}
