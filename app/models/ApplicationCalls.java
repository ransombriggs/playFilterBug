package models;

import java.util.concurrent.atomic.AtomicLong;

public class ApplicationCalls {

    static AtomicLong numCalls = new AtomicLong(0);

    public static void increment() {
        numCalls.incrementAndGet();
    }

    public static long get() {
        return numCalls.get();
    }

}
