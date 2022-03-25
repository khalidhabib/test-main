package com.globant.tc.scooter.accounts.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:26:49.191+05:00[Asia/Karachi]")
public class User   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("preferredPayment")
  private String preferredPayment;

  public User(String name, String preferredPayment) {
    this.name = name;
    this.preferredPayment = preferredPayment;
  }

  public User() {
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User preferredPayment(String preferredPayment) {
    this.preferredPayment = preferredPayment;
    return this;
  }

  /**
   * Get preferredPayment
   * @return preferredPayment
  */
  @ApiModelProperty(value = "")


  public String getPreferredPayment() {
    return preferredPayment;
  }

  public void setPreferredPayment(String preferredPayment) {
    this.preferredPayment = preferredPayment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.name, user.name) &&
        Objects.equals(this.preferredPayment, user.preferredPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, preferredPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferredPayment: ").append(toIndentedString(preferredPayment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

