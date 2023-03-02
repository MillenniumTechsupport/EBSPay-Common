package com.ebspay.payments.auth.models;

import com.ebspay.payments.auth.dto.WorkflowDefinitionDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ebspay_workflow_definition")
public class WorkflowDefinition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private boolean mandatory;
    private String topicName;
    private int createdBy;
    private Date createdOn;
    private boolean status;

    private String nameWorkflow;

    private int sequenceOfExecution;//Execution Order of the Workflow defined by Millennium(Product Owner)

    public WorkflowDefinition(WorkflowDefinitionDto workflowDefinitionDto) {
        this.id = workflowDefinitionDto.getId();
        this.name = workflowDefinitionDto.getName();
        this.mandatory = workflowDefinitionDto.isMandatory();
        this.topicName = workflowDefinitionDto.getTopicName();
        this.createdBy = workflowDefinitionDto.getCreatedBy();
        this.createdOn = workflowDefinitionDto.getCreatedOn();
        this.status = workflowDefinitionDto.isStatus();
        this.sequenceOfExecution = this.getSequenceOfExecution();
        this.nameWorkflow = workflowDefinitionDto.getNameWorkflow();
    }
}
