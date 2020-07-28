import ObjectFactory.DictionaryCreationFactory;
import ObjectFactory.Reader;
import Objects.Dictionary;
import javax.xml.bind.JAXBException;


public class Main
{
    public static void main(String[] args) throws JAXBException
    {
        //ObjectFactory.Generator gen = new ObjectFactory.Generator(); //создаем генератор данных

        Reader reader = new Reader();

        Dictionary dic = DictionaryCreationFactory.getInstance().getDictionary(reader);

       // Dictionary dic = ObjectFactory.DictionaryCreationFactory.getInstance().getDictionary(gen); //получаем объект из фабрики

        dic.printDictionaryInfo();
    }
}
