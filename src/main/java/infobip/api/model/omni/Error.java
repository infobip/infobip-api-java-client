package infobip.api.model.omni;

/**
 * This is a generated class and is not intended for modification!
 */
public class Error {
    private Integer groupId;
    private String groupName;
    private Integer id;
    private String name;
    private String description;
    private Boolean permanent;

    public Error() {
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Error setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Error setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public Error setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Error setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Error setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getPermanent() {
        return this.permanent;
    }

    public Error setPermanent(Boolean permanent) {
        this.permanent = permanent;
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

        Error o = (Error)obj;
        if (this.groupId == null) {
            if (o.groupId != null){
                return false;
            }
        } else if (!this.groupId.equals(o.groupId)) {
            return false;
        }
        if (this.groupName == null) {
            if (o.groupName != null){
                return false;
            }
        } else if (!this.groupName.equals(o.groupName)) {
            return false;
        }
        if (this.id == null) {
            if (o.id != null){
                return false;
            }
        } else if (!this.id.equals(o.id)) {
            return false;
        }
        if (this.name == null) {
            if (o.name != null){
                return false;
            }
        } else if (!this.name.equals(o.name)) {
            return false;
        }
        if (this.description == null) {
            if (o.description != null){
                return false;
            }
        } else if (!this.description.equals(o.description)) {
            return false;
        }
        if (this.permanent == null) {
            if (o.permanent != null){
                return false;
            }
        } else if (!this.permanent.equals(o.permanent)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Error{" +
            "groupId='" + groupId + "'" +
            ", groupName='" + groupName + "'" +
            ", id='" + id + "'" +
            ", name='" + name + "'" +
            ", description='" + description + "'" +
            ", permanent='" + permanent + "'" +
            '}';
    }
}