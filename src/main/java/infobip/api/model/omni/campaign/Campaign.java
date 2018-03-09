package infobip.api.model.omni.campaign;

/**
 * This is a generated class and is not intended for modification!
 */
public class Campaign {
    private String key;
    private String name;

    public Campaign() {
    }

    public String getKey() {
        return this.key;
    }

    public Campaign setKey(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Campaign setName(String name) {
        this.name = name;
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

        Campaign o = (Campaign)obj;
        if (this.key == null) {
            if (o.key != null){
                return false;
            }
        } else if (!this.key.equals(o.key)) {
            return false;
        }
        if (this.name == null) {
            if (o.name != null){
                return false;
            }
        } else if (!this.name.equals(o.name)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Campaign{" +
            "key='" + key + "'" +
            ", name='" + name + "'" +
            '}';
    }
}