package create.Pages;

import java.io.File;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;

public class TestData {
	public static String getData(String key) throws Exception {
		File inputFile = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\testData"+"\\NewFile.xml");
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(inputFile);
		String output = document.selectSingleNode(key).getText();
		return output;
	}
}
