package com.ibm.dip.model.saga-node;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.saga-node.InitPaymentRequestPaymentOrderProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * External Fund Transfer
 */
@ApiModel(description = "External Fund Transfer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T05:16:38.494Z[GMT]")

public class InitPaymentRequest   {
  @JsonProperty("PaymentOrderProcedure")
  private InitPaymentRequestPaymentOrderProcedure paymentOrderProcedure;

  public InitPaymentRequest paymentOrderProcedure(InitPaymentRequestPaymentOrderProcedure paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
    return this;
  }

  /**
   * Get paymentOrderProcedure
   * @return paymentOrderProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitPaymentRequestPaymentOrderProcedure getPaymentOrderProcedure() {
    return paymentOrderProcedure;
  }

  public void setPaymentOrderProcedure(InitPaymentRequestPaymentOrderProcedure paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitPaymentRequest initPaymentRequest = (InitPaymentRequest) o;
    return Objects.equals(this.paymentOrderProcedure, initPaymentRequest.paymentOrderProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitPaymentRequest {\n");
    
    sb.append("    paymentOrderProcedure: ").append(toIndentedString(paymentOrderProcedure)).append("\n");
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

