package ru.yandex.practicum.catsgram.model;

import lombok.EqualsAndHashCode;
import java.time.Instant;

@EqualsAndHashCode(of = {"email"})
public class User {
    /**
     * уникальный идентификатор пользователя.
     */
    private Long id;
    /**
     * имя пользователя.
     */
    private String username;
    /**
     * электронная почта пользователя.
     */
    private String email;
    /**
     * пароль пользователя.
     */
    private String password;
    /**
     * дата и время регистрации.
     */
    private Instant registrationDate;
}
