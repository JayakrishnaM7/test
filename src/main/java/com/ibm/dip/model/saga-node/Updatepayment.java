package com.ibm.dip.model.saga-node;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.saga-node.UpdatepaymentPaymentOrderProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * updatepayment payment
 */
@ApiModel(description = "updatepayment payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T05:16:38.494Z[GMT]")

public class Updatepayment   {
  @JsonProperty("PaymentOrderProcedure")
  private UpdatepaymentPaymentOrderProcedure paymentOrderProcedure;

  public Updatepayment paymentOrderProcedure(UpdatepaymentPaymentOrderProcedure paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
    return this;
  }

  /**
   * Get paymentOrderProcedure
   * @return paymentOrderProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdatepaymentPaymentOrderProcedure getPaymentOrderProcedure() {
    return paymentOrderProcedure;
  }

  public void setPaymentOrderProcedure(UpdatepaymentPaymentOrderProcedure paymentOrderProcedure) {
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
    Updatepayment updatepayment = (Updatepayment) o;
    return Objects.equals(this.paymentOrderProcedure, updatepayment.paymentOrderProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Updatepayment {\n");
    
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

