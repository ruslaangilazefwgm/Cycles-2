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
    }
}