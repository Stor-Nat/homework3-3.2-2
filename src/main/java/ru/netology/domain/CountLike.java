package ru.netology.domain;

public class CountLike {
    private int count;         // число пользователей, которым понравилась запись
    private boolean userLikes; // наличие отметки «Мне нравится» от текущего пользователя
    private int canLike;       // может ли текущий пользователь поставить отметку «Мне нравится» (1-может, 0-не может)
    private boolean canPublish;// может ли текущий пользователь сделать репост записи

    // + get/set на все поля
}
