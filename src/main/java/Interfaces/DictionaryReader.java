package Interfaces;

import Objects.Dictionary;
import javax.xml.bind.JAXBException;

public interface DictionaryReader// интерфейс считывателя данных из файла
{
    public Dictionary read();
}
