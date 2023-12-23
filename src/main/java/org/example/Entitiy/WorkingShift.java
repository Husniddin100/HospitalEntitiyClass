package org.example.Entitiy;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "WorkingTime")
public class WorkingShift extends BaseEntity {
    @Column(name = "stardet_time", columnDefinition = "timestamp")
    private LocalDate startedTime;
    @Column(name = "duration_hour")
    private String durationHour;
    @Column(name = "working_day")
    private String workingDay;
    @OneToMany
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
