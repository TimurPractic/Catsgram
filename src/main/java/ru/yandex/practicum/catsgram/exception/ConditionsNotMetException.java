package ru.yandex.practicum.catsgram.exception;

public class ConditionsNotMetException extends RuntimeException {
    /**
     * Javadoc.
     * @param message - param-param.
     */
    public ConditionsNotMetException(final String message) {
        super(message);
    }
}
