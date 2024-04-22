package org.example;

public class Manager {
    public Context getSimpleContext(){
        Context context = new Context();
        context.watchman = new Watchman("Иванов");
        context.park = new Park();
        context.park.setWatchman(context.watchman);
        context.watchman.setPark(context.park);
        return context;
    }
}
