package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.WorkflowConfiguration;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class WorkflowConfigurationDto {

    private int id;
    private WorkflowDefinitionDto workflowDefinition;
    private PartyDto party;

    private int orderOfExecution;
    private int createdBy;
    private Date createdOn;
    private boolean status;

    public WorkflowConfigurationDto(WorkflowConfiguration workflowConfiguration) {
        this.id = workflowConfiguration.getId();
        this.workflowDefinition = new WorkflowDefinitionDto(workflowConfiguration.getWorkflowDefinition());
        this.party = new PartyDto(workflowConfiguration.getParty());
        this.orderOfExecution = workflowConfiguration.getOrderOfExecution();
        this.createdBy = workflowConfiguration.getCreatedBy();
        this.createdOn = workflowConfiguration.getCreatedOn();
        this.status = workflowConfiguration.isStatus();
    }
}
