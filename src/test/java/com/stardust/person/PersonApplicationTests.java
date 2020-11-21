package com.stardust.person;

import com.stardust.core.StardustTester;
import com.stardust.core.exception.StardustException;
import com.stardust.core.repository.StardustRepository;
import com.stardust.person.controller.PersonDetailModel;
import com.stardust.person.controller.PersonListModel;
import com.stardust.person.repository.PersonEntity;
import com.stardust.person.repository.PersonRepository;
import com.stardust.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class PersonApplicationTests extends StardustTester<PersonListModel, PersonDetailModel, PersonEntity,Long> {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonService personService;

    @Override
    protected StardustRepository<PersonEntity, Long> getStardustRepository() {
        return personRepository;
    }

    @Override
    protected PersonEntity getDustEntityInstance() {
        return PersonEntity.builder().build();
    }

    @Override
    protected PersonDetailModel getValidDustDetail() throws StardustException {
        PersonDetailModel personDetailModel = PersonDetailModel
                .builder()
                .firstName("peyman")
                .lastName("mahdikhani")
                .birthCertificateNumber("0081537492")
                .build();

        Long stardustEntity = personService.createStardustEntity(personDetailModel);
        personDetailModel.setStardustEntityId(stardustEntity);
        return personDetailModel;
    }

    @Override
    protected String getDustName() {
        return "person";
    }
}
