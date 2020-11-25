package com.stardust.person.service;

import com.stardust.person.controller.PersonDetailModel;
import com.stardust.person.controller.PersonDetailModel.PersonDetailModelBuilder;
import com.stardust.person.controller.PersonListModel;
import com.stardust.person.controller.PersonListModel.PersonListModelBuilder;
import com.stardust.person.repository.PersonEntity;
import com.stardust.person.repository.PersonEntity.PersonEntityBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-25T14:08:44+0330",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonListModel entityToList(PersonEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PersonListModelBuilder<?, ?> personListModel = PersonListModel.builder();

        personListModel.stardustEntityId( entity.getStardustEntityId() );
        personListModel.stateId( entity.getStateId() );
        personListModel.version( entity.getVersion() );
        personListModel.createdDate( entity.getCreatedDate() );
        personListModel.lastModifiedDate( entity.getLastModifiedDate() );
        personListModel.serial( entity.getSerial() );
        personListModel.firstName( entity.getFirstName() );
        personListModel.lastName( entity.getLastName() );
        personListModel.birthCertificateNumber( entity.getBirthCertificateNumber() );

        return personListModel.build();
    }

    @Override
    public PersonDetailModel entityToDetail(PersonEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PersonDetailModelBuilder<?, ?> personDetailModel = PersonDetailModel.builder();

        personDetailModel.stardustEntityId( entity.getStardustEntityId() );
        personDetailModel.stateId( entity.getStateId() );
        personDetailModel.version( entity.getVersion() );
        personDetailModel.createdDate( entity.getCreatedDate() );
        personDetailModel.lastModifiedDate( entity.getLastModifiedDate() );
        personDetailModel.serial( entity.getSerial() );
        personDetailModel.firstName( entity.getFirstName() );
        personDetailModel.lastName( entity.getLastName() );
        personDetailModel.birthCertificateNumber( entity.getBirthCertificateNumber() );

        return personDetailModel.build();
    }

    @Override
    public PersonEntity detailToEntity(PersonDetailModel entity) {
        if ( entity == null ) {
            return null;
        }

        PersonEntityBuilder<?, ?> personEntity = PersonEntity.builder();

        personEntity.stardustEntityId( entity.getStardustEntityId() );
        personEntity.version( entity.getVersion() );
        personEntity.createdDate( entity.getCreatedDate() );
        personEntity.lastModifiedDate( entity.getLastModifiedDate() );
        personEntity.serial( entity.getSerial() );
        personEntity.stateId( entity.getStateId() );
        personEntity.firstName( entity.getFirstName() );
        personEntity.lastName( entity.getLastName() );
        personEntity.birthCertificateNumber( entity.getBirthCertificateNumber() );

        return personEntity.build();
    }

    @Override
    public void updateEntity(PersonDetailModel arg0, PersonEntity arg1) {
        if ( arg0 == null ) {
            return;
        }

        arg1.setStardustEntityId( arg0.getStardustEntityId() );
        arg1.setVersion( arg0.getVersion() );
        arg1.setCreatedDate( arg0.getCreatedDate() );
        arg1.setLastModifiedDate( arg0.getLastModifiedDate() );
        arg1.setStateId( arg0.getStateId() );
        arg1.setSerial( arg0.getSerial() );
        arg1.setFirstName( arg0.getFirstName() );
        arg1.setLastName( arg0.getLastName() );
        arg1.setBirthCertificateNumber( arg0.getBirthCertificateNumber() );
    }
}
