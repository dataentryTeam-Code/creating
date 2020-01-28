package create.Pages;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
public class TestData 
{
	public static String getData(String tagName) throws Exception 
	{
		File inputFile = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\testData"+"\\NewFile.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
		doc.getDocumentElement().normalize();
		String output = doc.getElementsByTagName(tagName).item(0).getTextContent();
		return output;
	}
	public static String getProperties(String key) throws Exception {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\testData"+"\\url.properties");
		Properties obj = new Properties();
		obj.load(file);
		String output = obj.getProperty(key);
		return output;
	}
}
