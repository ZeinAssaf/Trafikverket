package queries;

public class Queries {
	/**
	 * this is a java bean that contains all the queries
	 * the class contains only getters
	 */
	private String camera="<REQUEST>\r\n" + 
			"      <LOGIN authenticationkey=\"c03705b823954e14b45027e0b833831b\" />\r\n" + 
			"      <QUERY objecttype=\"Camera\">\r\n" + 
			"            <FILTER>\r\n" + 
			"                <OR>\r\n" + 
			"                  <EQ name=\"Name\" value=\"Forsbacka\" />\r\n" + 
			"                  <EQ name=\"Name\" value=\"Storviksstationen\" />\r\n" + 
			"                  <EQ name=\"Name\" value=\"Hoforsbacken\" />\r\n" + 
			"                  <EQ name=\"Name\" value=\"Gävle\" />\r\n" + 
			"                </OR>\r\n" + 
			"            </FILTER>\r\n" + 
			"      </QUERY>\r\n" + 
			"</REQUEST>";
	private String roadCondition="<REQUEST>\r\n" + 
			"      <LOGIN authenticationkey=\"c03705b823954e14b45027e0b833831b\" />\r\n" + 
			"      <QUERY objecttype=\"RoadCondition\">\r\n" + 
			"            <FILTER>\r\n" + 
			"                <EQ name=\"LocationText\" value=\"E 16 Gävle - Hofors\" />\r\n" + 
			"            </FILTER>\r\n" + 
			"            <EXCLUDE>Geometry</EXCLUDE>\r\n" + 
			"      </QUERY>\r\n" + 
			"</REQUEST>\r\n" + 
			"";
	private String traficSituation="<REQUEST>\r\n" + 
			"      <LOGIN authenticationkey=\"c03705b823954e14b45027e0b833831b\" />\r\n" + 
			"      <QUERY objecttype=\"Situation\">\r\n" + 
			"            <FILTER>\r\n" + 
			"                <AND>                    \r\n" + 
			"                     <EQ name=\"Deviation.RoadNumberNumeric\" value=\"16\" />\r\n" + 
			"                     <EQ name=\"Deviation.CountyNo\" value=\"21\" />\r\n" + 
			"                </AND>\r\n" + 
			"            </FILTER>\r\n" + 
			"      </QUERY>\r\n" + 
			"</REQUEST>";
	private String weatherStation="<REQUEST>\r\n" + 
			"      <LOGIN authenticationkey=\"c03705b823954e14b45027e0b833831b\" />\r\n" + 
			"      <QUERY objecttype=\"WeatherStation\">\r\n" + 
			"            <FILTER>\r\n" + 
			"                <OR>\r\n" + 
			"                  <EQ name=\"Name\" value=\"Forsbacka\" />\r\n" + 
			"                  <EQ name=\"Name\" value=\"Storvik\" />\r\n" + 
			"                  <EQ name=\"Name\" value=\"Hoforsbacken\" />,\r\n" + 
			"                  <EQ name=\"Name\" value=\"Gävle\" />\r\n" + 
			"                </OR>\r\n" + 
			"            </FILTER>\r\n" + 
			"            <EXCLUDE>MeasurementHistory</EXCLUDE>\r\n" + 
						"<EXCLUDE>Geometry</EXCLUDE>\r\n"+
						"<EXCLUDE>Id</EXCLUDE>\r\n"+
			"      </QUERY>\r\n" + 
			"</REQUEST>";
	public Queries() {}
	public String getCamera() {
		return camera;
	}
	public String getRoadCondition() {
		return roadCondition;
	}
	public String getTraficSituation() {
		return traficSituation;
	}
	public String getWeatherStation() {
		return weatherStation;
	}

	

}
