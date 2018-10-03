package logic;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class QueryCaller {
	/**
	 * This class makes the call to trafikverkets API
	 * Call method works by passing the query as an attribute and it returns the response as a string  
	 */

    private static final String URL = "http://api.trafikinfo.trafikverket.se/v1.3/data.xml";
    public QueryCaller() {}
    
    
    //This method makes the call
    public String call(String query) throws IOException {
    	
    	URL obj = new URL(URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
        OutputStream out = new DataOutputStream(con.getOutputStream());
        out.write(query.getBytes());
        out.flush();
        out.close();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String input;
        StringBuilder response = new StringBuilder();

        while ((input = in.readLine()) != null) {
            response.append(input);
        }
        in.close();
        return response.toString();
    }
}