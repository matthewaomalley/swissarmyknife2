import java.util.ArrayList;

public class HTTPRequestIndex extends HttpRequest {
    protected ArrayList<String> urlList = null;

    //constructor calls to super to utilize HttpRequest
    HTTPRequestIndex() {
        super();
        urlList = new ArrayList<String>();
    }

    public Boolean readURL(String requestURL) {
        Boolean returnValue = super.readURL(requestURL);
        parseIt();
        System.out.println("");
        return returnValue;
    }

    //parses out the additional URL's found and puts them into an arraylist
    public void parseIt() {
        for (String s : urlContent) {
            String[] url = s.split("\"");
            if (url.length > 12) {
                urlList.add(url[11]);
                System.out.println("- " + url[11]);
            }
        }
    }

    //for each URL in the arraylist, create a new HttpRequest (read the info inside)
    public void readFiles() {
        for (String s : urlList) {
            HttpRequest req = new HttpRequest();
            req.readURL(s);
            System.out.println(req);
        }
    }
}

   

