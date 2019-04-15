// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.WebhookEndpoint;
import com.stripe.model.WebhookEndpointCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.WebhookEndpointCreateParams;
import com.stripe.param.WebhookEndpointDeleteParams;
import com.stripe.param.WebhookEndpointListParams;
import com.stripe.param.WebhookEndpointRetrieveParams;
import com.stripe.param.WebhookEndpointUpdateParams;

public class WebhookEndpointService extends ApiService {
  /**
   * Updates the webhook endpoint. You may edit the <code>url</code>, the list of <code>
   * enabled_events</code>, and the status of your endpoint.
   */
  public WebhookEndpoint update(String id, WebhookEndpointUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }

  /**
   * Updates the webhook endpoint. You may edit the <code>url</code>, the list of <code>
   * enabled_events</code>, and the status of your endpoint.
   */
  public WebhookEndpoint update(
      String id, WebhookEndpointUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/webhook_endpoints/%s", id);
    return request(ApiResource.RequestMethod.POST, url, params, WebhookEndpoint.class, options);
  }

  /**
   * A webhook endpoint must have a <code>url</code> and a list of <code>enabled_events</code>. You
   * may optionally specify the Boolean <code>connect</code> parameter. If set to true, then a
   * Connect webhook endpoint that notifies the specified <code>url</code> about events from all
   * connected accounts is created; otherwise an account webhook endpoint that notifies the
   * specified <code>url</code> only about events from your account is created. You can also create
   * webhook endpoints in the <a href="https://dashboard.stripe.com/account/webhooks">webhooks
   * settings</a> section of the Dashboard.
   */
  public WebhookEndpoint create(WebhookEndpointCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * A webhook endpoint must have a <code>url</code> and a list of <code>enabled_events</code>. You
   * may optionally specify the Boolean <code>connect</code> parameter. If set to true, then a
   * Connect webhook endpoint that notifies the specified <code>url</code> about events from all
   * connected accounts is created; otherwise an account webhook endpoint that notifies the
   * specified <code>url</code> only about events from your account is created. You can also create
   * webhook endpoints in the <a href="https://dashboard.stripe.com/account/webhooks">webhooks
   * settings</a> section of the Dashboard.
   */
  public WebhookEndpoint create(WebhookEndpointCreateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/webhook_endpoints");
    return request(ApiResource.RequestMethod.POST, url, params, WebhookEndpoint.class, options);
  }

  /** Retrieves the webhook endpoint with the given ID. */
  public WebhookEndpoint retrieve(String webhookEndpoint, WebhookEndpointRetrieveParams params)
      throws StripeException {
    return retrieve(webhookEndpoint, params, (RequestOptions) null);
  }

  /** Retrieves the webhook endpoint with the given ID. */
  public WebhookEndpoint retrieve(
      String webhookEndpoint, WebhookEndpointRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/webhook_endpoints/%s", webhookEndpoint);
    return request(ApiResource.RequestMethod.GET, url, params, WebhookEndpoint.class, options);
  }

  /** Returns a list of your webhook endpoints. */
  public WebhookEndpointCollection list(WebhookEndpointListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your webhook endpoints. */
  public WebhookEndpointCollection list(WebhookEndpointListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/webhook_endpoints");
    return requestCollection(url, params, WebhookEndpointCollection.class, options);
  }

  /**
   * You can also delete webhook endpoints via the <a
   * href="https://dashboard.stripe.com/account/webhooks">webhook endpoint management</a> page of
   * the Stripe dashboard.
   */
  public WebhookEndpoint delete(String id, WebhookEndpointDeleteParams params)
      throws StripeException {
    return delete(id, params, (RequestOptions) null);
  }

  /**
   * You can also delete webhook endpoints via the <a
   * href="https://dashboard.stripe.com/account/webhooks">webhook endpoint management</a> page of
   * the Stripe dashboard.
   */
  public WebhookEndpoint delete(
      String id, WebhookEndpointDeleteParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/webhook_endpoints/%s", id);
    return request(ApiResource.RequestMethod.DELETE, url, params, WebhookEndpoint.class, options);
  }
}
