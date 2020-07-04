package com.sda.hibernate.association.one_to_many_bi;

public class DemoOneToManyBidrectional {

    public static void main(String[] args) {

        // 2 children
        Child child1 = new Child();
        child1.setTitle("child1");

        Child child2 = new Child();
        child2.setTitle("child2");

        // 1 parent
        Parent parent = new Parent();
        parent.setName("parent");
        parent.setEmail("parent@gmai.com");
        parent.setCountry("home");

        // set children on parent
        parent.addChild(child1);
        parent.addChild(child2);

        // save
        ParentDao parentDao = new ParentDao();
        parentDao.create(parent);
    }
}
