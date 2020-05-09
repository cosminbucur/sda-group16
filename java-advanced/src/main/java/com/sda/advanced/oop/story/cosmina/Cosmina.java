package com.sda.advanced.oop.story.cosmina;

import com.sda.advanced.oop.story.women.FinancialSecurity;
import com.sda.advanced.oop.story.women.Love;
import com.sda.advanced.oop.story.women.Woman;

public class Cosmina extends Woman {

    public Cosmina(Love love, FinancialSecurity financialSecurity) {
        super(love, financialSecurity);
    }

    @Override
    public void feel() {
        System.out.println("feeling intense");
    }

    @Override
    public void dream() {
        System.out.println("become a programmer");
    }

    @Override
    public void relax() {
        System.out.println("watching a movie");
    }
}
