package def.angular.http;

/**
 * Creates a request options object to be optionally provided when instantiating a
 * {@link Request}.
 * <p>
 * This class is based on the `RequestInit` description in the [Fetch
 * Spec](https://fetch.spec.whatwg.org/#requestinit).
 * <p>
 * All values are null by default. Typical defaults can be found in the {@link BaseRequestOptions}
 * class, which sub-classes `RequestOptions`.
 * <p>
 * ### Example ([live demo](http://plnkr.co/edit/7Wvi3lfLq41aQPKlxB4O?p=preview))
 * <p>
 * ```typescript
 * import {RequestOptions, Request, RequestMethod} from '@angular/http';
 * <p>
 * var options = new RequestOptions({
 * method: RequestMethod.Post,
 * url: 'https://google.com'
 * });
 * var req = new Request(options);
 * console.log('req.method:', RequestMethod[req.method]); // Post
 * console.log('options.url:', options.url); // https://google.com
 * ```
 *
 * @experimental
 */
public class RequestOptions {
  /**
   * Http method with which to execute a {@link Request}.
   * Acceptable methods are defined in the {@link RequestMethod} enum.
   */
  String reuqestMethod;
  // TODO: Add RequestMethod
  /**
   * {@link Headers} to be attached to a {@link Request}.
   */
  Headers headers;
  /**
   * Body to be used when creating a {@link Request}.
   */
  Object body;
  /**
   * Url with which to perform a {@link Request}.
   */
  String url;
  /**
   * Search parameters to be included in a {@link Request}.
   */
  //search: URLSearchParams;
  /**
   * Enable use credentials for a {@link Request}.
   */
  boolean withCredentials;

  // TODO: add ResponseContentType
  //ResponseContentType responseContentType;

  public RequestOptions(RequestOptionsArgs args) {
  };

  /**
   * Creates a copy of the `RequestOptions` instance, using the optional input as values to override
   * existing values. This method will not change the values of the instance on which it is being
   * called.
   *
   * Note that `headers` and `search` will override existing values completely if present in
   * the `options` object. If these values should be merged, it should be done prior to calling
   * `merge` on the `RequestOptions` instance.
   *
   * ### Example ([live demo](http://plnkr.co/edit/6w8XA8YTkDRcPYpdB9dk?p=preview))
   *
   * ```typescript
   * import {RequestOptions, Request, RequestMethod} from '@angular/http';
   *
   * var options = new RequestOptions({
   *   method: RequestMethod.Post
   * });
   * var req = new Request(options.merge({
   *   url: 'https://google.com'
   * }));
   * console.log('req.method:', RequestMethod[req.method]); // Post
   * console.log('options.url:', options.url); // null
   * console.log('req.url:', req.url); // https://google.com
   * ```
   */
  // TODO: Implement merge
//    merge(options?: RequestOptionsArgs): RequestOptions;
}
