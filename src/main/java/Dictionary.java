import java.util.List;

public class Dictionary {
    private Long id;
    private User user;
    private LanguageType languageType;
    private List<Word> words;

    public Dictionary(Long id, User user, LanguageType languageType, List<Word> words) {
        this.id = id;
        this.user = user;
        this.languageType = languageType;
        this.words = words;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
