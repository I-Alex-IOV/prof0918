package com.vertex;

import com.vertex.model.UsersHolder;
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
        JAXBContext jaxbContext = JAXBContext.newInstance(UsersHolder.class);
        jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    }

    @Test
    public void readXmlFromFileTest() throws JAXBException {
        File xmlFile = new File("./src/test/resources/example.xml");

        UsersHolder result = (UsersHolder) jaxbUnmarshaller.unmarshal(xmlFile);

        System.out.println(result);
    }
}
