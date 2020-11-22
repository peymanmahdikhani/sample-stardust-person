package com.stardust.person.service;

import com.stardust.core.exception.StardustException;
import com.stardust.core.repository.StardustRepository;
import com.stardust.core.service.StardustMapper;
import com.stardust.core.service.StardustServiceImpl;
import com.stardust.person.controller.PersonDetailModel;
import com.stardust.person.controller.PersonListModel;
import com.stardust.person.repository.PersonEntity;
import com.stardust.person.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * user PersonServiceImpl - 11/20/2020
 */
@Service
@RequiredArgsConstructor
public class PersonServiceImpl extends StardustServiceImpl<PersonListModel, PersonDetailModel, PersonEntity, Long> implements PersonService {
    private final  PersonMapper personMapper;
    private final  PersonRepository personRepository;

    @Override
    public StardustMapper<PersonListModel, PersonDetailModel, PersonEntity, Long> getStardustObjectMapper() {
        return personMapper;
    }

    @Override
    public StardustRepository<PersonEntity, Long> getStardustRepository() {
        return personRepository;
    }
}
