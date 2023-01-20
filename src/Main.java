import java.sql.SQLOutput;

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
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte temperatures = 4;
        if (temperatures > 5) {
            System.out.println("На улице " + temperatures + " нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperatures + " можно идти без шапки.");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        short carSpeed = 61;
        if (carSpeed > 60) {
            System.out.println("Скорость привышена");
        } else {
            System.out.println("Если скорость " + carSpeed + " ,то можно ездить спокойно");
        }
        if (carSpeed < 60) {
            System.out.println("Привышения скорости нет");
        } else {
            System.out.println("Если скорость " + carSpeed + " ,то  придется заплатить штраф");
        }
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte age = 25;
        boolean litlleAge = age >= 2 && age <= 6;
        boolean middleAge = age >= 7 && age <= 18;
        boolean bigAge = age >= 18 && age <= 24;
        if (litlleAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в сад");
        } else if (middleAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (bigAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        System.out.println(" ");
    }
      public static void task5() {
        System.out.println("Задача 5");
        byte age5 = 4;
        boolean adult = false;
        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен " + age5 + " то он не может кататься на аттракционе.");
        }
        if (age5 > 5 && age5 < 14 && adult == true) {
            System.out.println("Если возраст ребенка равен " + age5 + " то он может кататься только в сопровождении взрослого.");
        }if (age5 > 5 && age5 < 14 && adult != true) {
            System.out.println("Если взрослого нет, то кататься нельзя.");}
        if (age5 > 14) {
            System.out.println("Если возраст ребенка равен " + age5 + " то он может кататься сопровождения взрослого.");}
          System.out.println(" ");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte ticketNumber = 103;
        byte capacityOfOneWagon = 102;
        byte sittingPlace = 60;
        if (ticketNumber < sittingPlace) {
            System.out.println("В вагоне есть и стоясие и сидячие места");
        } else if (ticketNumber > sittingPlace && ticketNumber < capacityOfOneWagon) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("вагон уже полностью забит");}
        System.out.println(" ");
    }

        public static void task7() {
            System.out.println("Задача 7");
            int one = 523;
            int two =  45;
            int three = 444;
            boolean oneBigger = (one > two && one > three);
            boolean twoBigger = (two > one && two > three);
            if (oneBigger) {
                    System.out.println("Самое большее число " + one);} else if (twoBigger) {
                    System.out.println("Самое большое число " + two);} else {
                    System.out.println("Самое большее число " + three);}
            }
       }


