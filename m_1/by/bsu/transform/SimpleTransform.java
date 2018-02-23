package m_1.by.bsu.transform;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class SimpleTransform {
    public static void main(String[] args) {
        try{
            TransformerFactory tf  = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer(new StreamSource("student.xsl"));
            transformer.transform(new StreamSource("students.xml"),new StreamResult("new.xml"));
        } catch (TransformerConfigurationException e){
            System.err.println("Impossible transform file : "+e);
        } catch (TransformerException e){
            System.err.println("Impossible transform file xml : "+e);
        }
    }
}
