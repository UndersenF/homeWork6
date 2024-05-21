public class Main {
    public static void main(String[] args) {
//        task1
        System.out.println("task1");

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

//        task2
        System.out.println("task2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

//        task3
        System.out.println("task3");

        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }

//        task4
        System.out.println("task4");

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

//        task5
        System.out.println("task5");
        for (int year = 1904; year < 2097; year = year + 4) {
            System.out.printf("%s является високосным\n", year);
        }

//        task6
        System.out.println("task6");

        for (int i = 7; i < 99; i += 7) {
            System.out.println(i);
        }

//        task7
        System.out.println("task7");

        for (int i = 1; i < 513; i *= 2) {
            System.out.println(i);
        }

//        task8
        System.out.println("task8");

        int capital = 0;
        for (int i = 1; i < 13; i++) {
            capital += 29000;
            System.out.printf("Месяц -  %s сумма накоплений равна - %s\n", i, capital );
        }

//        task9
        System.out.println("task9");
        double capital2 = 29000;
        double total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + capital2;
            total = total * 1.01;
            System.out.printf("Месяц -  %s сумма накоплений равна - %.2f\n", i, total );
        }

//        task10
        System.out.println("task10");

        int result = 0;

        for (int i = 1; i < 11; i++) {
            result = 2 * i;
            System.out.printf("2 * %s = %s\n", i, result);
        }
    }
}