package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.config.Specialization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Data
@AllArgsConstructor
public class Doctor {
    private BigDecimal costOfAdmission;
    private Specialization specialization;

    public BigDecimal treatPerson() {
        log.info("{} вылечил человека", specialization);
        return costOfAdmission;
    }
}
