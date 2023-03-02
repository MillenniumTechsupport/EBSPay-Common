package com.ebspay.payments.auth.models.security;

import com.ebspay.payments.auth.dto.security.ScreenDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ebspay_screen")
public class Screen {
    @Id
    @Column(name = "screen_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int screenId;

    @Column(name = "page_code")
    private String pageCode;

    @Column(name = "page_name")
    private String pageName;

    @Column(name = "page_desc")
    private String pageDesc;

    @Column(name = "is_default")
    private boolean defaultScreen;

    @Column(name = "is_deleted")
    private boolean deleted;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "created_on")
    private Date createdOn;

    public Screen(ScreenDto screenDto){
        super();
        this.screenId = screenDto.getScreenId();
        this.pageCode = screenDto.getPageCode();
        this.pageName = screenDto.getPageName();
        this.pageDesc = screenDto.getPageDesc();
        this.defaultScreen= screenDto.isDefaultScreen();
        this.deleted= screenDto.isDeleted();
        this.createdBy= screenDto.getCreatedBy();
        this.createdOn= screenDto.getCreatedOn();
    }


}
