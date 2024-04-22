package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //example0();

       // example1();

        example2();
    }

    private static void example2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("parkContext2.xml");
        Watchman w1 = context.getBean("watchman1", Watchman.class);
        Watchman w2 = context.getBean("watchman2", Watchman.class);

        System.out.println(w1);
        System.out.println(w2);

        Watchman w3 = context.getBean("watchman2", Watchman.class);
        System.out.println(w3);
        w3.name = "Баранов";
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        Watchman w4 = context.getBean("watchman1", Watchman.class);
        w4.name = "Гаврилов";

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
    }

    private static void example1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("parkContext1.xml");
        Watchman watchman = context.getBean("watchman", Watchman.class);
        Park park = context.getBean("park", Park.class);

        park.doNoise();
        park.doNotWalkOnTheGrass();
        System.out.println(watchman);
    }

    private static void example0() {
        Manager m = new Manager();
        Context context = m.getSimpleContext();
        Watchman watchman = context.getWatchman();
        Park park = context.getPark();

        context.park.doNoise();
        park.doNotWalkOnTheGrass();
        System.out.println(watchman);
    }
}