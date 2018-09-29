package queries;

public class Queries {
	
	//Här skulle du kunna göra alla queryn och sätta get metod till dem
	private final String testQuery="<REQUEST>\r\n" + 
    		"      <LOGIN authenticationkey=\"b9f437d1289e44eebafe6535502b1fd2\" />\r\n" + 
    		"      <QUERY objecttype=\"TrainMessage\">\r\n" + 
    		"            <FILTER>\r\n" + 
    		"                  <EQ name=\"AffectedLocation\" value=\"Cst\" />\r\n" + 
    		"            </FILTER>\r\n" + 
    		"            <INCLUDE>StartDateTime</INCLUDE>\r\n" + 
    		"            <INCLUDE>LastUpdateDateTime</INCLUDE>\r\n" + 
    		"            <INCLUDE>ExternalDescription</INCLUDE>\r\n" + 
    		"            <INCLUDE>ReasonCodeText</INCLUDE>\r\n" + 
    		"      </QUERY>\r\n" + 
    		"</REQUEST>";

	public String getTestQuery() {
		return testQuery;
	}
	

}
