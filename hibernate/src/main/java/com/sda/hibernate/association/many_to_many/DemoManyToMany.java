package com.sda.hibernate.association.many_to_many;

public class DemoManyToMany {

    public static void main(String[] args) {
        Tag tag1 = new Tag();
        tag1.setTitle("tag1");

        Tag tag2 = new Tag();
        tag2.setTitle("tag2");

        Post post1 = new Post();
        post1.setName("post1");

        Post post2 = new Post();
        post2.setName("post2");

        // how to check many to many

        // add two tags to post 1
        post1.addTag(tag1);
        post1.addTag(tag2);

        // add 1 tag to post 2
        post2.addTag(tag1);

        // save posts
        PostDao postDao = new PostDao();
        postDao.create(post1);
        postDao.create(post2);
    }
}
