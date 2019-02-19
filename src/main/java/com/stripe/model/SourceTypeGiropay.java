// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeGiropay extends StripeObject {
  @SerializedName("bank_code")
  String bankCode;

  @SerializedName("bank_name")
  String bankName;

  @SerializedName("bic")
  String bic;

  @SerializedName("statement_descriptor")
  String statementDescriptor;
}