package com.vertex;

import jdk.nashorn.api.scripting.URLReader;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;

public class XmlTest {

    private JAXBContext jaxbContext;
    private Unmarshaller jaxbUnmarshaller;

    @Before
    public void setUp() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(JsonTest.UsersHolder.class);
        jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    }

    @Test
    public void readXmlFromFileTest() throws IOException, XMLStreamException, JAXBException {
        try (URLReader reader = new URLReader(JsonTest.getResource("example.xml"))) {
            XMLStreamReader xmlReader = XMLInputFactory.newFactory().createXMLStreamReader(reader);
            JsonTest.UsersHolder customer = jaxbUnmarshaller.unmarshal(xmlReader, JsonTest.UsersHolder.class).getValue();

            System.out.println(customer);
        }
    }
}
