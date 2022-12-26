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

    public static void task1() {
        System.out.println("Задача 1");
        int age = 10; // возраст человека
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 0; // температура на улице
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70; // скорость автомобиля
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно»");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age =22; // возраст человека
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age >= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он очень маленький, ему надо сидеть дома");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 13; // возраст ребенка
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
         else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else  {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102; // вместимость вагона
        int sittingPlaces = 60; // сидячих мест в вагоне
        int occupied = 70; // уже занято мест в вагоне
        boolean isThereASit = occupied < capacity;
        if (isThereASit) {
            System.out.println("В вагоне есть место");
        } else {
            System.out.println("Вагон полностью забит");
        }
        if (occupied < sittingPlaces) {
            System.out.println("Есть сидячее место");
        }
        if (occupied >= sittingPlaces && occupied < capacity) {
            System.out.println("Есть только стоячее место");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one;
        int two;
        int three;
        one = 1;
        two = 10;
        three = 7;
        if (one > two && one > three) {
            System.out.println("Число " + one + " - самое большое из трех чисел");
        }
         else if (two > one && two > three) {
                System.out.println("Число " + two + " - самое большое из трех чисел");
        } else  {
                System.out.println("Число " + three + " - самое большое из трех чисел");
            }
        }
    }