package com.runoob.multithreading;

class ThreadDemo extends Thread {
    private Thread t;

    ThreadDemo (String name) {
        this.setName(name);
        System.out.println("Creating " + this.getName());
    }

    @Override
    public void run() {
        System.out.println("Running " +  this.getName() );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + this.getName() + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  this.getName() + " interrupted.");
        }
        System.out.println("Thread " +  this.getName() + " exiting.");
    }

    @Override
    public synchronized void start() {
        System.out.println("Starting " +  this.getName() );
        if (t == null) {
            t = new Thread (this, this.getName());
            t.start ();
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Thread-1");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("Thread-2");
        t2.start();
    }
}
