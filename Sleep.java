class Sleep extends Thread{

    
    private int sleepNum;

    Sleep(int sleepNumIn) {
        sleepNum = sleepNumIn;
    }

    //puts the thread to sleep for one second and catches exception
    public void sleep() {
        System.out.println(sleepNum + " - Going to sleep");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("..." + sleepNum + " - Done Sleeping");
    }

    public void run() {
        sleep();
    }
}