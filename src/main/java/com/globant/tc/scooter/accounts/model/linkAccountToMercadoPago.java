package com.globant.tc.scooter.accounts.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineObject3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-11T21:44:36.143+05:00[Asia/Karachi]")
public class linkAccountToMercadoPago {
  @JsonProperty("accountId")
  private Integer accountId;

  @JsonProperty("mercadoPagoId")
  private Integer mercadoPagoId;

  public linkAccountToMercadoPago accountId(Integer accountId) {
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

  public linkAccountToMercadoPago mercadoPagoId(Integer mercadoPagoId) {
    this.mercadoPagoId = mercadoPagoId;
    return this;
  }

  /**
   * Get mercadoPagoId
   * @return mercadoPagoId
  */
  @ApiModelProperty(value = "")


  public Integer getMercadoPagoId() {
    return mercadoPagoId;
  }

  public void setMercadoPagoId(Integer mercadoPagoId) {
    this.mercadoPagoId = mercadoPagoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    linkAccountToMercadoPago linkAccountToMercadoPago = (linkAccountToMercadoPago) o;
    return Objects.equals(this.accountId, linkAccountToMercadoPago.accountId) &&
        Objects.equals(this.mercadoPagoId, linkAccountToMercadoPago.mercadoPagoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, mercadoPagoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject3 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    mercadoPagoId: ").append(toIndentedString(mercadoPagoId)).append("\n");
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

