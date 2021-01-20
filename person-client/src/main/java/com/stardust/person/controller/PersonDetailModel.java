package com.stardust.person.controller;

import com.stardust.core.controller.StardustDetailModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * user PerosnDetailModel - 11/20/2020
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class PersonDetailModel extends StardustDetailModel {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String birthCertificateNumber;
}
