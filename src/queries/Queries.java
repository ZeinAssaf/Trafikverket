package queries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Queries {
	
	// Takes a queryfile
	public String queryParser(File queryFile) {
		
		String line;
		
		try {
			FileReader fr = new FileReader(queryFile);
			BufferedReader in = new BufferedReader(fr);
			line = in.readLine();
			
			StringBuilder sb = new StringBuilder();
					
		     while ( line != null ) 
		     {
		       sb.append(line);
		       sb.append(System.getProperty("line.separator"));
		       line = in.readLine();
		     }
		     
		     in.close();
		     // för loggning
		     System.out.println( sb.toString() );
		     
		     return sb.toString();
		     
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return ""; 
	}

}
