public class Main {
    public static void main(String[] args) {
        //Задание 1 Объявление 3-х массивов
        int [] numbers;
        numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double [] numbers1 = {1.57, 7.654, 9.986};

        int [] jobYears = {2017, 2018, 2019, 2020, 2021};

        //Задание 2 Распечатать элементы массивов через запятую.
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < numbers1.length; i++) {
            if (i == numbers1.length - 1) {
                System.out.print(numbers1[i]);
            } else {
                System.out.print(numbers1[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < jobYears.length; i++) {
            if (i == jobYears.length - 1) {
                System.out.print(jobYears[i]);
            } else {
                System.out.print(jobYears[i] + ", ");
            }
        }
        System.out.println();

        //Задание 3 Распечатать массивы в обратной последовательности

        for (int i = numbers.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();

        for (double i = numbers1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers1[(int) i]);
            } else {
                System.out.print(numbers1[(int) i] + ", ");
            }
        }
        System.out.println();

        for (int i = jobYears.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(jobYears[i]);
            } else {
                System.out.print(jobYears[i] + ", ");
            }
        }
        System.out.println();

        //Задание 4 Все нечетные числа сделать четными для целочисленного массива

        for (int i = 0; i <= numbers.length-1; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + 1 + ", ");
                if (numbers[i] == numbers[i]++) {
                    if (i == numbers.length - 1) {
                        System.out.print(numbers[i]);
                    } else {
                        System.out.print(numbers[i] + ", ");
                    }
                }
            }
        }

    }
}