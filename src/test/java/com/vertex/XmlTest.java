package com.vertex;

import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlTest {

    private Unmarshaller jaxbUnmarshaller;

    @Before
    public void setUp() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(JsonTest.UsersHolder.class);
        jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    }

    @Test
    public void readXmlFromFileTest() throws JAXBException {
        File xmlFile = new File("./src/test/resources/example.xml");

        JsonTest.UsersHolder result = (JsonTest.UsersHolder) jaxbUnmarshaller.unmarshal(xmlFile);

        System.out.println(result);
    }
}
