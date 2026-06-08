package Basics;

public class Basics {
    public static void main(String[] args) {
        int num = 100;
        float price = 99.9f;
        char grade = 'A';
        String language = "Java";
        boolean status = true;
        String data = null;

//        System.out.println(num);
//        System.out.println(price);
//        System.out.println(grade);
//        System.out.println(language);
//        System.out.println(status);
//        System.out.println(data);

        int[] numbers = {45, 22, 89, 16, 90, 33};
        int length = numbers.length;
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Smallest:  " + min);
        System.out.println("Largest:  " + max);
    }
}
