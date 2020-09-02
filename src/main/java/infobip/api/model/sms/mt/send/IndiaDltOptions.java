package infobip.api.model.sms.mt.send;

/**
 * This is a generated class and is not intended for modification!
 */
public class IndiaDltOptions {
    private String contentTemplateId;
    private String principalEntityId;

    public IndiaDltOptions() {
    }

    public String getContentTemplateId() {
        return this.contentTemplateId;
    }

    public IndiaDltOptions setContentTemplateId(String contentTemplateId) {
        this.contentTemplateId = contentTemplateId;
        return this;
    }

    public String getPrincipalEntityId() {
        return this.principalEntityId;
    }

    public IndiaDltOptions setPrincipalEntityId(String principalEntityId) {
        this.principalEntityId = principalEntityId;
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

        IndiaDltOptions o = (IndiaDltOptions)obj;
        if (this.contentTemplateId == null) {
            if (o.contentTemplateId != null){
                return false;
            }
        } else if (!this.contentTemplateId.equals(o.contentTemplateId)) {
            return false;
        }
        if (this.principalEntityId == null) {
            if (o.principalEntityId != null){
                return false;
            }
        } else if (!this.principalEntityId.equals(o.principalEntityId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "IndiaDltOptions{" +
                "contentTemplateId='" + contentTemplateId + "'" +
                ", principalEntityId='" + principalEntityId + "'" +
                '}';
    }
}