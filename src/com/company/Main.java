package com.company;

public class Main {
    public static void main( String[] args ) {

        for (int r : new Randoms (50, 100)) {
            System.out.println ("Случайное число: " + r);
            if (r == 100) { // при достижении значения "100" - прерывание работы
                System.out.println ("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
