package def.angular.http;

/**
 * Polyfill for [Headers](https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers), as
   * specified in the [Fetch Spec](https://fetch.spec.whatwg.org/#headers-class).
   *
   * The only known difference between this `Headers` implementation and the spec is the
   * lack of an `entries` method.
   *
   * ### Example ([live demo](http://plnkr.co/edit/MTdwT6?p=preview))
   *
   * ```
   * import {Headers} from '@angular/http';
   *
   * var firstHeaders = new Headers();
   * firstHeaders.append('Content-Type', 'image/jpeg');
   * console.log(firstHeaders.get('Content-Type')) //'image/jpeg'
   *
   * // Create headers from Plain Old JavaScript Object
   * var secondHeaders = new Headers({
   *   'X-My-Custom-Header': 'Angular'
   * });
   * console.log(secondHeaders.get('X-My-Custom-Header')); //'Angular'
   *
   * var thirdHeaders = new Headers(secondHeaders);
   * console.log(thirdHeaders.get('X-My-Custom-Header')); //'Angular'
   * ```
   *
   * @experimental
 */
public class Headers {

  public static class HeaderValue {
    public HeaderValue(String name, String value) {

    }
  }

  public Headers() {};
  public Headers(Headers headers) {};

  // TODO: Improve typing?
  public Headers(Object headers) {};


  /**
   * Returns a new Headers instance from the given DOMString of Response Headers
   */
  public native static Headers fromResponseHeaderString(String headersString);
  /**
   * Appends a header to existing list of header values for a given header name.
   */
  public native void append(String name, String value);
  /**
   * Deletes all header values for the given name.
   */
  public native void delete(String name);

  //forEach(fn: (values: string[], name: string, headers: Map<string, string[]>) => void): void;
  /**
   * Returns first header that matches given name.
   */
  public native String get(String header);
  /**
   * Check for existence of header by given name.
   */
  public native boolean has(String header);
  /**
   * Provides names of set headers
   */
  public native String[] keys();
  /**
   * Sets or overrides header value for given name.
   */
  public native void set(String header, String value);

  public native void set(String header, String[] value);

  /**
   * Returns values of all headers.
   */
  public native String[][] values();

  /**
   * Returns string of all headers.
   */
  // TODO: Improve type
  public native Object toJSON();

  /**
   * Returns list of header values for a given name.
   */
  public native String[] getAll(String header);

//  /**
//   * This method is not implemented.
//   */
//  entries(): void;
}