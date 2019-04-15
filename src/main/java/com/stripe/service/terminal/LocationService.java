// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.terminal.Location;
import com.stripe.model.terminal.LocationCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.terminal.LocationCreateParams;
import com.stripe.param.terminal.LocationDeleteParams;
import com.stripe.param.terminal.LocationListParams;
import com.stripe.param.terminal.LocationRetrieveParams;
import com.stripe.param.terminal.LocationUpdateParams;

public class LocationService extends ApiService {
  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(String id, LocationUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(String id, LocationUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/locations/%s", id);
    return request(ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /** Creates a new <code>Location</code> object. */
  public Location create(LocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Location</code> object. */
  public Location create(LocationCreateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/locations");
    return request(ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /** Retrieves a <code>Location</code> object. */
  public Location retrieve(String location, LocationRetrieveParams params) throws StripeException {
    return retrieve(location, params, (RequestOptions) null);
  }

  /** Retrieves a <code>Location</code> object. */
  public Location retrieve(String location, LocationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/locations/%s", location);
    return request(ApiResource.RequestMethod.GET, url, params, Location.class, options);
  }

  /** Returns a list of <code>Location</code> objects. */
  public LocationCollection list(LocationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Location</code> objects. */
  public LocationCollection list(LocationListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/locations");
    return requestCollection(url, params, LocationCollection.class, options);
  }

  /** Deletes a <code>Location</code> object. */
  public Location delete(String id, LocationDeleteParams params) throws StripeException {
    return delete(id, params, (RequestOptions) null);
  }

  /** Deletes a <code>Location</code> object. */
  public Location delete(String id, LocationDeleteParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/terminal/locations/%s", id);
    return request(ApiResource.RequestMethod.DELETE, url, params, Location.class, options);
  }
}
