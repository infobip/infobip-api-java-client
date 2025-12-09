package com.infobip.model;

public class GetBrandRegistrarStatusesResponse {
    private String registrar;
    private String state;
    private String brandIdentityStatus;
    private String rejectionReason;

    /**
     * Gets the registrar.
     */
    public String getRegistrar() {
        return registrar;
    }

    /**
     * Sets the registrar.
     */
    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    /**
     * Sets the registrar and returns this.
     */
    public GetBrandRegistrarStatusesResponse registrar(String registrar) {
        this.registrar = registrar;
        return this;
    }

    /**
     * Gets the state.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Sets the state and returns this.
     */
    public GetBrandRegistrarStatusesResponse state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Gets the brand identity status.
     */
    public String getBrandIdentityStatus() {
        return brandIdentityStatus;
    }

    /**
     * Sets the brand identity status.
     */
    public void setBrandIdentityStatus(String brandIdentityStatus) {
        this.brandIdentityStatus = brandIdentityStatus;
    }

    /**
     * Sets the brand identity status and returns this.
     */
    public GetBrandRegistrarStatusesResponse brandIdentityStatus(String brandIdentityStatus) {
        this.brandIdentityStatus = brandIdentityStatus;
        return this;
    }

    /**
     * Gets the rejection reason.
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the rejection reason.
     */
    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    /**
     * Sets the rejection reason and returns this.
     */
    public GetBrandRegistrarStatusesResponse rejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
        return this;
    }
}
