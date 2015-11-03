package infobip.api.model;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class Status {
    private String groupName;
    private Integer groupId;
    private String name;
    private String description;
    private String action;
    private Integer id;

    public Status() {
    }


    public String getGroupName() {
        return this.groupName;
    }

    public Status setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }


    public Integer getGroupId() {
        return this.groupId;
    }

    public Status setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }


    public String getName() {
        return this.name;
    }

    public Status setName(String name) {
        this.name = name;
        return this;
    }


    public String getDescription() {
        return this.description;
    }

    public Status setDescription(String description) {
        this.description = description;
        return this;
    }


    public String getAction() {
        return this.action;
    }

    public Status setAction(String action) {
        this.action = action;
        return this;
    }


    public Integer getId() {
        return this.id;
    }

    public Status setId(Integer id) {
        this.id = id;
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

        Status o = (Status)obj;
        if (this.groupName == null) {
            if (o.groupName != null){
                return false;
            }
        } else if (!this.groupName.equals(o.groupName)) {
            return false;
        }
        if (this.groupId == null) {
            if (o.groupId != null){
                return false;
            }
        } else if (!this.groupId.equals(o.groupId)) {
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
        if (this.action == null) {
            if (o.action != null){
                return false;
            }
        } else if (!this.action.equals(o.action)) {
            return false;
        }
        if (this.id == null) {
            if (o.id != null){
                return false;
            }
        } else if (!this.id.equals(o.id)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Status{" +
            "groupName='" + groupName + "'" +

            ", groupId='" + groupId + "'" +

            ", name='" + name + "'" +

            ", description='" + description + "'" +

            ", action='" + action + "'" +

            ", id='" + id + "'" +
            '}';
    }
}