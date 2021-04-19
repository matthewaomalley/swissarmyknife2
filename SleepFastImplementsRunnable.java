import java.util.ArrayList;

//does same as sleepFast, but implements runnable
public class SleepFastImplementsRunnable {
    public static void implementRun() {
        Sleep sleep0 = new Sleep(0);
        Sleep sleep1 = new Sleep(1);

        long start = System.currentTimeMillis();

        Thread t0 = new Thread(sleep0);
        Thread t1 = new Thread(sleep1);

        t0.start();
        t1.start();

        try {
            t0.join();
            t1.join();
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");

        ArrayList<Sleep> sleepList = new ArrayList<Sleep>();
        for (int x = 2; x < 12; x++) {
            sleepList.add(new Sleep(x));
        }

        System.out.println("\nNon-threaded ArrayList Sleep: ");
        start = System.currentTimeMillis();
        for (Sleep s: sleepList) {
            s.sleep();
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");

        System.out.println("\nThreaded ArrayList Sleep:");
        ArrayList<Thread> threadList = new ArrayList<Thread>();
        for (Sleep s: sleepList) {
            threadList.add(new Thread(s));
        }

        start = System.currentTimeMillis();
        for (Thread t: threadList) {
            t.start();
        }
        try {
            for (Thread t: threadList) {
            t.join();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");
    }
}
