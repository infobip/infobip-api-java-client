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
 * Route response object.
 */
public class CallRoutingRouteResponse {

    private String id;

    private String name;

    private List<CallRoutingSearchCriteria> criteria = null;

    private List<CallRoutingDestination> destinations = new ArrayList<>();

    private CallRoutingRouteStatus status;

    private Integer order;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of a route.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link CallRoutingRouteResponse instance}.
     */
    public CallRoutingRouteResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of a route.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of a route.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
     * @return This {@link CallRoutingRouteResponse instance}.
     */
    public CallRoutingRouteResponse name(String name) {
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
     * List of criteria that should match route. For a route to match, any criterion should be met.
     *
     * @param criteria
     * @return This {@link CallRoutingRouteResponse instance}.
     */
    public CallRoutingRouteResponse criteria(List<CallRoutingSearchCriteria> criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * Adds and item into criteria.
     * <p>
     * Field description:
     * List of criteria that should match route. For a route to match, any criterion should be met.
     *
     * @param criteriaItem The item to be added to the list.
     * @return This {@link CallRoutingRouteResponse instance}.
     */
    public CallRoutingRouteResponse addCriteriaItem(CallRoutingSearchCriteria criteriaItem) {
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
     * List of criteria that should match route. For a route to match, any criterion should be met.
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
     * List of criteria that should match route. For a route to match, any criterion should be met.
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
     * @return This {@link CallRoutingRouteResponse instance}.
     */
    public CallRoutingRouteResponse destinations(List<CallRoutingDestination> destinations) {
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
     * @return This {@link CallRoutingRouteResponse instance}.
     */
    public CallRoutingRouteResponse addDestinationsItem(CallRoutingDestination destinationsItem) {
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

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link CallRoutingRouteResponse instance}.
     */
    public CallRoutingRouteResponse status(CallRoutingRouteStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public CallRoutingRouteStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(CallRoutingRouteStatus status) {
        this.status = status;
    }

    /**
     * Sets order.
     * <p>
     * Field description:
     * Indicates priority index of the route. Routes with lower priority index are executed first.
     *
     * @param order
     * @return This {@link CallRoutingRouteResponse instance}.
     */
    public CallRoutingRouteResponse order(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Returns order.
     * <p>
     * Field description:
     * Indicates priority index of the route. Routes with lower priority index are executed first.
     *
     * @return order
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets order.
     * <p>
     * Field description:
     * Indicates priority index of the route. Routes with lower priority index are executed first.
     *
     * @param order
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingRouteResponse callRoutingRouteResponse = (CallRoutingRouteResponse) o;
        return Objects.equals(this.id, callRoutingRouteResponse.id)
                && Objects.equals(this.name, callRoutingRouteResponse.name)
                && Objects.equals(this.criteria, callRoutingRouteResponse.criteria)
                && Objects.equals(this.destinations, callRoutingRouteResponse.destinations)
                && Objects.equals(this.status, callRoutingRouteResponse.status)
                && Objects.equals(this.order, callRoutingRouteResponse.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, criteria, destinations, status, order);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRouteResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    order: ")
                .append(toIndentedString(order))
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
