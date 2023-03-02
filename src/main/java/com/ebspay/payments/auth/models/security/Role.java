package com.ebspay.payments.auth.models.security;


import com.ebspay.payments.auth.models.Party;
import com.ebspay.payments.auth.dto.security.RoleDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ebspay_roles")
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    @ManyToOne
    @JoinColumn(name = "party_id", referencedColumnName = "party_id")
    private Party party;
    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_code")
    private String roleCode;

    @Column(name = "role_desc")
    private String roleDesc;

    @Column(name = "default_screen")
    private String defaultScreen;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "created_on")
    private Date createdOn;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<RolePermission> rolePermissions;

    public Role(RoleDto roleDto){
        super();
        this.roleId = roleDto.getRoleId();
        this.roleName = roleDto.getRoleName();
        this.roleCode = roleDto.getRoleCode();
        this.roleDesc = roleDto.getRoleDesc();
        this.defaultScreen = roleDto.getDefaultScreen();
        this.createdBy = roleDto.getCreatedBy();
        this.createdOn = roleDto.getCreatedOn();
    }

    public Role(RoleDto roleDto, Party party){
        super();
        this.roleId = roleDto.getRoleId();
        this.party = party;
        this.roleName = roleDto.getRoleName();
        this.roleCode = roleDto.getRoleCode();
        this.roleDesc = roleDto.getRoleDesc();
        this.defaultScreen = roleDto.getDefaultScreen();
        this.createdBy = roleDto.getCreatedBy();
        this.createdOn = roleDto.getCreatedOn();
    }

}
