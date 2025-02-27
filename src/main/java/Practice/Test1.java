package Practice;

public class Test1 {

    public static void max(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                temp = array[i];
            }
        }
        System.out.println("Print Maximum value: " + temp);
    }

    public static void min(int[] array) {

        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < temp) {
                temp = array[i];
            }
        }
        System.out.println("Print Minimum value: " + temp);

    }

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 30;
        array[1] = 50;
        array[2] = 100;
        array[3] = 11;
        array[4] = 80;

        max(array);
        min(array);

    }
}

