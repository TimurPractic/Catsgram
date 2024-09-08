package ru.yandex.practicum.catsgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatsgramApp {
//    private CatsgramApp() {
//        // Предотвращаем создание экземпляров
//    }
    /**
     * Основной метод приложения.
     * Ожидает JSON строку от пользователя и проверяет её корректность.
     *
     * @param args аргументы командной строки, которые не используются.
     */
//    public static void main(final String[] args) {

        public static void main(final String[] args) {
            SpringApplication.run(CatsgramApp.class, args);
        }

}
