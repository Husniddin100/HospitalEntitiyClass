package org.example.Entitiy;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee extends BaseEntity{
    @Enumerated(EnumType.STRING)
    @Column(name = "employee_type")
    private String employeeType;
    @Column(name = "ssn",unique = true)
    private String ssn;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "address")
    private String address;
    @Column(name = "phone",unique = true,nullable = false)
    private String phone;
    @Column(name = "driving_license_number")
    private String license;


}
