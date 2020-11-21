package com.stardust.person.service;

import com.stardust.core.service.StardustService;
import com.stardust.person.controller.PersonDetailModel;
import com.stardust.person.controller.PersonListModel;
import com.stardust.person.repository.PersonEntity;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * user PersonService - 11/20/2020
 */
public interface PersonService extends StardustService<PersonListModel, PersonDetailModel, PersonEntity, Long> {
}
