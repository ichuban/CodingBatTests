package Test1;

public class wordsCount {

    private String[] wordsCount = new String[]{"a", "bb", "b", "ccc"};


    public int stringLength(int stringLength) {

        int count = 0;

        for (String s : wordsCount) {
            if (s.length() == stringLength) {

                count++;
            }
        }
        return count;
    }
}

