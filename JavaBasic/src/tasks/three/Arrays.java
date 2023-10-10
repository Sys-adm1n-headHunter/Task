package tasks.three;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {3,65,34,12,677};

        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        System.out.println("Результат суммы первого и среднего элемента " + (array[0] + array[array.length/2]));

    }
}
