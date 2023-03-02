package com.ebspay.payments.auth.dto.security;

import com.ebspay.payments.auth.models.security.Screen;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScreenDto {
    private int screenId;
    private String pageCode;
    private String pageName;
    private String pageDesc;
    private boolean defaultScreen;
    private boolean deleted;
    private int createdBy;
    private Date createdOn;

    public ScreenDto(Screen screen){
        super();
        this.screenId = screen.getScreenId();
        this.pageCode = screen.getPageCode();
        this.pageName = screen.getPageName();
        this.pageDesc = screen.getPageDesc();
        this.defaultScreen= screen.isDefaultScreen();
        this.deleted= screen.isDeleted();
        this.createdBy= screen.getCreatedBy();
        this.createdOn= screen.getCreatedOn();
    }
}
