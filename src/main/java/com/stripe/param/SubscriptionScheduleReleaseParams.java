// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;

public class SubscriptionScheduleReleaseParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** Keep any cancellation on the subscription that the schedule has set. */
  @SerializedName("preserve_cancel_date")
  Boolean preserveCancelDate;

  private SubscriptionScheduleReleaseParams(List<String> expand, Boolean preserveCancelDate) {
    this.expand = expand;
    this.preserveCancelDate = preserveCancelDate;
  }

  public static Builder builder() {
    return new com.stripe.param.SubscriptionScheduleReleaseParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Boolean preserveCancelDate;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionScheduleReleaseParams build() {
      return new SubscriptionScheduleReleaseParams(this.expand, this.preserveCancelDate);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleReleaseParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleReleaseParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** Keep any cancellation on the subscription that the schedule has set. */
    public Builder setPreserveCancelDate(Boolean preserveCancelDate) {
      this.preserveCancelDate = preserveCancelDate;
      return this;
    }
  }
}
