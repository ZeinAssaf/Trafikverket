package ui;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import logic.QueryCaller;
import logic.XMLParser;
import queries.Queries;

public class App {
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		Queries queries= new Queries();
		QueryCaller caller= new QueryCaller();
		XMLParser parser= new XMLParser();
		
		System.out.println("=========================================================");
		System.out.println("Hämta data från kameror");
		System.out.println("=========================================================");
		String cameraResponse=caller.call(queries.getCamera());
		String mainNodeInCameraResponse="Camera";
		parser.parse(cameraResponse,mainNodeInCameraResponse );
		
		
		
		System.out.println("\n\n=========================================================");
		System.out.println("Hämta data från väglagsdata");
		System.out.println("=========================================================");
		String roadSituation=caller.call(queries.getRoadCondition());
		String mainNodeInRoadSituationResponse="Situation";
		parser.parse(roadSituation,mainNodeInRoadSituationResponse );
		
		System.out.println("\n\n=========================================================");
		System.out.println("Hämta data från trafiksituationerna");
		System.out.println("=========================================================");
		String traficSituation=caller.call(queries.getTraficSituation());
		System.out.println(traficSituation);
		String mainNodeInTraficSituationResponse="Situation";
		parser.parse(traficSituation, mainNodeInTraficSituationResponse);
		
		System.out.println("\n\n=========================================================");
		System.out.println("Hämta data från väderstationerna");
		System.out.println("=========================================================");
		String weatherResponse=caller.call(queries.getWeatherStation());
		String mainNode="WeatherStation";
		parser.parse(weatherResponse,mainNode);
	}

}
