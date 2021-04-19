public class sak {
    public static void main(String[] args) {
        long startTime, endTime, timeElapsed;
        startTime = System.nanoTime();
        System.out.println("");
        //if there is no entered parameter, send error message
        ew

        //if the -Help option is entered, call the -Help class
        else if (args[0].equalsIgnoreCase("-Help")) {
            System.out.println("Printing Help Menu...");
            Help.printHelp();

        }

        //if the -HttpRequest is entered, call it and throw error message
        //if there is no URL entered as a parameter
        else if (args[0].equalsIgnoreCase("-HttpRequest")) {
            System.out.println("Printing HttpRequest...");
            if (args.length < 2) {
                System.out.println("ERROR: The -HttpRequest function needs a URL as a second"
                + "parameter.");
            } else {
                String URL = args[1];
                HttpRequest req = new HttpRequest();
                if (req.readURL(URL)) {
                    System.out.println(req);
                }
            }
        }

        //if the -HttpRequestIndex is entered, call it and throw error message
        //if there is no URL entered as a parameter
        else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
            System.out.println("Printing HttpRequestIndex" + "\n");
            if (args.length != 2) {
                System.out.println("ERROR: The -HttpValidate function needs a URL as a second"
                + "parameter.");
            } else {
                String indexURL = args[1];
                HTTPRequestIndex requestIndex = new HTTPRequestIndex();
                if (requestIndex.readURL(indexURL)) {
                   System.out.println(requestIndex);
                    requestIndex.readFiles();
                }
            }
        }

        else if (args[0].equalsIgnoreCase("-Sleep")) {
            System.out.println("Starting Sleep...");

            Sleep sleep0 = new Sleep(0);
            Sleep sleep1 = new Sleep(1);

            System.out.println("\nSleep");
            long start = System.currentTimeMillis();
         
            sleep0.sleep();
            sleep1.sleep();

            System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");
            
        }

        else if (args[0].equalsIgnoreCase("-SleepFast")) {
            System.out.println("Starting SleepFast...");
            SleepFast.fastsleep();
        }

        else if (args[0].equalsIgnoreCase("-SleepFastImplementsRunnable")) {
            System.out.println("Starting SleepFastImplementsRunnable");
            SleepFastImplementsRunnable.implementRun();
        }

        //executes -HTTPValidateIndex if a URL parameter is provided, else throws error
        else if (args[0].equalsIgnoreCase("-HTTPValidateIndex")) {
            if (args.length != 2) {
                System.out.println("ERROR: invalid format. Program requires 'java sak -HttpValidateIndex [URL]'");
            } else {
                String indexURL = args[1];
                HTTPValidateIndex requestIndex = new HTTPValidateIndex();
                if (requestIndex.readURL(indexURL)) {
                    System.out.println(requestIndex);
                    requestIndex.validateIndex();
                }
            }
        }
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Elapsed time in milliseconds: " + timeElapsed / 1000000);
    }
}