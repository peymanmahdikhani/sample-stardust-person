package com.stardust.person.controller;

import com.stardust.core.controller.StardustController;
import com.stardust.core.service.StardustService;
import com.stardust.person.repository.PersonEntity;
import com.stardust.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * user PersonController - 11/20/2020
 */
@RestController
@RequiredArgsConstructor
public class PersonController extends StardustController<PersonListModel, PersonDetailModel, PersonEntity> {
    private final PersonService personService;

    @Override
    protected StardustService<PersonListModel, PersonDetailModel, PersonEntity> getService() {
        return personService;
    }
}
