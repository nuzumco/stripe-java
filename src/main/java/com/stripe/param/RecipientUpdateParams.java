// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipientUpdateParams extends ApiRequestParams {
  /**
   * A bank account to attach to the recipient. You can provide either a token, like the ones
   * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a user's
   * bank account details, with the options described below.
   */
  @SerializedName("bank_account")
  String bankAccount;

  /**
   * A U.S. Visa or MasterCard debit card (not prepaid) to attach to the recipient. You can provide
   * either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a
   * dictionary containing a user's debit card details, with the options described below. Passing
   * `card` will create a new card, make it the new recipient default card, and delete the old
   * recipient default (if one exists). If you want to add additional debit cards instead of
   * replacing the existing default, use the [card creation API](#create_card). Whenever you attach
   * a card to a recipient, Stripe will automatically validate the debit card.
   */
  @SerializedName("card")
  String card;

  /** ID of the card to set as the recipient's new default for payouts. */
  @SerializedName("default_card")
  String defaultCard;

  /**
   * An arbitrary string which you can attach to a `Recipient` object. It is displayed alongside the
   * recipient in the web interface.
   */
  @SerializedName("description")
  String description;

  /**
   * The recipient's email address. It is displayed alongside the recipient in the web interface,
   * and can be useful for searching and tracking.
   */
  @SerializedName("email")
  String email;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The recipient's full, legal name. For type `individual`, should be in the format `First Last`,
   * `First Middle Last`, or `First M Last` (no prefixes or suffixes). For `corporation`, the full,
   * incorporated name.
   */
  @SerializedName("name")
  String name;

  /**
   * The recipient's tax ID, as a string. For type `individual`, the full SSN; for type
   * `corporation`, the full EIN.
   */
  @SerializedName("tax_id")
  String taxId;

  private RecipientUpdateParams(
      String bankAccount,
      String card,
      String defaultCard,
      String description,
      String email,
      List<String> expand,
      Map<String, String> metadata,
      String name,
      String taxId) {
    this.bankAccount = bankAccount;
    this.card = card;
    this.defaultCard = defaultCard;
    this.description = description;
    this.email = email;
    this.expand = expand;
    this.metadata = metadata;
    this.name = name;
    this.taxId = taxId;
  }

  public static Builder builder() {
    return new com.stripe.param.RecipientUpdateParams.Builder();
  }

  public static class Builder {
    private String bankAccount;

    private String card;

    private String defaultCard;

    private String description;

    private String email;

    private List<String> expand;

    private Map<String, String> metadata;

    private String name;

    private String taxId;

    /** Finalize and obtain parameter instance from this builder. */
    public RecipientUpdateParams build() {
      return new RecipientUpdateParams(
          this.bankAccount,
          this.card,
          this.defaultCard,
          this.description,
          this.email,
          this.expand,
          this.metadata,
          this.name,
          this.taxId);
    }

    /**
     * A bank account to attach to the recipient. You can provide either a token, like the ones
     * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a
     * user's bank account details, with the options described below.
     */
    public Builder setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * A U.S. Visa or MasterCard debit card (not prepaid) to attach to the recipient. You can
     * provide either a token, like the ones returned by
     * [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a user's debit
     * card details, with the options described below. Passing `card` will create a new card, make
     * it the new recipient default card, and delete the old recipient default (if one exists). If
     * you want to add additional debit cards instead of replacing the existing default, use the
     * [card creation API](#create_card). Whenever you attach a card to a recipient, Stripe will
     * automatically validate the debit card.
     */
    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /** ID of the card to set as the recipient's new default for payouts. */
    public Builder setDefaultCard(String defaultCard) {
      this.defaultCard = defaultCard;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a `Recipient` object. It is displayed alongside
     * the recipient in the web interface.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The recipient's email address. It is displayed alongside the recipient in the web interface,
     * and can be useful for searching and tracking.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RecipientUpdateParams#expand} for the field documentation.
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
     * RecipientUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * RecipientUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link RecipientUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The recipient's full, legal name. For type `individual`, should be in the format `First
     * Last`, `First Middle Last`, or `First M Last` (no prefixes or suffixes). For `corporation`,
     * the full, incorporated name.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * The recipient's tax ID, as a string. For type `individual`, the full SSN; for type
     * `corporation`, the full EIN.
     */
    public Builder setTaxId(String taxId) {
      this.taxId = taxId;
      return this;
    }
  }
}
