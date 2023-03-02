package com.ebspay.payments.auth.models;

import com.ebspay.payments.auth.dto.UploadHistoryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ebspay_upload_history")
public class UploadHistory {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "party_id")
    private int partyId;

    @Column(name = "upload_type")
    private String uploadType;

    @Column(name = "upload_file")
    private String uploadFile;

    @Column(name = "total_records")
    private int totalRecords;

    @Column(name = "passed_records")
    private int passedRecords;

    @Column(name = "failed_records")
    private int failedRecords;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "created_on")
    private Date createdOn;

    public UploadHistory(UploadHistoryDto uploadHistory) {
//        this.id = uploadHistory.getId();
        this.partyId = uploadHistory.getPartyId();
        this.uploadType = uploadHistory.getUploadType();
        this.uploadFile = uploadHistory.getUploadFile();
        this.totalRecords = uploadHistory.getTotalRecords();
        this.passedRecords = uploadHistory.getPassedRecords();
        this.failedRecords = uploadHistory.getFailedRecords();
        this.createdBy = uploadHistory.getCreatedBy();
        this.createdOn = uploadHistory.getCreatedOn();
    }
}
