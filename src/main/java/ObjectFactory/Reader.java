package ObjectFactory;

import Interfaces.DictionaryReader;
import Objects.*;

import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Reader implements DictionaryReader
{
    public Dictionary read() throws JAXBException {

        Dictionary dictionary = new Dictionary(getUser(), LanguageType.ENGLISH, getWords());

        File file = new File("data.xml");//открываем файл с данными

        JAXBContext context = JAXBContext.newInstance(Dictionary.class);

        //создание объекта unmarshaller, который выполняет десериализацию
        Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
        Dictionary dic = (Dictionary) jaxbUnmarshaller.unmarshal(file);

        return dic;
    }

    //возвразает данные пользователя
    private static User getUser()
    {
        return new User("login","parol","Soshnikov","Alexander");
    }

    //возвращает слова
    private static List<Word> getWords()
    {
        Word w1 = new Word("preposition","предлог",",prepə’ziʃən");
        Word w2 = new Word("advise","советовать","əd’vɑiz");
        Word w3 = new Word("adverb","наречие","œdvə:b");
        Word w4 = new Word("black","черный","blœk");
        Word w5 = new Word("chair","стул","tʃɛə");

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(w1);
        words.add(w2);
        words.add(w3);
        words.add(w4);
        words.add(w5);

        return words;
    }

}
