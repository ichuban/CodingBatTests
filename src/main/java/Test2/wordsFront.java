package Test2;


public class wordsFront {

    String[] words = new String[]{"a", "b", "c", "d"};

    public String[] getFrontNumber(int frontNumber) {

        String[] result = new String[frontNumber];

        for (int i = 0; i < result.length; i++) {

            result[i] = words[i];
        }
        return result;
    }
}