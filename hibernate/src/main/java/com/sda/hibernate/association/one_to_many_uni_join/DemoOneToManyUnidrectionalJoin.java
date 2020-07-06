package com.sda.hibernate.association.one_to_many_uni_join;

import java.util.List;

public class DemoOneToManyUnidrectionalJoin {

    public static void main(String[] args) {
        // father dao
        FatherDao fatherDao = new FatherDao();

        // 2 son
        Son son1 = new Son();
        son1.setTitle("son1");

        Son son2 = new Son();
        son2.setTitle("son2");

        // 1 father
        Father father = new Father();
        father.setName("father");
        father.setEmail("father@gmail.com");
        father.setCountry("fatherland");

        // set sons on father

        // var 1 - set using setter
//        father.setSons(Arrays.asList(son1, son2));

        // var 2
        List<Son> sons = father.getSons();
        sons.add(son1);
        sons.add(son2);

        father.getSons().add(son1);

        // save parent
        fatherDao.create(father);

        // with cascade
        // save father -> father + all children
        // 3 delete operations ( 1 father + 2 children )

        // without cascade
        // save father -> father
        // 1 delete operations ( father )


        // fetch type
        // lazy
        // father = fatherDao.getFather(1)
        // father.getSons().get(1)

        // eager
        // father = fatherDao.getFather(1)
    }
}
