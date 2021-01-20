package com.stardust.person.stateaction;

import com.stardust.core.jms.StardustJmsTemplate;
import com.stardust.core.statemachine.core.action.StardustActionType;
import com.stardust.core.statemachine.core.actionservice.StardustActionServiceBase;
import com.stardust.core.statemachine.core.state.StardustStateDraft;
import com.stardust.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Developer peyman mahdikhani
 * Email: payman.mahdikhani@gmail.com
 * Url: https://www.linkedin.com/in/peyman-mahdikhani
 * <p>
 * person PersonDraftStateActionService - 1/11/2021
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class PersonGenerateUserOnDraftStateActionService extends StardustActionServiceBase {
    private final PersonService personService;
    private final StardustJmsTemplate stardustJmsTemplate;

    @Override
    public String getState() {
        return StardustStateDraft.STATE_NAME;
    }

    @Override
    public String getEvent() {
        return StardustStateDraft.EVENT_VERIFY;
    }

    @Override
    public void execute(UUID stardustEntityId, StardustActionType actionType) {
        log.debug("person going to verify by action type: " + actionType.name());

        stardustJmsTemplate.publishServiceEvent(
                "user",
                this,
                stardustEntityId
        );
    }
}
