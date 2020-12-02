package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Day;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemHours
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-31T14:20:13.675Z[GMT]")


public class SystemHours   {
  /**
   * This indicates that this set of rental hours applies to either members or non-members only.
   */
  public enum UserTypeEnum {
    MEMBER("MEMBER"),
    
    NON_MEMBERS("NON_MEMBERS");

    private String value;

    UserTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UserTypeEnum fromValue(String text) {
      for (UserTypeEnum b : UserTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("userType")
  private UserTypeEnum userType = null;

  @JsonProperty("stationId")
  private String stationId = null;

  @JsonProperty("startTime")
  private String startTime = null;

  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("days")
  @Valid
  private List<Day> days = new ArrayList<Day>();

  public SystemHours userType(UserTypeEnum userType) {
    this.userType = userType;
    return this;
  }

  /**
   * This indicates that this set of rental hours applies to either members or non-members only.
   * @return userType
  **/
  @ApiModelProperty(example = "MEMBER", value = "This indicates that this set of rental hours applies to either members or non-members only.")
  
    public UserTypeEnum getUserType() {
    return userType;
  }

  public void setUserType(UserTypeEnum userType) {
    this.userType = userType;
  }

  public SystemHours stationId(String stationId) {
    this.stationId = stationId;
    return this;
  }

  /**
   * If this parameter is present, it means that starTime and endTime correspond to the opening and closing hour of the station.
   * @return stationId
  **/
  @ApiModelProperty(value = "If this parameter is present, it means that starTime and endTime correspond to the opening and closing hour of the station.")
  
    public String getStationId() {
    return stationId;
  }

  public void setStationId(String stationId) {
    this.stationId = stationId;
  }

  public SystemHours startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public SystemHours endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public SystemHours days(List<Day> days) {
    this.days = days;
    return this;
  }

  public SystemHours addDaysItem(Day daysItem) {
    this.days.add(daysItem);
    return this;
  }

  /**
   * An array of abbreviations (first 3 letters) of English names of the days of the week that this hour object applies to (i.e. [\"mon\", \"tue\"]). Each day can only appear once within all of the hours objects in this feed.
   * @return days
  **/
  @ApiModelProperty(required = true, value = "An array of abbreviations (first 3 letters) of English names of the days of the week that this hour object applies to (i.e. [\"mon\", \"tue\"]). Each day can only appear once within all of the hours objects in this feed.")
      @NotNull
    @Valid
    public List<Day> getDays() {
    return days;
  }

  public void setDays(List<Day> days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemHours systemHours = (SystemHours) o;
    return Objects.equals(this.userType, systemHours.userType) &&
        Objects.equals(this.stationId, systemHours.stationId) &&
        Objects.equals(this.startTime, systemHours.startTime) &&
        Objects.equals(this.endTime, systemHours.endTime) &&
        Objects.equals(this.days, systemHours.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userType, stationId, startTime, endTime, days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemHours {\n");
    
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
