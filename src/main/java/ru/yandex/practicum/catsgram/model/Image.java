package ru.yandex.practicum.catsgram.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"id"})
public class Image {
    /**
     * уникальный идентификатор изображения.
     */
    private Long id;
    /**
     * уникальный идентификатор поста, к которому прикреплено изображение.
     */
    private long postId;
    /**
     * имя файла, который содержит изображение.
     */
    private String originalFileName;
    /**
     * путь, по которому изображение было сохранено.
     */
    private String filePath;
}
