package def.angular.http;

/**
 * Interface for options to construct a RequestOptions, based on
 * [RequestInit](https://fetch.spec.whatwg.org/#requestinit) from the Fetch spec.
 *
 * @experimental
 */
public class RequestOptionsArgs {

  public RequestOptionsArgs(Headers headers) {
    this.headers = headers;
  }

  public RequestOptionsArgs(String url, String method, String search, Headers headers,
                            Body body, boolean withCredentials) {
    this.url = url;
    this.method = method;
    this.search = search;
    this.headers = headers;
    this.body = body;
    this.withCredentials = withCredentials;
  }

  String url;
  // TODO: Add requestMethod type
  String method;
  // TODO: Add URLSearchParams
  String search;
  Headers headers;
  Body body;
  boolean withCredentials;
  // TODO: Add ResponseContentType

/*  url?:;
  method?: string | RequestMethod;
  search?: string | URLSearchParams;
  headers?: Headers;
  body?: any;
  withCredentials?: boolean;
  responseType?: ResponseContentType;
  */

}