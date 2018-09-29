package ui;

import java.io.IOException;

import logic.QueryCaller;
import queries.Queries;

public class App {
	//vi can byta den har klassen med ett bättre gransnitt
	public static void main(String[] args) throws IOException {
		Queries queries= new Queries();
		QueryCaller caller= new QueryCaller();
		caller.call(queries.getTestQuery());
	}

}
