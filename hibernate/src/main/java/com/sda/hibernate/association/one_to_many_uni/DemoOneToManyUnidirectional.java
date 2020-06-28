package com.sda.hibernate.association.one_to_many_uni;

import java.util.ArrayList;
import java.util.List;

public class DemoOneToManyUnidirectional {

    public static void main(String[] args) {
        MotherDao motherDao = new MotherDao();

        Daughter daughter1 = new Daughter();
        daughter1.setTitle("daughter1");

        Daughter daughter2 = new Daughter();
        daughter2.setTitle("daughter2");

        Mother mother = new Mother();
        mother.setName("mother");
        mother.setEmail("mother@gmail.com");
        mother.setCountry("motherland");

        // add children to parent
//        mother.getDaughters().add(daughter1);
//        mother.getDaughters().add(daughter2);

        // add children to parent version 2
        List<Daughter> daughters = new ArrayList<>();
        daughters.add(daughter1);
        daughters.add(daughter2);
        mother.setDaughters(daughters);

        // save parent
        motherDao.create(mother);
    }
}
