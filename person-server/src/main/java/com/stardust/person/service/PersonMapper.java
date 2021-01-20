package com.stardust.person.service;

import com.stardust.core.service.StardustMapper;
import com.stardust.core.service.StardustMapperConfig;
import com.stardust.person.controller.PersonDetailModel;
import com.stardust.person.controller.PersonListModel;
import com.stardust.person.repository.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * user PersonMapper - 11/20/2020
 */
@Mapper(config = StardustMapperConfig.class)
public interface PersonMapper extends StardustMapper<PersonListModel, PersonDetailModel, PersonEntity> {
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );
}
