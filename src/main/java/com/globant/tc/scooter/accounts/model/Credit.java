package com.globant.tc.scooter.accounts.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T19:29:52.717+05:00[Asia/Karachi]")
public class Credit {
  @JsonProperty("mercadoPagoAccountId")
  private Integer mercadoPagoAccountId;

  @JsonProperty("credits")
  private Double credits;

  public Credit mercadoPagoAccountId(Integer mercadoPagoAccountId) {
    this.mercadoPagoAccountId = mercadoPagoAccountId;
    return this;
  }

  /**
   * Get mercadoPagoAccountId
   * @return mercadoPagoAccountId
  */
  @ApiModelProperty(value = "")


  public Integer getMercadoPagoAccountId() {
    return mercadoPagoAccountId;
  }

  public void setMercadoPagoAccountId(Integer mercadoPagoAccountId) {
    this.mercadoPagoAccountId = mercadoPagoAccountId;
  }

  public Credit credits(Double credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
  */
  @ApiModelProperty(value = "")


  public Double getCredits() {
    return credits;
  }

  public void setCredits(Double credits) {
    this.credits = credits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credit credit = (Credit) o;
    return Objects.equals(this.mercadoPagoAccountId, credit.mercadoPagoAccountId) &&
        Objects.equals(this.credits, credit.credits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mercadoPagoAccountId, credits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    mercadoPagoAccountId: ").append(toIndentedString(mercadoPagoAccountId)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
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

