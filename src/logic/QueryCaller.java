package logic;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;







public class QueryCaller {
	/**
	 * This class makes the call to trafikverkets API
	 * Call method works by passing the query as an attribute and it returns the response as a string  
	 */

    private static final String url = "http://api.trafikinfo.trafikverket.se/v1.3/data.xml";
    private OutputStream out;
    private BufferedReader in;
    private StringBuilder response;
    public QueryCaller() {}
    
    
    //This method makes the call
	public String call(String query) {
    	String input;
    	try {
        	URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
            out = new DataOutputStream(con.getOutputStream());
            out.write(query.getBytes());
            out.flush();
            
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            response = new StringBuilder();
            while ((input = in.readLine()) != null) {
                response.append(input);
            }
            out.close();
    		in.close();
    		return response.toString();
			
		} catch (MalformedURLException e) {
			 return e.getMessage();
		}
    	catch (IOException e) {
    		return e.getMessage();
		}

    }
}