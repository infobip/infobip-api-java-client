package infobip.api.model.omni;

/**
 * This is a generated class and is not intended for modification!
 */
public class To {
    private String phoneNumber;
    private String emailAddress;
    private String pushRegistrationId;
    private String facebookUserKey;
    private String lineUserKey;

    public To() {
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public To setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public To setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getPushRegistrationId() {
        return this.pushRegistrationId;
    }

    public To setPushRegistrationId(String pushRegistrationId) {
        this.pushRegistrationId = pushRegistrationId;
        return this;
    }

    public String getFacebookUserKey() {
        return this.facebookUserKey;
    }

    public To setFacebookUserKey(String facebookUserKey) {
        this.facebookUserKey = facebookUserKey;
        return this;
    }

    public String getLineUserKey() {
        return this.lineUserKey;
    }

    public To setLineUserKey(String lineUserKey) {
        this.lineUserKey = lineUserKey;
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

        To o = (To)obj;
        if (this.phoneNumber == null) {
            if (o.phoneNumber != null){
                return false;
            }
        } else if (!this.phoneNumber.equals(o.phoneNumber)) {
            return false;
        }
        if (this.emailAddress == null) {
            if (o.emailAddress != null){
                return false;
            }
        } else if (!this.emailAddress.equals(o.emailAddress)) {
            return false;
        }
        if (this.pushRegistrationId == null) {
            if (o.pushRegistrationId != null){
                return false;
            }
        } else if (!this.pushRegistrationId.equals(o.pushRegistrationId)) {
            return false;
        }
        if (this.facebookUserKey == null) {
            if (o.facebookUserKey != null){
                return false;
            }
        } else if (!this.facebookUserKey.equals(o.facebookUserKey)) {
            return false;
        }
        if (this.lineUserKey == null) {
            if (o.lineUserKey != null){
                return false;
            }
        } else if (!this.lineUserKey.equals(o.lineUserKey)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "To{" +
            "phoneNumber='" + phoneNumber + "'" +
            ", emailAddress='" + emailAddress + "'" +
            ", pushRegistrationId='" + pushRegistrationId + "'" +
            ", facebookUserKey='" + facebookUserKey + "'" +
            ", lineUserKey='" + lineUserKey + "'" +
            '}';
    }
}