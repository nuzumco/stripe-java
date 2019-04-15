// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.SubscriptionScheduleRevision;
import com.stripe.model.SubscriptionScheduleRevisionCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.SubscriptionScheduleRevisionListParams;
import com.stripe.param.SubscriptionScheduleRevisionRetrieveParams;

public class SubscriptionScheduleRevisionService extends ApiService {
  /**
   * Retrieves the details of an existing subscription schedule revision. You only need to supply
   * the unique subscription schedule revision identifier that was returned upon subscription
   * schedule creation or retrieval.
   */
  public SubscriptionScheduleRevision retrieve(
      String schedule, String revision, SubscriptionScheduleRevisionRetrieveParams params)
      throws StripeException {
    return retrieve(schedule, revision, params, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing subscription schedule revision. You only need to supply
   * the unique subscription schedule revision identifier that was returned upon subscription
   * schedule creation or retrieval.
   */
  public SubscriptionScheduleRevision retrieve(
      String schedule,
      String revision,
      SubscriptionScheduleRevisionRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/subscription_schedules/%s/revisions/%s", schedule, revision);
    return request(
        ApiResource.RequestMethod.GET, url, params, SubscriptionScheduleRevision.class, options);
  }

  /** Retrieves the list of subscription schedule revisions for a subscription schedule. */
  public SubscriptionScheduleRevisionCollection list(
      String schedule, SubscriptionScheduleRevisionListParams params) throws StripeException {
    return list(schedule, params, (RequestOptions) null);
  }

  /** Retrieves the list of subscription schedule revisions for a subscription schedule. */
  public SubscriptionScheduleRevisionCollection list(
      String schedule, SubscriptionScheduleRevisionListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/subscription_schedules/%s/revisions", schedule);
    return requestCollection(url, params, SubscriptionScheduleRevisionCollection.class, options);
  }
}