public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (final int current : arr) {
            sum += current;
        }
        System.out.printf("Сумма трат за месяц составила %.2f рублей %n", (float) sum);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (final int current : arr) {
            if (min > current)
                min = current;
            if (max < current)
                max = current;
        }
        System.out.printf("Минимальная сумма трат за день составила %.2f рублей. Максимальная сумма трат за день составила %.2f рублей.%n", (float) min, (float) max);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float sum = 0;
        for (final int current : arr) {
            sum += current;
        }
        float average = sum / arr.length;
        System.out.printf("«Средняя сумма трат за месяц составила %.2f рублей %n", average);
    }

    public static void task4() {
        System.out.println("Задача 4");
        // int[ ] arr = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
