// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.FeeRefund;
import com.stripe.model.FeeRefundCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.FeeRefundCreateParams;
import com.stripe.param.FeeRefundListParams;
import com.stripe.param.FeeRefundRetrieveParams;
import com.stripe.param.FeeRefundUpdateParams;

public class FeeRefundService extends ApiService {
  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  public FeeRefund update(String fee, String id, FeeRefundUpdateParams params)
      throws StripeException {
    return update(fee, id, params, (RequestOptions) null);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  public FeeRefund update(
      String fee, String id, FeeRefundUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/application_fees/%s/refunds/%s", fee, id);
    return request(ApiResource.RequestMethod.POST, url, params, FeeRefund.class, options);
  }

  /**
   * By default, you can see the 10 most recent refunds stored directly on the application fee
   * object, but you can also retrieve details about a specific refund stored on the application
   * fee.
   */
  public FeeRefund retrieve(String fee, String id, FeeRefundRetrieveParams params)
      throws StripeException {
    return retrieve(fee, id, params, (RequestOptions) null);
  }

  /**
   * By default, you can see the 10 most recent refunds stored directly on the application fee
   * object, but you can also retrieve details about a specific refund stored on the application
   * fee.
   */
  public FeeRefund retrieve(
      String fee, String id, FeeRefundRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/application_fees/%s/refunds/%s", fee, id);
    return request(ApiResource.RequestMethod.GET, url, params, FeeRefund.class, options);
  }

  /**
   * Refunds an application fee that has previously been collected but not yet refunded. Funds will
   * be refunded to the Stripe account from which the fee was originally collected.
   *
   * <p>You can optionally refund only part of an application fee. You can do so multiple times,
   * until the entire fee has been refunded.
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again. This method will raise
   * an error when called on an already-refunded application fee, or when trying to refund more
   * money than is left on an application fee.
   */
  public FeeRefund create(String id, FeeRefundCreateParams params) throws StripeException {
    return create(id, params, (RequestOptions) null);
  }

  /**
   * Refunds an application fee that has previously been collected but not yet refunded. Funds will
   * be refunded to the Stripe account from which the fee was originally collected.
   *
   * <p>You can optionally refund only part of an application fee. You can do so multiple times,
   * until the entire fee has been refunded.
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again. This method will raise
   * an error when called on an already-refunded application fee, or when trying to refund more
   * money than is left on an application fee.
   */
  public FeeRefund create(String id, FeeRefundCreateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/application_fees/%s/refunds", id);
    return request(ApiResource.RequestMethod.POST, url, params, FeeRefund.class, options);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the <code>limit</code> and <code>
   * starting_after</code> parameters to page through additional refunds.
   */
  public FeeRefundCollection list(String id, FeeRefundListParams params) throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the <code>limit</code> and <code>
   * starting_after</code> parameters to page through additional refunds.
   */
  public FeeRefundCollection list(String id, FeeRefundListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/application_fees/%s/refunds", id);
    return requestCollection(url, params, FeeRefundCollection.class, options);
  }
}
