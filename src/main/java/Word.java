public class Word {
    private Long id;
    private String natives;
    private String translation;
    private String transcription;

    public Word(Long id, String natives, String translation, String transcription) {
        this.id = id;
        this.natives = natives;
        this.translation = translation;
        this.transcription = transcription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }
}
