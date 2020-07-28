package Objects;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement //аннотации для парсинга класса Dictionary
public class Dictionary
{
    private Long id;
    private User user;
    private LanguageType languageType;
    private List<Word> words;
    static private Long dictionaryCount = (long)0;

    public Dictionary(User user, LanguageType languageType, List<Word> words)
    {
        this.id = ++dictionaryCount;
        this.user = user;
        this.languageType = languageType;
        this.words = words;
    }

    public Dictionary(){}

    //геттеры
    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public List<Word> getWords() {
        return words;
    }


    //сеттеры
    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement
    public void setUser(User user) {
        this.user = user;
    }

    @XmlElement
    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    @XmlElementWrapper
    public void setWords(List<Word> words) {
        this.words = words;
    }

    // вывод всех данных словаря в консоль
    public void printDictionaryInfo()
    {
        System.out.println("Dictionary id = " + getId() + "\n" + "Language: " + getLanguageType() + "\n\n");
        getUser().printUserInfo();
        System.out.println("Words:\n");
        for (int i = 0; i < words.size(); i++)
        {
            words.get(i).printWordInfo();
        }
    }
}
