package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    private String city;
    private String state;
    private String street;
    private String zipCode;
    /**
     * Sets city.
     *
     * @param city the city
     * @return This {@link Address} instance.
     */
    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     *
     * @return city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the state.
     *
     * @param state
     * @return This {@link Address} instance.
     */
    public Address state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Sets street.
     *
     * @param street the street
     * @return This {@link Address} instance.
     */
    public Address street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Returns street.
     *
     * @return street
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * Sets street.
     *
     * @param street the street
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Sets zipCode.
     *
     * @param zipCode the zip code
     * @return This {@link Address} instance.
     */
    public Address zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * Returns zipCode.
     *
     * @return zipCode
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets zipCode.
     *
     * @param zipCode the zip code
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
