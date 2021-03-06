
package com.tangxiaolv.router.exceptions;

/**
 * Router Exception: undefined router
 */
public class NotFoundRouterException extends Exception {


    public NotFoundRouterException() {
        super();
    }
    public NotFoundRouterException(String message) {
        super(message);
    }

    public NotFoundRouterException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundRouterException(Throwable cause) {
        super(cause);
    }
}
