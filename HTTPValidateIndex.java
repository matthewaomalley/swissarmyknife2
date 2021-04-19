public class HTTPValidateIndex extends HTTPRequestIndex {

    //for each URL in the arraylist, create an HTTPRequestInfo object
    //and call specific methods from that class to initialize validation
    //for each URL
    public void validateIndex() {
        for (String s : urlList) {
            HTTPRequestInfo req = new HTTPRequestInfo();
            req.readURL(s);
            System.out.println(req);
            req.parse();
            req.validate();
        }
    }
}