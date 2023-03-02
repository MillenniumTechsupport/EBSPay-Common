package com.ebspay.payments.auth.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ebspay_login_audit")
public class LoginAudit {

    @Id
    @Column(name = "login_audit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loginAuditId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "event_on")
    private Date eventDate;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "event_result")
    private String eventResult;

    @Column(name = "party_id")
    private int partyId;

}
