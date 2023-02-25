public class Main {
    public static void isYearLeap (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный");
        }
        else System.out.println(year + " год - невисокосный");
    }
    public static void downloadOS (int OS, int year) {
        if (OS == 0) {
            if (year >= 2015) {
                System.out.println("Скачайте приложение для IOS по ссылке");
            } else {
                System.out.println("Скачайте облегченную версию приложения для IOS по ссылке");
            }
        } else if (year >= 2015) {
            System.out.println("Скачайте приложение для Android по ссылке");
        } else {
            System.out.println("Скачайте облегченную версию приложения для Android по ссылке");
        }
    }
    public static int deliverCard (int distance) {
        int days = 0;
        if (distance <= 20) {
            ++days;
        } else ++days;
        if (distance > 20 && distance <= 60) {
            ++days;
        } else ++days;
        if (distance > 60 && distance <= 100) {
            ++days;
        } else if (distance > 100) {
            days = 0;
        }
        return days;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        System.out.println("ДЗ сделано");
    }
    public static void task1() {
        System.out.println("Задача 1:");
        int year = 2004;
        isYearLeap(year);
    }
    public static void task2() {
        System.out.println("Задача 2:");
        int OS = 0;
        int year = 2015;
        downloadOS(OS, year);
    }
    public static void task3() {
        System.out.println("Задача 3:");
        int distance = 77;
        System.out.println("Доставка займет " + deliverCard(distance) + " дней");
    }
}