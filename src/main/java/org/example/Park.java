package org.example;

public class Park {
    Watchman watchman;

    public void setWatchman(Watchman watchman) {
        this.watchman = watchman;
    }

    public void doNoise(){
        System.out.println("парк шумит");
    }

    public void doNotWalkOnTheGrass(){
        System.out.print("шаг на газон... ");
        if(watchman != null)
            watchman.whistle();
        else
            System.out.println("а мы все вытопчем");
    }
}
