package org.example.Entitiy;

import javax.persistence.*;

@Entity
@Table(name = "EMS")
public class EMS extends BaseEntity {
    @Column(name = "ems_code", unique = true)
    private String emsCode;
    @OneToMany
    @JoinColumn(name="ambulance_id")
    private Ambulance ambulance;
    @OneToMany
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @Column(name = "effective_date")
    private String effectiveDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "level_urgency")
    private EMStype levelUrgency;
    @Column(name = "patients_name")
    private String patientsName;
    @Column(name = "hospital_code")
    private String HospitalCode;


}
