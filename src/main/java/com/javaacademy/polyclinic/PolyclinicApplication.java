package com.javaacademy.polyclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PolyclinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
        Polyclinic polyclinic = context.getBean(Polyclinic.class);
        CashRegister cashRegister = context.getBean(CashRegister.class);
        polyclinic.treatAtTheDentist();
        polyclinic.treatAtTheTherapist();
        polyclinic.treatAtTheJuniorSurgeon();
        polyclinic.treatAtTheSeniorSurgeon();
        cashRegister.printIncome();
    }
}
