// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.BankAccountDeleteOnAccountParams;
import com.stripe.param.BankAccountDeleteOnCustomerParams;
import com.stripe.param.BankAccountUpdateOnAccountParams;
import com.stripe.param.BankAccountUpdateOnCustomerParams;
import com.stripe.param.BankAccountVerifyParams;

public class BankAccountService extends ApiService {
  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(String customer, String id, BankAccountVerifyParams params)
      throws StripeException {
    return verify(customer, id, params, (RequestOptions) null);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(
      String customer, String id, BankAccountVerifyParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/sources/%s/verify", customer, id);
    return request(ApiResource.RequestMethod.POST, url, params, BankAccount.class, options);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  public BankAccount update(String account, String id, BankAccountUpdateOnAccountParams params)
      throws StripeException {
    return update(account, id, params, (RequestOptions) null);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  public BankAccount update(
      String account, String id, BankAccountUpdateOnAccountParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/accounts/%s/external_accounts/%s", account, id);
    return request(ApiResource.RequestMethod.POST, url, params, BankAccount.class, options);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  public BankAccount update(String customer, String id, BankAccountUpdateOnCustomerParams params)
      throws StripeException {
    return update(customer, id, params, (RequestOptions) null);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  public BankAccount update(
      String customer, String id, BankAccountUpdateOnCustomerParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/sources/%s", customer, id);
    return request(ApiResource.RequestMethod.POST, url, params, BankAccount.class, options);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  public BankAccount delete(String account, String id, BankAccountDeleteOnAccountParams params)
      throws StripeException {
    return delete(account, id, params, (RequestOptions) null);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  public BankAccount delete(
      String account, String id, BankAccountDeleteOnAccountParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/accounts/%s/external_accounts/%s", account, id);
    return request(ApiResource.RequestMethod.DELETE, url, params, BankAccount.class, options);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  public BankAccount delete(String customer, String id, BankAccountDeleteOnCustomerParams params)
      throws StripeException {
    return delete(customer, id, params, (RequestOptions) null);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  public BankAccount delete(
      String customer, String id, BankAccountDeleteOnCustomerParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/sources/%s", customer, id);
    return request(ApiResource.RequestMethod.DELETE, url, params, BankAccount.class, options);
  }
}
