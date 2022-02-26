package lesson2;

public class HomeWorkApp2 {

    public static void main (String[] args) {
        System.out.println(checkTwoNumbers(9,2));
        checkPositiveNumber(-3);
        System.out.println(checkIntegerNumber(3));
        printAString(5,"GB");
    }
    public static boolean checkTwoNumbers (int num1, int num2) {
        int sum = num1 + num2;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void checkPositiveNumber (int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean checkIntegerNumber (int num){
        if (num >= 0){
            return true;
        } else {
            return false;
        }
    }
    public static void printAString (int num, String word) {
        int i = 0;
        while (i < num) {
            System.out.println(word);
            i++;
        }
    }
}

