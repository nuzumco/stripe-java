// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;

public class PersonListParams extends ApiRequestParams {
  /**
   * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with
   * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
   * previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * Filters on the list of people returned based on the person's relationship to the account's
   * company.
   */
  @SerializedName("relationship")
  Relationship relationship;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private PersonListParams(
      String endingBefore,
      List<String> expand,
      Long limit,
      Relationship relationship,
      String startingAfter) {
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.relationship = relationship;
    this.startingAfter = startingAfter;
  }

  public static Builder builder() {
    return new com.stripe.param.PersonListParams.Builder();
  }

  public static class Builder {
    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private Relationship relationship;

    private String startingAfter;

    /** Finalize and obtain parameter instance from this builder. */
    public PersonListParams build() {
      return new PersonListParams(
          this.endingBefore, this.expand, this.limit, this.relationship, this.startingAfter);
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PersonListParams#expand} for the field documentation.
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
     * PersonListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Filters on the list of people returned based on the person's relationship to the account's
     * company.
     */
    public Builder setRelationship(Relationship relationship) {
      this.relationship = relationship;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }
  }

  public static class Relationship {
    /**
     * A filter on the list of people returned based on whether these people are the account opener
     * of the account's company.
     */
    @SerializedName("account_opener")
    Boolean accountOpener;

    /**
     * A filter on the list of people returned based on whether these people are directors of the
     * account's company.
     */
    @SerializedName("director")
    Boolean director;

    /**
     * A filter on the list of people returned based on whether these people are owners of the
     * account's company.
     */
    @SerializedName("owner")
    Boolean owner;

    private Relationship(Boolean accountOpener, Boolean director, Boolean owner) {
      this.accountOpener = accountOpener;
      this.director = director;
      this.owner = owner;
    }

    public static Builder builder() {
      return new com.stripe.param.PersonListParams.Relationship.Builder();
    }

    public static class Builder {
      private Boolean accountOpener;

      private Boolean director;

      private Boolean owner;

      /** Finalize and obtain parameter instance from this builder. */
      public Relationship build() {
        return new Relationship(this.accountOpener, this.director, this.owner);
      }

      /**
       * A filter on the list of people returned based on whether these people are the account
       * opener of the account's company.
       */
      public Builder setAccountOpener(Boolean accountOpener) {
        this.accountOpener = accountOpener;
        return this;
      }

      /**
       * A filter on the list of people returned based on whether these people are directors of the
       * account's company.
       */
      public Builder setDirector(Boolean director) {
        this.director = director;
        return this;
      }

      /**
       * A filter on the list of people returned based on whether these people are owners of the
       * account's company.
       */
      public Builder setOwner(Boolean owner) {
        this.owner = owner;
        return this;
      }
    }
  }
}
