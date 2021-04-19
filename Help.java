public class Help {
    public static void printHelp() {
        //simply prints instructions on how to use program with examples
        System.out.println("\n" + "*****SWISS ARMY KNIFE HELP MENU*****");
        System.out.print("SAK is a helpful tool that allows users to extract useful information "
        + "from anywhere on the internet" + "\n" + "and parse through it in order to get the info desired! ");
        System.out.println("Here are the following commands available followed by their use:" + "\n");
        System.out.println("java sak -HttpRequest [URL]             Pulls all available information from the website entered.");
        System.out.println("java sak -HttpRequestIndex [URL]        Pulls and displays JSON content from a URL information");
        System.out.println("java sak -HttpValidateIndex [URL]       Validates JSON information in URL and displays the results");
        System.out.println("java sak -Sleep                         Puts two threads to sleep");
        System.out.println("java sak -SleepFast                     Compares multi-threaded sleeps and arraylist nonthread/threaded sleep times");
        System.out.println("java sak -SleepFastImplementsRunnable   Implements runnable on threaded sleep via thread arraylist");
        System.out.println("\n" + "*****EXAMPLES*****");
        System.out.println("java sak -HttpRequest https://usa.yamaha.com");
        System.out.println("java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");
        System.out.println("java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");
        System.out.println("java sak -Sleep");
        System.out.println("java sak -SleepFast");
        System.out.println("java sak -SleepImplementsRunnable");
        System.out.println("Use command -Help to see this menu again" + "\n");

    }

}
