package logic;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser {
	private DocumentBuilder dbulder;
	private Document document;
	/**
	 * THis class is responsible for parsing an XML response to a human readable text and prints the content to the console
	 * parse method works by passing the response and the main node in a response to extract information from
	 * know that parse method prints out the response automatically 
	 */
	public XMLParser() {}
	
	public void parse(String response,String mainNode){
		try {

			dbulder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			document = dbulder.parse(new ByteArrayInputStream(response.getBytes()));
			document.getDocumentElement().normalize();
			
			//we make the first list of nodes
			
			NodeList parentlist=document.getElementsByTagName(mainNode);
			
			//The first loop in WeatherStation have children
			
			for (int i = 0; i < parentlist.getLength(); i++) {
				Node node1= parentlist.item(i);
				Element element=(Element)node1;
				System.out.println("\nCurrent elemnt :"+element.getNodeName() +" that has the index of: "+i +"\n");
				
				//check if the element is a tree element
				if (node1.getNodeType()==Node.ELEMENT_NODE) {
					//Element element=(Element)node1;
					NodeList childList=node1.getChildNodes();
					
					//We loop through the first list of nodes
					for(int j=0;j<childList.getLength();j++) {
						
						Node node2=childList.item(j);
						
						if (node2.hasChildNodes()) {
							System.out.println(node2.getNodeName()+" : "+node2.getTextContent());
						}
						else {
							System.out.println(node2.getNodeName()+" : "+node2.getTextContent());
							}
						}
					}
			}
			
		
		} catch (ParserConfigurationException e) {
			e.getMessage();
		}
		catch (SAXException e) {
			e.getMessage();
		}
		catch (IOException e) {
			e.getMessage();
		}
	}

}
