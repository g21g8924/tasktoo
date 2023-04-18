package task2.prac2;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;

import java.io.File;

public class XmlReader {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("data.xml"));

            // use the Document object to manipulate the XML data
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
