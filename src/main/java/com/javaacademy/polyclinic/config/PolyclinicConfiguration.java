package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.Doctor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.javaacademy.polyclinic.config.Specialization.*;

@Configuration
@EnableConfigurationProperties(value = DoctorProperty.class)
public class PolyclinicConfiguration {
    private DoctorProperty doctorProperty;

    public PolyclinicConfiguration(DoctorProperty doctorProperty) {
        this.doctorProperty = doctorProperty;
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorProperty.getDentistPrice(), DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(doctorProperty.getTherapistPrice(), THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(doctorProperty.getJuniorSurgeonPrice(), SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(doctorProperty.getSeniorSurgeonPrice(), SURGEON);
    }
}
