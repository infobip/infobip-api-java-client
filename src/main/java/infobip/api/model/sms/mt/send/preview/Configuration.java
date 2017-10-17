package infobip.api.model.sms.mt.send.preview;

import infobip.api.model.sms.mt.send.Language;

/**
 * This is a generated class and is not intended for modification!
 */
public class Configuration {
    private Language language;
    private String transliteration;

    public Configuration() {
    }

    public Language getLanguage() {
        return this.language;
    }

    public Configuration setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public String getTransliteration() {
        return this.transliteration;
    }

    public Configuration setTransliteration(String transliteration) {
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

        Configuration o = (Configuration)obj;
        if (this.language == null) {
            if (o.language != null){
                return false;
            }
        } else if (!this.language.equals(o.language)) {
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
        return "Configuration{" +
            "language='" + language + "'" +
            ", transliteration='" + transliteration + "'" +
            '}';
    }
}