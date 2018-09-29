package logic;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class QueryCaller {
	//Den här är samma kod som skickade jag gjorde den bara en klass som man kan återanvända

    private static final String URL = "http://api.trafikinfo.trafikverket.se/v1/data.json";
    public QueryCaller() {}
    
    
    //This method makes the call
    public void call(String query) throws IOException {
    	
    	URL obj = new URL(URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/xml; charset=ISO-8859-1");
        OutputStream out = new DataOutputStream(con.getOutputStream());
        out.write(query.getBytes());
        out.flush();
        out.close();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String input;
        StringBuffer response = new StringBuffer();

        while ((input = in.readLine()) != null) {
            response.append(input);
        }
        System.out.println(response.toString());
        in.close();
    }
}