package infobip.api.model.sms.mt.send.preview;

/**
 * This is a generated class and is not intended for modification!
 */
public class PreviewRequest {
    private String text;
    private String languageCode;
    private String transliteration;

    public PreviewRequest() {
    }

    public String getText() {
        return this.text;
    }

    public PreviewRequest setText(String text) {
        this.text = text;
        return this;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public PreviewRequest setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public String getTransliteration() {
        return this.transliteration;
    }

    public PreviewRequest setTransliteration(String transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        PreviewRequest o = (PreviewRequest)obj;
        if (this.text == null) {
            if (o.text != null){
                return false;
            }
        } else if (!this.text.equals(o.text)) {
            return false;
        }
        if (this.languageCode == null) {
            if (o.languageCode != null){
                return false;
            }
        } else if (!this.languageCode.equals(o.languageCode)) {
            return false;
        }
        if (this.transliteration == null) {
            if (o.transliteration != null){
                return false;
            }
        } else if (!this.transliteration.equals(o.transliteration)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "PreviewRequest{" +
            "text='" + text + "'" +
            ", languageCode='" + languageCode + "'" +
            ", transliteration='" + transliteration + "'" +
            '}';
    }
}