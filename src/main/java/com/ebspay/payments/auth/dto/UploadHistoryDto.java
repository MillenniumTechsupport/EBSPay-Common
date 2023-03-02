package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.models.UploadHistory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UploadHistoryDto {

    private int id;
    private int partyId;
    private String uploadType;
    private String uploadFile;
    private int totalRecords;
    private int passedRecords;
    private int failedRecords;
    private int createdBy;
    private Date createdOn;

    private Date fromDate;
    private Date toDate;

    public UploadHistoryDto(int partyId, String uploadType, String uploadFile, int totalRecords, int passedRecords, int failedRecords, int createdBy, Date createdOn) {
        this.partyId = partyId;
        this.uploadType = uploadType;
        this.uploadFile = uploadFile;
        this.totalRecords = totalRecords;
        this.passedRecords = passedRecords;
        this.failedRecords = failedRecords;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
    }
    public UploadHistoryDto(UploadHistory uploadHistory) {
        this.id = id;
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
