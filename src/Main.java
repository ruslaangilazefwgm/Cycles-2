public class Main {
    public static void main(String[] args) {
//        Задание 1
        System.out.println("Задание 1");
        float deposit = 15_000f;
        float total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + deposit;
            total = total + (total / 100);
            i ++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

//        Задание 2
        System.out.println("Задание 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a ++;
        }
        System.out.println();
        for (a = 10; a >= 1; a --) {
            System.out.print(a + " ");
        }
        System.out.println();

//        Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;    // population / 1000 *
        int birth = 17; // прирост
        int death = 8; // убыль
        int Y = 1; // лет

        for (Y = 1; Y <= 10; Y ++) {
            System.out.println("Год " + Y + ", численность населения составляет " + population);
            population = population + (population / 1000 * 17);
            population = population - (population / 1000 * 8);
        }

        // ДЗ 2. Задание 1
        System.out.println("ДЗ 2. Задание 1");
        float invest = 15_000f;
        //int a = 1;
        while (invest <= 12_000_000) {
            a ++;
            invest = invest + (invest * 0.07f);
            System.out.println ("Месяц " + a + ", сумма накоплений равна " + invest + " рублей");
        }

        // Задание 2.
        System.out.println();
        System.out.println("Задание 2");
        float invest1 = 15_000f;
        int b = 1;
        for (b = 1; invest1 <= 12_000_000; b++) {
            invest1 = invest1 + (invest1 * 0.07f);
            if (b % 6 == 0) {
            System.out.println ("Месяц " + b + ", сумма накоплений равна " + invest1 + " рублей");
            }
        }
        // Задание 3.
        System.out.println();
        System.out.println("Задание 3");
        float invest2 = 15_000f;
        int c = 1;
        for (c = 1; c <= 18; c++) {
            invest2 = invest2 + (invest2 * 0.07f);
            System.out.println (c +  " полгода сумма накоплений равна " + invest2 + " рублей");
        }

        // задание 4
        System.out.println();
        System.out.println("Задание 4");
        int d = 1;
        for (d = 1; d <= 31; d+=7) {
            System.out.println("Сегодня пятница, " + d + "-е число. Необходимо подготовить отчет.");
        }

        // Дз 3. Задание 1
        System.out.println();
        System.out.println("Дз 3. Задание 1");
        int e = 0;
        for (e = 0; e <= 2122; e += 79) {
            if (e >= 1822) {
            System.out.println(e);
           }
        }
    }
}