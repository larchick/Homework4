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
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ",то он совершенолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то он не совершенолетний");
        }
    }

    public static void task2 () {
        System.out.println ("Задача 2");
        int degrees = 5;
        if (degrees <= 5) {
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки");
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
        int age = 18;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 24 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
            if (age >= 24 ) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
            }
    }

    public static void task5 () {
        System.out.println ("Задача 5");
        int ageKids = 14;
        if (ageKids < 5){
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (ageKids < 14){
            System.out.println("Ребенок может кататься на аттракционе только с сопровождением взрослого");
        } else {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println ("Задача 6");
        int place = 102;
        int seating = 60;
        int standing = place-seating;

        int seatsUsed = 23;
        int otherUsed = 17;
        if (seatsUsed < seating) {
            System.out.println("Есть еще " + (seating-seatsUsed) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (otherUsed < standing) {
            System.out.println("Есть еще " + (standing-otherUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет!");
        }

    }

    public static void task7 () {
        System.out.println ("Задача 7");
        int one=5;
        int two=5;
        int three=5;
        if (one>two && one>three){
            System.out.println("Максимальное число" + one);
        } else if (two>one && two>three){
            System.out.println("Максимальное число" + two);
        } else if (three>one && three>two) {
            System.out.println("Максимальное число" + three);
        } else {
            System.out.println("Все числа равны");
        }
    }
}