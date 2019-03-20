// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PaymentSourceCollectionCreateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A set of key-value pairs that you can attach to a card object. It can be useful for storing
   * additional information about the card in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Please refer to full [documentation](https://stripe.com/docs/api) instead. */
  @SerializedName("source")
  String source;

  private PaymentSourceCollectionCreateParams(
      List<String> expand, Map<String, String> metadata, String source) {
    this.expand = expand;
    this.metadata = metadata;
    this.source = source;
  }

  public static Builder builder() {
    return new com.stripe.param.PaymentSourceCollectionCreateParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, String> metadata;

    private String source;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentSourceCollectionCreateParams build() {
      return new PaymentSourceCollectionCreateParams(this.expand, this.metadata, this.source);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentSourceCollectionCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentSourceCollectionCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentSourceCollectionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentSourceCollectionCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /** Please refer to full [documentation](https://stripe.com/docs/api) instead. */
    public Builder setSource(String source) {
      this.source = source;
      return this;
    }
  }
}
