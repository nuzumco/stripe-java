// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.terminal.Reader;
import com.stripe.model.terminal.ReaderCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.terminal.ReaderCreateParams;
import com.stripe.param.terminal.ReaderDeleteParams;
import com.stripe.param.terminal.ReaderListParams;
import com.stripe.param.terminal.ReaderRetrieveParams;
import com.stripe.param.terminal.ReaderUpdateParams;

public class ReaderService extends ApiService {
  /** Creates a new <code>Reader</code> object. */
  public Reader create(ReaderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Reader</code> object. */
  public Reader create(ReaderCreateParams params, RequestOptions options) throws StripeException {
    String url = resourceUrl("/v1/terminal/readers");
    return request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Retrieves a <code>Reader</code> object. */
  public Reader retrieve(String reader, ReaderRetrieveParams params) throws StripeException {
    return retrieve(reader, params, (RequestOptions) null);
  }

  /** Retrieves a <code>Reader</code> object. */
  public Reader retrieve(String reader, ReaderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/readers/%s", reader);
    return request(ApiResource.RequestMethod.GET, url, params, Reader.class, options);
  }

  /**
   * Updates a <code>Reader</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Reader update(String id, ReaderUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Reader</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Reader update(String id, ReaderUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/readers/%s", id);
    return request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Returns a list of <code>Reader</code> objects. */
  public ReaderCollection list(ReaderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Reader</code> objects. */
  public ReaderCollection list(ReaderListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/readers");
    return requestCollection(url, params, ReaderCollection.class, options);
  }

  /** Deletes a <code>Reader</code> object. */
  public Reader delete(String id, ReaderDeleteParams params) throws StripeException {
    return delete(id, params, (RequestOptions) null);
  }

  /** Deletes a <code>Reader</code> object. */
  public Reader delete(String id, ReaderDeleteParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/readers/%s", id);
    return request(ApiResource.RequestMethod.DELETE, url, params, Reader.class, options);
  }
}
