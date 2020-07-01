package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Asset;
import io.swagger.model.AssetType;
import io.swagger.model.Condition;
import io.swagger.model.Fare;
import io.swagger.model.GeojsonLine;
import io.swagger.model.LegState;
import io.swagger.model.Place;
import io.swagger.model.Suboperator;
import io.swagger.model.Token;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A planned (segment of) a booked trip using one asset type
 */
@ApiModel(description = "A planned (segment of) a booked trip using one asset type")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-10T13:55:00.069Z[GMT]")
public class Leg {
  @JsonProperty("id")
  private String id = null;

	@JsonProperty("from")
	private Place from = null;

	@JsonProperty("to")
	private Place to = null;

	@JsonProperty("departureTime")
	private OffsetDateTime departureTime = null;

	@JsonProperty("arrivalTime")
	private OffsetDateTime arrivalTime = null;

	@JsonProperty("assetType")
	private AssetType assetType = null;

	@JsonProperty("asset")
	private Asset asset = null;

	@JsonProperty("pricing")
	private Fare pricing = null;

	@JsonProperty("suboperator")
	private Suboperator suboperator = null;

	@JsonProperty("conditions")
	@Valid
	private List<Condition> conditions = null;

	@JsonProperty("state")
	private LegState state = null;

	@JsonProperty("departureDelay")
	private Integer departureDelay = null;

	@JsonProperty("arrivalDelay")
	private Integer arrivalDelay = null;

	@JsonProperty("distance")
	private Integer distance = null;

	@JsonProperty("progressGeometry")
	private GeojsonLine progressGeometry = null;

	@JsonProperty("ticket")
	private Token ticket = null;

	@JsonProperty("assetAccessData")
	private Token assetAccessData = null;

  public Leg id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier (TO) of this leg
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier (TO) of this leg")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

	public Leg from(Place from) {
		this.from = from;
		return this;
	}

	/**
	 * Get from
	 * @return from
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public Place getFrom() {
		return from;
	}

	public void setFrom(Place from) {
		this.from = from;
	}

	public Leg to(Place to) {
		this.to = to;
		return this;
	}

	/**
	 * Get to
	 * @return to
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public Place getTo() {
		return to;
	}

	public void setTo(Place to) {
		this.to = to;
	}

	public Leg departureTime(OffsetDateTime departureTime) {
		this.departureTime = departureTime;
		return this;
	}

	/**
	 * The departure time of this leg
	 * @return departureTime
	 **/
	@ApiModelProperty(value = "The departure time of this leg")

	@Valid
	public OffsetDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(OffsetDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public Leg arrivalTime(OffsetDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
		return this;
	}

	/**
	 * The intended arrival time at the to place
	 * @return arrivalTime
	 **/
	@ApiModelProperty(value = "The intended arrival time at the to place")

	@Valid
	public OffsetDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(OffsetDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Leg assetType(AssetType assetType) {
		this.assetType = assetType;
		return this;
	}

	/**
	 * Get assetType
	 * @return assetType
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public Leg asset(Asset asset) {
		this.asset = asset;
		return this;
	}

	/**
	 * Get asset
	 * @return asset
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Leg pricing(Fare pricing) {
		this.pricing = pricing;
		return this;
	}

	/**
	 * Get pricing
	 * @return pricing
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public Fare getPricing() {
		return pricing;
	}

	public void setPricing(Fare pricing) {
		this.pricing = pricing;
	}

	public Leg suboperator(Suboperator suboperator) {
		this.suboperator = suboperator;
		return this;
	}

	/**
	 * Get suboperator
	 * @return suboperator
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public Suboperator getSuboperator() {
		return suboperator;
	}

	public void setSuboperator(Suboperator suboperator) {
		this.suboperator = suboperator;
	}

	public Leg conditions(List<Condition> conditions) {
		this.conditions = conditions;
		return this;
	}

	public Leg addConditionsItem(Condition conditionsItem) {
		if (this.conditions == null) {
			this.conditions = new ArrayList<Condition>();
		}
		this.conditions.add(conditionsItem);
		return this;
	}

	/**
   * The conditions that apply to this leg, there may be more conditions in a parent booking and planning object (if this is returned as part of those)
	 * @return conditions
	 **/
	@ApiModelProperty(value = "The conditions that apply to this leg, there may be more conditions in a parent booking and planning object (if this is returned as part of those)")
	@Valid
	public List<Condition> getConditions() {
		return conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	public Leg state(LegState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * @return state
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public LegState getState() {
		return state;
	}

	public void setState(LegState state) {
		this.state = state;
	}

	public Leg departureDelay(Integer departureDelay) {
		this.departureDelay = departureDelay;
		return this;
	}

	/**
	 * Get departureDelay
	 * @return departureDelay
	 **/
	@ApiModelProperty(value = "")

	public Integer getDepartureDelay() {
		return departureDelay;
	}

	public void setDepartureDelay(Integer departureDelay) {
		this.departureDelay = departureDelay;
	}

	public Leg arrivalDelay(Integer arrivalDelay) {
		this.arrivalDelay = arrivalDelay;
		return this;
	}

	/**
	 * Get arrivalDelay
	 * @return arrivalDelay
	 **/
	@ApiModelProperty(value = "")

	public Integer getArrivalDelay() {
		return arrivalDelay;
	}

	public void setArrivalDelay(Integer arrivalDelay) {
		this.arrivalDelay = arrivalDelay;
	}

	public Leg distance(Integer distance) {
		this.distance = distance;
		return this;
	}

	/**
	 * Get distance
	 * @return distance
	 **/
	@ApiModelProperty(value = "")

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Leg progressGeometry(GeojsonLine progressGeometry) {
		this.progressGeometry = progressGeometry;
		return this;
	}

	/**
	 * Get progressGeometry
	 * @return progressGeometry
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public GeojsonLine getProgressGeometry() {
		return progressGeometry;
	}

	public void setProgressGeometry(GeojsonLine progressGeometry) {
		this.progressGeometry = progressGeometry;
	}

	public Leg ticket(Token ticket) {
		this.ticket = ticket;
		return this;
	}

	/**
	 * Get ticket
	 * @return ticket
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public Token getTicket() {
		return ticket;
	}

	public void setTicket(Token ticket) {
		this.ticket = ticket;
	}

	public Leg assetAccessData(Token assetAccessData) {
		this.assetAccessData = assetAccessData;
		return this;
	}

	/**
	 * Get assetAccessData
	 * @return assetAccessData
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public Token getAssetAccessData() {
		return assetAccessData;
	}

	public void setAssetAccessData(Token assetAccessData) {
		this.assetAccessData = assetAccessData;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Leg leg = (Leg) o;
    return Objects.equals(this.id, leg.id) &&
        Objects.equals(this.from, leg.from) &&
        Objects.equals(this.to, leg.to) &&
        Objects.equals(this.departureTime, leg.departureTime) &&
        Objects.equals(this.arrivalTime, leg.arrivalTime) &&
        Objects.equals(this.assetType, leg.assetType) &&
        Objects.equals(this.asset, leg.asset) &&
        Objects.equals(this.pricing, leg.pricing) &&
        Objects.equals(this.suboperator, leg.suboperator) &&
        Objects.equals(this.conditions, leg.conditions) &&
        Objects.equals(this.state, leg.state) &&
        Objects.equals(this.departureDelay, leg.departureDelay) &&
        Objects.equals(this.arrivalDelay, leg.arrivalDelay) &&
        Objects.equals(this.distance, leg.distance) &&
        Objects.equals(this.progressGeometry, leg.progressGeometry) &&
        Objects.equals(this.ticket, leg.ticket) &&
        Objects.equals(this.assetAccessData, leg.assetAccessData);
	}

	@Override
	public int hashCode() {
    return Objects.hash(id, from, to, departureTime, arrivalTime, assetType, asset, pricing, suboperator, conditions, state, departureDelay, arrivalDelay, distance, progressGeometry, ticket, assetAccessData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Leg {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    from: ").append(toIndentedString(from)).append("\n");
		sb.append("    to: ").append(toIndentedString(to)).append("\n");
		sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
		sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
		sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
		sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
		sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
		sb.append("    suboperator: ").append(toIndentedString(suboperator)).append("\n");
		sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    departureDelay: ").append(toIndentedString(departureDelay)).append("\n");
		sb.append("    arrivalDelay: ").append(toIndentedString(arrivalDelay)).append("\n");
		sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
		sb.append("    progressGeometry: ").append(toIndentedString(progressGeometry)).append("\n");
		sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
		sb.append("    assetAccessData: ").append(toIndentedString(assetAccessData)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
