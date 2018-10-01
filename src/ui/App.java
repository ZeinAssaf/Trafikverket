package ui;

import java.io.File;
import java.io.IOException;

import logic.QueryCaller;
import queries.Queries;

public class App {
	//vi can byta den har klassen med ett b�ttre gransnitt
	public static void main(String[] args) throws IOException {
		Queries queries= new Queries();
		QueryCaller caller= new QueryCaller();
		
		System.out.println("=========================================================");
		System.out.println("H�mta data fr�n kameror");
		System.out.println("=========================================================");
		caller.call(queries.queryParser(new File("./query/camera.txt")));
		
		System.out.println("\n\n=========================================================");
		System.out.println("H�mta data fr�n v�glagsdata");
		System.out.println("=========================================================");
		caller.call(queries.queryParser(new File("./query/roadcondition.txt")));
		
		System.out.println("\n\n=========================================================");
		System.out.println("H�mta data fr�n trafiksituationerna");
		System.out.println("=========================================================");
		caller.call(queries.queryParser(new File("./query/situation.txt")));
		
		System.out.println("\n\n=========================================================");
		System.out.println("H�mta data fr�n v�derstationerna");
		System.out.println("=========================================================");
		caller.call(queries.queryParser(new File("./query/weatherstation.txt")));
	}

}
