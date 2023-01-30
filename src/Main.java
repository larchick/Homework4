public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println ("Задача 1");
        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ",то он совершенолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ",то он не совершенолетний");
        }
    }

    public static void task2 () {
        System.out.println ("Задача 2");
        int degrees = 5;
        if (degrees <= 5) {
            System.out.println("На улице " + degrees + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + degrees + " градусов можно идти без шапки");
        }
    }

    public static void task3 () {
        System.out.println ("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость "+ speed +", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+ speed +", то можно ездить спокойно");
        }

    }

    public static void task4 () {
        System.out.println ("Задача 4");
        int age = 7;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
    }

    public static void task5 () {
        System.out.println ("Задача 5");

    }

    public static void task6 () {
        System.out.println ("Задача 6");

    }

    public static void task7 () {
        System.out.println ("Задача 7");

    }
}