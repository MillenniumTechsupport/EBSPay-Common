package com.ebspay.payments.auth.models.security;

import com.ebspay.payments.auth.dto.security.RolePermissionDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ebspay_role_permission")
public class RolePermission {

    @Id
    @Column(name = "permission_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int permissionId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Role role;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "page_id", referencedColumnName = "screen_id")
    private Screen screen;
    @Column(name = "add")
    private boolean add;
    @Column(name = "update")
    private boolean update;
    @Column(name = "delete")
    private boolean delete;
    @Column(name = "view")
    private boolean view;
    @Column(name = "is_deleted")
    private boolean deleted;
    @Column(name = "created_by")
    private int createdBy;
    @Column(name = "created_on")
    private Date createdOn;

    public RolePermission(RolePermissionDto rolePermissionDto){
        super();
        this.permissionId = rolePermissionDto.getPermissionId();
        this.add = rolePermissionDto.isAdd();
        this.update = rolePermissionDto.isUpdate();
        this.delete = rolePermissionDto.isDelete();
        this.view = rolePermissionDto.isView();
        this.deleted = rolePermissionDto.isDeleted();
        this.createdBy = rolePermissionDto.getCreatedBy();
        this.createdOn = rolePermissionDto.getCreatedOn();
    }

    public RolePermission(RolePermissionDto rolePermissionDto,Role role,Screen screen){
        super();
        this.permissionId = rolePermissionDto.getPermissionId();
        this.role = role;
        this.screen = screen;
        this.add = rolePermissionDto.isAdd();
        this.update = rolePermissionDto.isUpdate();
        this.delete = rolePermissionDto.isDelete();
        this.view = rolePermissionDto.isView();
        this.deleted = rolePermissionDto.isDeleted();
        this.createdBy = rolePermissionDto.getCreatedBy();
        this.createdOn = rolePermissionDto.getCreatedOn();
    }
}
