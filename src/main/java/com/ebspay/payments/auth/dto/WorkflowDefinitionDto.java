package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.WorkflowDefinition;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class WorkflowDefinitionDto {
    private int id;
    private String name;
    private String code;
    private boolean mandatory;
    private String topicName;
    private int createdBy;
    private Date createdOn;
    private boolean status;
    private int sequenceOfExecution;

    private String nameWorkflow;

    public WorkflowDefinitionDto(WorkflowDefinition workflowDefinition) {
        this.id = workflowDefinition.getId();
        this.name = workflowDefinition.getName();
        this.code = workflowDefinition.getCode();
        this.mandatory = workflowDefinition.isMandatory();
        this.topicName = workflowDefinition.getTopicName();
        this.createdBy = workflowDefinition.getCreatedBy();
        this.createdOn = workflowDefinition.getCreatedOn();
        this.status = workflowDefinition.isStatus();
        this.sequenceOfExecution = workflowDefinition.getSequenceOfExecution();
        this.nameWorkflow = workflowDefinition.getNameWorkflow();
    }
}
