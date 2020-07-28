package ObjectFactory;

import Objects.Dictionary;
import javax.xml.bind.JAXBException;

public class DictionaryCreationFactory // фабрика для создания объекта словаря
{
    public static final DictionaryCreationFactory instance = new DictionaryCreationFactory();

    private DictionaryCreationFactory(){}

    public static DictionaryCreationFactory getInstance()
    {
        return instance;
    }

    //метод, генерирующий словарь
    public Dictionary getDictionary(Generator generator)
    {
        return generator.generate();
    }

    //метод, считывающий данные словаря из файла
    public Dictionary getDictionary(Reader reader) throws JAXBException{return reader.read();}
}
