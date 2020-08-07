package ru.netology.domain;

// файл Post.java
public class Post {
    private int id;           //идентификатор записи
    private int ownerId;      // идентификатор владельца стены
    private String fromId;    // id кто оставил запись
    private int date;         // дата опубликования
    private String text;      // текст статьи

    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;  // идентификатор записи, в ответ на которую была оставлена текущая

    private String copyright; // источник статьи

    private int countComments; // счетчик комментариев
    private int countRepost;  // счетчик репостов
    private int countView;    // кол-во просмотров

    private CountLike countLike;  // информация о лайках к записи, объект с полями
    private Geo geo;              // информация о местоположении , содержит поля
    private CommentsInfo commentsInfo;  // информация о комментариях к записи, объект с полями

    // + get/set на все поля
}
