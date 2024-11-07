package com.javaacademy.polyclinic;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

@Slf4j
@Getter
@Component
public class CashRegister {
    private BigDecimal income = ZERO;

    public void acceptPayment(BigDecimal payment) {
        if (payment.compareTo(ZERO) > 0) {
            income = income.add(payment);
            log.info("Поступление: {}", payment);
        } else {
            log.warn("Некорректный платеж: {}", payment);
        }
    }

    public void printIncome() {
        log.info("Доход: {}", income);
    }
}
