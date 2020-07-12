package ObjectFactory;

import Interfaces.DictionaryGenerator;
import Objects.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Generator implements DictionaryGenerator
{
    private char[] s = "abcdefghijklmnopqrstuvwxyz".toCharArray();// массив символов для имитации данных словаря

    public Generator(){}

    //метод, возвращающий словарь, заполненный случайными данными
    public Dictionary generate()
    {
        return new Dictionary(getUser(),getLanguage(),getWords());
    }

    private User getUser() //создание пользователя
    {

        String userFields[] = new String[4];

        for (int i = 0; i < userFields.length; i++)
        {
            userFields[i] = getString();
        }

        return new User(userFields[0],userFields[1],userFields[2],userFields[3]);
    }

    private LanguageType getLanguage()// случайный выбор языка
    {
        String[] types = {"DEUTCH","ENGLISH"};
        return LanguageType.valueOf(types[new Random().nextInt(1)]);
    }

    private List<Word> getWords()// генерация слов, их транскрипций и перевода
    {
        ArrayList<Word> words = new ArrayList<Word>();
        String wordFields[] = new String[3];

        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < wordFields.length; j++)
            {
                wordFields[j] = getString();
            }

            words.add(new Word(wordFields[0],wordFields[1],wordFields[2]));
        }

        return words;
    }


    private String getString() //генерация случайной строки
    {
        Random rand = new Random();
        int size = 1 + rand.nextInt(8);

        String str = "";

        for (int i = 0; i < size; i++)
        {
            str += s[rand.nextInt(s.length)];
        }

        return str;
    }

}
