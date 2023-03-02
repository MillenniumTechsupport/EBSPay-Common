package com.ebspay.payments.auth.dto.PartyService;

import com.ebspay.payments.auth.dto.IdentityDTO;
import com.ebspay.payments.auth.models.ServiceProviderAndServices.ServiceProvider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProviderDto {
    private int providerId;
    private String providerName;
    private String providerCode;
    private String comment;
    private boolean status;
    private int createdBy;
    private Date createdOn;

    private int modifiedBy;
    private Date modifiedOn;

    private List<IdentityDTO> identityList;

    public ProviderDto(ServiceProvider serviceProvider){
        this.providerId = serviceProvider.getId();
        this.providerName  = serviceProvider.getProviderName();
        this.providerCode = serviceProvider.getProviderCode();
        this.comment = serviceProvider.getComment();
        this.status = serviceProvider.getStatus();
        this.createdBy = serviceProvider.getCreatedBy();
        this.createdOn = serviceProvider.getCreatedOn();
    }
}
