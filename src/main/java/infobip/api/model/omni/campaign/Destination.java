package infobip.api.model.omni.campaign;

import infobip.api.model.omni.campaign.Gender;

/**
 * This is a generated class and is not intended for modification!
 */
public class Destination {
    private String firstName;
    private String lastName;
    private String middleName;
    private String gsm;
    private String landline;
    private String email;
    private String address;
    private String city;
    private String country;
    private Gender gender;
    private String birthday;

    public Destination() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Destination setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Destination setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public Destination setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getGsm() {
        return this.gsm;
    }

    public Destination setGsm(String gsm) {
        this.gsm = gsm;
        return this;
    }

    public String getLandline() {
        return this.landline;
    }

    public Destination setLandline(String landline) {
        this.landline = landline;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Destination setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public Destination setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public Destination setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return this.country;
    }

    public Destination setCountry(String country) {
        this.country = country;
        return this;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Destination setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public Destination setBirthday(String birthday) {
        this.birthday = birthday;
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

        Destination o = (Destination)obj;
        if (this.firstName == null) {
            if (o.firstName != null){
                return false;
            }
        } else if (!this.firstName.equals(o.firstName)) {
            return false;
        }
        if (this.lastName == null) {
            if (o.lastName != null){
                return false;
            }
        } else if (!this.lastName.equals(o.lastName)) {
            return false;
        }
        if (this.middleName == null) {
            if (o.middleName != null){
                return false;
            }
        } else if (!this.middleName.equals(o.middleName)) {
            return false;
        }
        if (this.gsm == null) {
            if (o.gsm != null){
                return false;
            }
        } else if (!this.gsm.equals(o.gsm)) {
            return false;
        }
        if (this.landline == null) {
            if (o.landline != null){
                return false;
            }
        } else if (!this.landline.equals(o.landline)) {
            return false;
        }
        if (this.email == null) {
            if (o.email != null){
                return false;
            }
        } else if (!this.email.equals(o.email)) {
            return false;
        }
        if (this.address == null) {
            if (o.address != null){
                return false;
            }
        } else if (!this.address.equals(o.address)) {
            return false;
        }
        if (this.city == null) {
            if (o.city != null){
                return false;
            }
        } else if (!this.city.equals(o.city)) {
            return false;
        }
        if (this.country == null) {
            if (o.country != null){
                return false;
            }
        } else if (!this.country.equals(o.country)) {
            return false;
        }
        if (this.gender == null) {
            if (o.gender != null){
                return false;
            }
        } else if (!this.gender.equals(o.gender)) {
            return false;
        }
        if (this.birthday == null) {
            if (o.birthday != null){
                return false;
            }
        } else if (!this.birthday.equals(o.birthday)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Destination{" +
            "firstName='" + firstName + "'" +
            ", lastName='" + lastName + "'" +
            ", middleName='" + middleName + "'" +
            ", gsm='" + gsm + "'" +
            ", landline='" + landline + "'" +
            ", email='" + email + "'" +
            ", address='" + address + "'" +
            ", city='" + city + "'" +
            ", country='" + country + "'" +
            ", gender='" + gender + "'" +
            ", birthday='" + birthday + "'" +
            '}';
    }
}