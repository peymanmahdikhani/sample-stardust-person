package com.stardust.person.repository;

import com.stardust.core.repository.StardustEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * user PersonEntity - 11/20/2020
 */
@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class PersonEntity extends StardustEntity<Long> {
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String birthCertificateNumber;
}
