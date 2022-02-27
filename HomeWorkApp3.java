package lesson3;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        swapNumbers();
        fillArray(15);
        multiplyNumber();
        diagonals();
        returnArray(3,5);

    }
    //Внес немного своей логики, если что заранее извиняюсь за "отсебячину"
    //но очень хотелось чтобы была проверка на числа
    public static void swapNumbers(){
        int[] array = {0,1,0,1,-7,7,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                System.out.println("Переданно неверное число");
                continue;
            }if (array[i] > 1) {
                System.out.println("Переданно неверное число");
                continue;
            }if (array[i] == 0){
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
            System.out.println(array[i]);
        }
    }

    public static void fillArray(int num) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++){
                array[i] = i + 1;
                System.out.print (array[i] + " ");
        }
    }

    public static void multiplyNumber() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void diagonals() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void returnArray (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + "[" + arr[i] + "]");
            System.out.println();
        }
    }
}