public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3};

        System.out.println("Содержимое массива numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }



        int[] numbers1 = new int[]{1, 2, 3};
        double[] fractions = new double[]{1.57, 7.654, 9.986};
        String[] names = new String[]{"John", "Mary", "Alex"};

        System.out.println("Целочисленный массив:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i]);
            if (i < numbers1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Массив с дробными числами:");
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i < fractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Произвольный массив:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i < names.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();



        int[] numbers2 = new int[]{1, 2, 3};
        double[] fractions1 = new double[]{1.57, 7.654, 9.986};
        String[] names2 = new String[]{"John", "Mary", "Alex"};

        System.out.println("Целочисленный массив в обратном порядке:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Массив с дробными числами в обратном порядке:");
        for (int i = fractions.length - 1; i >= 0; i--) {
            System.out.print(fractions[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Произвольный массив (в обратном порядке):");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();






        int[] numbers3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Исходный массив:");
        for (int number : numbers3) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] % 2 != 0) { // Проверяем, является ли число нечетным
                numbers3[i] += 1; // Прибавляем 1 к нечетному числу
            }
        }

        System.out.println("Массив после преобразования:");
        for (int number : numbers3) {
            System.out.print(number + " ");
        }
        System.out.println();






    }
}
