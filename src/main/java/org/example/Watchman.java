package org.example;

public class Watchman {
    private  Park park;
    String name;



    public void whistle(){
        System.out.println(name+" свистит");
    }


    public void setPark(Park park) {
        this.park = park;
    }

    public Watchman(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Watchman{" +
                "park=" + park +
                ", name='" + name + '\'' +
                '}';
    }
}
