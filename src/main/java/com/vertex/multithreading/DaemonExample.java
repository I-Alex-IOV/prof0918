package com.vertex.multithreading;

public class DaemonExample {

    public static final int CICLE_TIME = 100;

    public static void main(String[] args) throws InterruptedException {
        Runnable daemon = getDaemonRunnable();

        System.out.println("Starting daemon");
        Thread daemonThread = new Thread(daemon);
        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread.sleep(15 * CICLE_TIME);
        System.out.println("Going to finish parent thread");
        Thread.sleep(CICLE_TIME / 4);
    }

    private static Runnable getDaemonRunnable() {
        return () -> {
            int i = 1;
            while (true) {
                try {
                    System.out.println(i++ + " inside daemon");
                    Thread.sleep(CICLE_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("finishing daemon thread");
                }
            }
        };
    }
}
