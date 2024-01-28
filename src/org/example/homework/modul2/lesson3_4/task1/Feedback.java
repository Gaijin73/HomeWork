package org.example.homework.modul2.lesson3_4.task1;

import java.time.LocalDateTime;

public class Feedback {
    private int id;
    private String text;
    private int likesCount;
    private LocalDateTime dateTime;

    public Feedback(Integer id, String text, Integer likesCount, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.likesCount = likesCount;
        this.dateTime = dateTime;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", likesCount=" + likesCount +
                ", reviewDateTime=" + dateTime +
                '}';
    }
}
