import java.util.ArrayList;

public class SleepFast {
    public static void fastsleep() {
        //two sleeps
        Sleep sleep0 = new Sleep(0);
        Sleep sleep1 = new Sleep(1);

        long start = System.currentTimeMillis();

        sleep0.start();
        sleep1.start();

        //sleepFast displays multithreaded sleep function
        try {
            sleep0.join();
            sleep1.join();
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");

        ArrayList<Sleep> sleepList = new ArrayList<Sleep>();
        for (int x = 2; x < 12; x++) {
            sleepList.add(new Sleep(x));
        }

        //displays non-threaded sleep in an arraylist
        System.out.println("\nNon-threaded ArrayList Sleep: ");
        start = System.currentTimeMillis();
        for (Sleep s: sleepList) {
            s.sleep();
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");

        //displays threaded sleep in arraylist
        System.out.println("\nThreaded ArrayList Sleep:");
        start = System.currentTimeMillis();
        for (Sleep s: sleepList) {
            s.start();
        }
        try {
            for (Sleep s: sleepList) {
                s.join();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");
    }
}

