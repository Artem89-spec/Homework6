public class Main {
    public static void main(String[] args) {

        //Задача 1
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
        System.out.println();

        //Задача 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 3
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 4
        for (int i =10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 5
        for (int i = 1904; i <= 2096; i += 4) {
            // добавил на всякий случай проверку на високосный год
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //Задача 6
        for (int i = 0; i < 98; i += 7) {
            System.out.println(i+7);
        }
        System.out.println();

        //Задача 7
        for (int i = 1;  i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 8
        int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += money;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", i+1, total);
        }
        System.out.println();

        //Задача 9
        double totalD = 0;
        double moneyD = 29000;
        double coefficient = 1.01; // 1% ежемесячно прибавляет
        for (int i = 0; i < 12; i++) {
            totalD += moneyD;
            totalD *= coefficient;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", i+1, totalD);
        }
        System.out.println();

        //Задача 10
        for (int numberTwo = 1; numberTwo <= 10; numberTwo++) {
                System.out.printf("2 * %d = %d%n", numberTwo, 2 * numberTwo);
        }
    }
}