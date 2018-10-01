package ui;

import java.io.File;
import java.io.IOException;

import logic.QueryCaller;
import queries.Queries;

public class App {
	//vi can byta den har klassen med ett bättre gransnitt
	public static void main(String[] args) throws IOException {
		Queries queries= new Queries();
		QueryCaller caller= new QueryCaller();
		
		System.out.println("=========================================================");
		System.out.println("Hämta data från kameror");
		System.out.println("=========================================================");
		caller.call(queries.queryParser(new File("./query/camera.txt")));
		
		System.out.println("\n\n=========================================================");
		System.out.println("Hämta data från väglagsdata");
		System.out.println("=========================================================");
		caller.call(queries.queryParser(new File("./query/roadcondition.txt")));
		
		System.out.println("\n\n=========================================================");
		System.out.println("Hämta data från trafiksituationerna");
		System.out.println("=========================================================");
		caller.call(queries.queryParser(new File("./query/situation.txt")));
		
		System.out.println("\n\n=========================================================");
		System.out.println("Hämta data från väderstationerna");
		System.out.println("=========================================================");
		caller.call(queries.queryParser(new File("./query/weatherstation.txt")));
	}

}
