import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        lastCharRemover(new String[]{"hi", "some", "thing", "here"});
    }

    public static void replaceAll(int[] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) { continue; }
            numbers[i] = 3;
        }
    }

    public static void lastCharRemover(String[] names) {
        for (int i = 0; i < names.length; i++) { names[i] = names[i].substring(0, names[i].length()-1); }
//      System.out.println(Arrays.toString(names));

    }
}