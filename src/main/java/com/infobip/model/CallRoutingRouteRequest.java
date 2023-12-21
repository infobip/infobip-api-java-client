/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Route request object.
 */
public class CallRoutingRouteRequest {

    private String name;

    private List<CallRoutingSearchCriteria> criteria = null;

    private List<CallRoutingDestination> destinations = new ArrayList<>();

    /**
     * Sets name.
     * <p>
     * Field description:
     * Route name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallRoutingRouteRequest instance}.
     */
    public CallRoutingRouteRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Route name.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Route name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets criteria.
     * <p>
     * Field description:
     * List of criteria that should match a route. For a route to match, any criterion should be met.
     *
     * @param criteria
     * @return This {@link CallRoutingRouteRequest instance}.
     */
    public CallRoutingRouteRequest criteria(List<CallRoutingSearchCriteria> criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * Adds and item into criteria.
     * <p>
     * Field description:
     * List of criteria that should match a route. For a route to match, any criterion should be met.
     *
     * @param criteriaItem The item to be added to the list.
     * @return This {@link CallRoutingRouteRequest instance}.
     */
    public CallRoutingRouteRequest addCriteriaItem(CallRoutingSearchCriteria criteriaItem) {
        if (this.criteria == null) {
            this.criteria = new ArrayList<>();
        }
        this.criteria.add(criteriaItem);
        return this;
    }

    /**
     * Returns criteria.
     * <p>
     * Field description:
     * List of criteria that should match a route. For a route to match, any criterion should be met.
     *
     * @return criteria
     */
    @JsonProperty("criteria")
    public List<CallRoutingSearchCriteria> getCriteria() {
        return criteria;
    }

    /**
     * Sets criteria.
     * <p>
     * Field description:
     * List of criteria that should match a route. For a route to match, any criterion should be met.
     *
     * @param criteria
     */
    @JsonProperty("criteria")
    public void setCriteria(List<CallRoutingSearchCriteria> criteria) {
        this.criteria = criteria;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * List of destinations. First destination in the list is the first one to be executed. Subsequent destinations are executed only if the previous one fails.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link CallRoutingRouteRequest instance}.
     */
    public CallRoutingRouteRequest destinations(List<CallRoutingDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * List of destinations. First destination in the list is the first one to be executed. Subsequent destinations are executed only if the previous one fails.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link CallRoutingRouteRequest instance}.
     */
    public CallRoutingRouteRequest addDestinationsItem(CallRoutingDestination destinationsItem) {
        if (this.destinations == null) {
            this.destinations = new ArrayList<>();
        }
        this.destinations.add(destinationsItem);
        return this;
    }

    /**
     * Returns destinations.
     * <p>
     * Field description:
     * List of destinations. First destination in the list is the first one to be executed. Subsequent destinations are executed only if the previous one fails.
     * <p>
     * The field is required.
     *
     * @return destinations
     */
    @JsonProperty("destinations")
    public List<CallRoutingDestination> getDestinations() {
        return destinations;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * List of destinations. First destination in the list is the first one to be executed. Subsequent destinations are executed only if the previous one fails.
     * <p>
     * The field is required.
     *
     * @param destinations
     */
    @JsonProperty("destinations")
    public void setDestinations(List<CallRoutingDestination> destinations) {
        this.destinations = destinations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingRouteRequest callRoutingRouteRequest = (CallRoutingRouteRequest) o;
        return Objects.equals(this.name, callRoutingRouteRequest.name)
                && Objects.equals(this.criteria, callRoutingRouteRequest.criteria)
                && Objects.equals(this.destinations, callRoutingRouteRequest.destinations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, criteria, destinations);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRouteRequest {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    criteria: ")
                .append(toIndentedString(criteria))
                .append(newLine)
                .append("    destinations: ")
                .append(toIndentedString(destinations))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
