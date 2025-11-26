package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandVetRequest {
    private String status;
    private String type;
    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     * @return This {@link BrandVetRequest} instance.
     */
    public BrandVetRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return This {@link BrandVetRequest} instance.
     */
    public BrandVetRequest type(String type) {
        this.type = type;
        return this;
    }
}
