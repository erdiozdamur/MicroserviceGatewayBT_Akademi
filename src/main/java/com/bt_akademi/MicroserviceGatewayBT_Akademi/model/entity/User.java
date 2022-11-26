package com.bt_akademi.MicroserviceGatewayBT_Akademi.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@SequenceGenerator(name = "USERS_SEQUENCE", sequenceName = "BT_AKADEMI_USERS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@Table(name = "USERS")
@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQUENCE")
    @Column(name = "USER_ID", nullable = false)
    @Id
    private Integer userID;

    @Column(length = 120, nullable = false)
    private String userName;

    @Column(length = 120, nullable = false)
    private String password;

    @Column(nullable = false)
    private Date created;

}
