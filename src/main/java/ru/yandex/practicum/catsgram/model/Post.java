package ru.yandex.practicum.catsgram.model;

import lombok.Data;

import java.time.Instant;

@Data
public class Post {
    /**
     * уникальный идентификатор сообщения.
     */
    private Long id;
    /**
     * пользователь, который создал сообщение.
     */
    private long authorId;
    /**
     * текстовое описание сообщения.
     */
    private String description;
    /**
     * дата и время создания сообщения.
     */
    private Instant postDate;
}
