package ObjectFactory;

import Interfaces.DictionaryReader;
import Objects.*;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Reader implements DictionaryReader
{
    public Dictionary read() throws JAXBException
    {
        File file = new File("data.xml");//открываем файл с данными

        JAXBContext context = JAXBContext.newInstance(Dictionary.class);

        //создание объекта unmarshaller, который выполняет десериализацию
        Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
        Dictionary dic = (Dictionary) jaxbUnmarshaller.unmarshal(file);

        return dic;
    }
}
