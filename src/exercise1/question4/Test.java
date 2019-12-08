package exercise1.question4;

public class Test {
    static void f(int [] array, int nb) {
        array = new int[nb];
        for(int value: array)
            System.out.println(++value + " ");
    }

    public static void main(String[] args) {
        int size = 3;
        int [] array = null;
        f(array, size);
        for(int value: array)
            System.out.println(value + " ");
    }
}
