package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
public class Polyclinic {
    private CashRegister cashRegister;
    private Doctor dentist;
    private Doctor therapist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;

    public Polyclinic(CashRegister cashRegister,
                      @Qualifier("dentist") Doctor dentist,
                      @Qualifier("therapist") Doctor therapist,
                      @Qualifier("juniorSurgeon") Doctor juniorSurgeon,
                      @Qualifier("seniorSurgeon") Doctor seniorSurgeon) {
        this.cashRegister = cashRegister;
        this.dentist = dentist;
        this.therapist = therapist;
        this.juniorSurgeon = juniorSurgeon;
        this.seniorSurgeon = seniorSurgeon;
    }

    public void treatAtTheDentist() {
        log.info("лечение у {}", dentist.getSpecialization());
        BigDecimal cost = dentist.getCostOfAdmission();
        cashRegister.acceptPayment(cost);
    }

    public void treatAtTheTherapist() {
        log.info("лечение у {}", therapist.getSpecialization());
        BigDecimal cost = therapist.getCostOfAdmission();
        cashRegister.acceptPayment(cost);
    }

    public void treatAtTheJuniorSurgeon() {
        log.info("лечение у {}", juniorSurgeon.getSpecialization());
        BigDecimal cost = juniorSurgeon.getCostOfAdmission();
        cashRegister.acceptPayment(cost);
    }

    public void treatAtTheSeniorSurgeon() {
        log.info("лечение у {}", seniorSurgeon.getSpecialization());
        BigDecimal cost = seniorSurgeon.getCostOfAdmission();
        cashRegister.acceptPayment(cost);
    }
}
