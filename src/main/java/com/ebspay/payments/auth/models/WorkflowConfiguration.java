package com.ebspay.payments.auth.models;

import com.ebspay.payments.auth.dto.WorkflowConfigurationDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ebspay_party_workflow_config")
public class WorkflowConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "workflow_definition_id", referencedColumnName = "id")
    private WorkflowDefinition workflowDefinition;
    @ManyToOne
    @JoinColumn(name = "party_id", referencedColumnName = "party_id")
    private Party party;
    private int orderOfExecution;//Execution Order of the Workflow opted by the Financial Institution
    private int createdBy;
    private Date createdOn;
    private boolean status;

    public WorkflowConfiguration(WorkflowConfigurationDto workflowConfiguration) {
        this.id = workflowConfiguration.getId();
        this.workflowDefinition = new WorkflowDefinition(workflowConfiguration.getWorkflowDefinition());
        this.party = new Party(workflowConfiguration.getParty());
        this.orderOfExecution = workflowConfiguration.getOrderOfExecution();
        this.createdBy = workflowConfiguration.getCreatedBy();
        this.createdOn = workflowConfiguration.getCreatedOn();
        this.status = workflowConfiguration.isStatus();
    }
}
