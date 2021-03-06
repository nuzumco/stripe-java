// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionScheduleRevision extends StripeObject implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  @SerializedName("id")
  String id;

  @SerializedName("invoice_settings")
  SubscriptionSchedule.InvoiceSettings invoiceSettings;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /** Configuration for the subscription schedule's phases. */
  @SerializedName("phases")
  List<SubscriptionSchedule.Phase> phases;

  @SerializedName("previous_revision")
  String previousRevision;

  /** Behavior of the subscription schedule and underlying subscription when it ends. */
  @SerializedName("renewal_behavior")
  String renewalBehavior;

  /**
   * Interval and duration at which the subscription schedule renews for when it ends if
   * `renewal_behavior` is `renew`.
   */
  @SerializedName("renewal_interval")
  SubscriptionSchedule.RenewalInterval renewalInterval;

  /** ID of the subscription schedule the revision points to. */
  @SerializedName("schedule")
  String schedule;
}
