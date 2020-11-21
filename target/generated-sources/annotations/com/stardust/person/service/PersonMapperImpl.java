package com.stardust.person.service;

import com.stardust.person.controller.PersonDetailModel;
import com.stardust.person.controller.PersonListModel;
import com.stardust.person.repository.PersonEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-20T15:27:50+0330",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_152 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonListModel entityToList(PersonEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PersonListModel personListModel = new PersonListModel();

        personListModel.setStardustEntityId( entity.getStardustEntityId() );
        personListModel.setStateId( entity.getStateId() );
        personListModel.setVersion( entity.getVersion() );
        personListModel.setCreatedDate( entity.getCreatedDate() );
        personListModel.setLastModifiedDate( entity.getLastModifiedDate() );
        personListModel.setSerial( entity.getSerial() );

        return personListModel;
    }

    @Override
    public PersonDetailModel entityToDetail(PersonEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PersonDetailModel personDetailModel = new PersonDetailModel();

        personDetailModel.setStardustEntityId( entity.getStardustEntityId() );
        personDetailModel.setStateId( entity.getStateId() );
        personDetailModel.setVersion( entity.getVersion() );
        personDetailModel.setCreatedDate( entity.getCreatedDate() );
        personDetailModel.setLastModifiedDate( entity.getLastModifiedDate() );
        personDetailModel.setSerial( entity.getSerial() );

        return personDetailModel;
    }

    @Override
    public PersonEntity detailToEntity(PersonDetailModel entity) {
        if ( entity == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setStardustEntityId( entity.getStardustEntityId() );
        personEntity.setVersion( entity.getVersion() );
        personEntity.setCreatedDate( entity.getCreatedDate() );
        personEntity.setLastModifiedDate( entity.getLastModifiedDate() );
        personEntity.setSerial( entity.getSerial() );
        personEntity.setStateId( entity.getStateId() );

        return personEntity;
    }
}
