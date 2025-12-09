package com.infobip.model;

public class AlternateBusinessId {
    private String id;
    private String type;
    /**
     * Gets the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the id and returns this.
     */
    public AlternateBusinessId id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Gets the type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets the type and returns this.
     */
    public AlternateBusinessId type(String type) {
        this.type = type;
        return this;
    }
}
