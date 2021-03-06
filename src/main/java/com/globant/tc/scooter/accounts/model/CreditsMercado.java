package com.globant.tc.scooter.accounts.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineObject4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-11T21:44:36.143+05:00[Asia/Karachi]")
public class CreditsMercado {
  @JsonProperty("accountId")
  private Integer accountId;

  @JsonProperty("credits")
  private Double credits;

  public CreditsMercado accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  @ApiModelProperty(value = "")


  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public CreditsMercado credits(Double credits) {
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
    CreditsMercado creditsMercado = (CreditsMercado) o;
    return Objects.equals(this.accountId, creditsMercado.accountId) &&
        Objects.equals(this.credits, creditsMercado.credits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, credits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject4 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

