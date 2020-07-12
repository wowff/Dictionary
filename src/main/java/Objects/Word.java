package Objects;

public class Word {
    private Long id;
    private String natives;
    private String translation;
    private String transcription;
    static private Long wordCount = (long)0;//счетчик слов

    public Word(String natives, String translation, String transcription) {
        this.id = ++wordCount;
        this.natives = natives;
        this.translation = translation;
        this.transcription = transcription;
    }

    public Word(){}

    //геттеры
    public Long getId() {
        return id;
    }
    public String getNatives() {
        return natives;
    }
    public String getTranslation() {
        return translation;
    }
    public String getTranscription() {
        return transcription;
    }

    //сеттеры
    public void setId(Long id) {
        this.id = id;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    //вывод информации по слову в консоль
    public void printWordInfo()
    {
        System.out.println(getId() + "\t" + getNatives() + "\t" + getTranscription() + "\t"
        + getTranslation() + "\n");
    }

}
