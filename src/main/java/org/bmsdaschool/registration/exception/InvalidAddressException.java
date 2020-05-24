package org.bmsdaschool.registration.exception;

public class InvalidAddressException extends Exception {
    public InvalidAddressException() {
        super();
    }

    public InvalidAddressException(String message) {
        super(message);
    }
}
