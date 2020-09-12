package tj.playground.java.datastructure.array;

public class ArrayFindBigNo {
    public static void main(String[] args) {

        int array[] = { 10, 1, 45, 90, 324, 700, 4, 60, 1000, 24 };

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }
}
