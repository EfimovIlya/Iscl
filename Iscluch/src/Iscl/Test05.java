package Iscl;

import java.util.concurrent.TimeUnit;

public class Test05 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread() + ": " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        } finally {
            System.out.println("I'm in the finally block!");
        }
    }
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Test05());
        // обратите внимание на следующую строчку

        t.setDaemon(true);
        t.start();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("main() finished");
    }
}

