package ru.netology.domain;

public class Place {
    private int id; 	     // идентификатор места.
    private String title;    // название места.
    private int latitude;    // географическая широта, заданная в градусах (от -90 до 90).
    private int longitude;   // географическая широта, заданная в градусах (от -90 до 90).
    private int created;     // дата создания места в Unixtime.
    private int country;     // идентификатор страны.
    private int city;        // идентификатор города.
    private String address;  // адрес места.
}
