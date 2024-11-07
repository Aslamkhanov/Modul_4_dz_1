package com.javaacademy.polyclinic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "doctor")
@Data
public class DoctorProperty {
    private BigDecimal dentistPrice;
    private BigDecimal therapistPrice;
    private BigDecimal juniorSurgeonPrice;
    private BigDecimal seniorSurgeonPrice;
}
