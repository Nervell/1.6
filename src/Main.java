import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Задание номер 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задание номер 2
        int min = 0;
        int max = 0;
        arr = generateRandomArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            if (max > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        //Задание номер 3
        arr = generateRandomArray();
        int newSum = 0;
        float average = 0;
        int days = 0;
        for (int element: arr) {
            newSum += element;
        }

        for (int element: arr) {
            days += 1;
        }
        System.out.println("Средняя сумма трат за месяц составила " + newSum / days + " рублей");

        //Задание номер 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int counter = 0;
        String fullName = "";
        for (int element: reverseFullName) {
            counter += 1;
        }
        for (int i = counter -1; i != -1 ; i--) {
            fullName += reverseFullName[i];
        }
        System.out.println(fullName);
    }
}