public class HTTPRequestInfo extends HttpRequest{
    
    //initializes all Strings that will be used for storage and validation, not all used in validation.
    private String firstName, lastName, preferredName, email, city, state, favoriteHobby;
    private String phoneNum, zip, seatNum;

    //re-initialize each variable used for validation every instance of this class
    HTTPRequestInfo() {
        firstName = "";
        lastName = "";
        preferredName = "";
    }

    //parse method parses each line found and stores the proper values into strings
    //for validation
    public void parse() {
        for (String x : urlContent) {
            String[] section = x.split("\"");
            if (section.length > 3) {
                if (section[1].equals("firstName")) {
                    firstName = section[3];
                }
                if (section[1].equals("lastName")) {
                    lastName = section[3];
                }
                if (section[1].equals("preferredName")) {
                    preferredName = section[3];
                }
                if (section[1].equals("email")) {
                    email = section[3];
                }
                if (section[1].equals("phoneNum")) {
                    phoneNum = section[3];
                }
                if (section[1].equals("city")) {
                    city = section[3];
                }
                if (section[1].equals("state")) {
                    state = section[3];
                }
                if (section[1].equals("zip")) {
                    zip = section[3];
                }
                if (section[1].equals("favoriteHobby")) {
                    favoriteHobby = section[3];
                }
                if (section[1].equals("seatNum")) {
                    seatNum = section[3];
                }
            }
        }
    }

    //validation method first makes sure there is content inside the URL,
    //and then validates that firstName and lastName exist, and verifies
    //they are within bounds. Method also verifies that preferredName is 
    //within bounds iff it exists.
    public void validate() {
        //if there is nothing in the file, throw error message
        if (urlContent.size() == 0) {
            System.out.println("\n" + "Checking URL: " + requestURL);
            System.out.println("FAILURE: [No file found]");
        }

        //if any of these conditions are met, throw error message
        if (firstName.length() == 0) {
            System.out.println("\n" + "Checking URL: " + requestURL);
            System.out.println("FAILURE: ['firstName' does not exist]");
            System.out.println("");
        } else if (firstName.length() < 2 || firstName.length() > 17) {
            System.out.println("\n" + "Checking URL: " + requestURL);
            System.out.println("FAILURE: ['firstName' is out of bounds]");
            System.out.println("");
        } else if (lastName.length() == 0) {
            System.out.println("\n" + "Checking URL: " + requestURL);
            System.out.println("FAILURE: ['lastName' does not exist]");
            System.out.println("");
        } else if (lastName.length() < 2 || lastName.length() > 17) {
            System.out.println("\n" + "Checking URL: " + requestURL);
            System.out.println("FAILURE: ['lastName' is out of bounds]");
            System.out.println("");
        } else if (preferredName.length() != 0)
            if (preferredName.length() < 2 || preferredName.length() > 17) {
            System.out.println("\n" + "Checking URL: " + requestURL);
            System.out.println("[FAILURE: 'preferredName' exists, but is out of bounds]");
            System.out.println("");
        }
        else {
            System.out.println("Checking URL: " + requestURL);
            System.out.println("SUCCESS: [All tests passed]" + "\n");
        }
    }
}