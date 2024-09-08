package ru.yandex.practicum.catsgram.exception;

public class NotFoundException extends RuntimeException {
    /**
     * Javadoc.
     *@param message - param-param.
     */
    public NotFoundException(String message) {
        super(message);
    }
}
