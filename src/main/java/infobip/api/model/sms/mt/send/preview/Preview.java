package infobip.api.model.sms.mt.send.preview;

import infobip.api.model.sms.mt.send.preview.Configuration;

/**
 * This is a generated class and is not intended for modification!
 */
public class Preview {
    private String textPreview;
    private Integer messageCount;
    private Integer charactersRemaining;
    private Configuration configuration;

    public Preview() {
    }

    public String getTextPreview() {
        return this.textPreview;
    }

    public Preview setTextPreview(String textPreview) {
        this.textPreview = textPreview;
        return this;
    }

    public Integer getMessageCount() {
        return this.messageCount;
    }

    public Preview setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    public Integer getCharactersRemaining() {
        return this.charactersRemaining;
    }

    public Preview setCharactersRemaining(Integer charactersRemaining) {
        this.charactersRemaining = charactersRemaining;
        return this;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public Preview setConfiguration(Configuration configuration) {
        this.configuration = configuration;
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

        Preview o = (Preview)obj;
        if (this.textPreview == null) {
            if (o.textPreview != null){
                return false;
            }
        } else if (!this.textPreview.equals(o.textPreview)) {
            return false;
        }
        if (this.messageCount == null) {
            if (o.messageCount != null){
                return false;
            }
        } else if (!this.messageCount.equals(o.messageCount)) {
            return false;
        }
        if (this.charactersRemaining == null) {
            if (o.charactersRemaining != null){
                return false;
            }
        } else if (!this.charactersRemaining.equals(o.charactersRemaining)) {
            return false;
        }
        if (this.configuration == null) {
            if (o.configuration != null){
                return false;
            }
        } else if (!this.configuration.equals(o.configuration)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Preview{" +
            "textPreview='" + textPreview + "'" +
            ", messageCount='" + messageCount + "'" +
            ", charactersRemaining='" + charactersRemaining + "'" +
            ", configuration='" + configuration + "'" +
            '}';
    }
}