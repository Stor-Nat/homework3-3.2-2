package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;                      // с􏰀юда можно класт􏰆ь л􏰀юбых менеджеров

    /**
     * Main Page generation
     */

    public Post[] search(int ownerId, String domain, String query, int count, int offset, boolean extended) { // но метод у каждого свой (со своей логикой)
            // TODO: add logic
            return null;
    }

    public void delete(int ownerId, int postId) {
            // TODO: add logic
    }
}
