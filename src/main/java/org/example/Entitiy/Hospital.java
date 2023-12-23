package org.example.Entitiy;

import javax.persistence.*;

@Entity
@Table(name = "Hospital")
public class Hospital extends BaseEntity {
    @Column(name = "code",unique = true)
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "ER")
    private String er;
    @Column(name = "address")
    private String address;
    @Column(name = "phone_number")
    private String phone;


}
