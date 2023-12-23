package org.example.Entitiy;

import javax.persistence.*;

@Entity
@Table(name = "Ambulance")
public class Ambulance extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "ambulance_type")
    private Ambulance ambulanceType;
    @Column(name = "ambulance_code",unique = true)
    private String code;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;



}
