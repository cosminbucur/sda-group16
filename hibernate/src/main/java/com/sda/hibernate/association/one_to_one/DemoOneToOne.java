package com.sda.hibernate.association.one_to_one;

import java.time.LocalDate;

public class DemoOneToOne {

    public static void main(String[] args) {
        AccountDao accountDao = new AccountDao();

        Employee employee = new Employee();
        employee.setFirstName("jon");
        employee.setLastName("snow");
        employee.setEmail("jonsnow@gmail.com");

        Account account = new Account();
        account.setAccountNumber("12");
        account.setEmploymentDate(LocalDate.now());
        account.setEmployee(employee);

        employee.setAccount(account);

        // save both in one shot
        accountDao.create(account);
    }
}
