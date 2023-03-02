package com.ebspay.payments.auth.dto.security;

import com.ebspay.payments.auth.models.security.RolePermission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolePermissionDto {
    private int permissionId;

    private int roleId;
    private RoleDto roleDto;

    private int screenId;
    private ScreenDto screen;
    private boolean add;
    private boolean update;
    private boolean delete;
    private boolean view;
    private boolean deleted;
    private int createdBy;
    private Date createdOn;

    public RolePermissionDto(RolePermission rolePermission){
        super();
        this.permissionId = rolePermission.getPermissionId();
        this.roleDto = new RoleDto(rolePermission.getRole());
        this.screen = new ScreenDto(rolePermission.getScreen());
        this.add = rolePermission.isAdd();
        this.update = rolePermission.isUpdate();
        this.delete = rolePermission.isDelete();
        this.view = rolePermission.isView();
        this.deleted = rolePermission.isDeleted();
        this.createdBy = rolePermission.getCreatedBy();
        this.createdOn = rolePermission.getCreatedOn();
    }
}
