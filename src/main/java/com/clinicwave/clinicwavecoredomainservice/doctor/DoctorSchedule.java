package com.clinicwave.clinicwavecoredomainservice.doctor;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import com.clinicwave.clinicwavecoredomainservice.user.ClinicWaveUser;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aamir on 6/5/24
 */
@Entity
@Table(name = "DoctorSchedule")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DoctorSchedule extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String message;

  @OneToOne
  private ClinicWaveUser doctor;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctorSchedule")
  private Set<DoctorAvailableDayTime> doctorAvailableDayTimeSet;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private DoctorScheduleStatus doctorScheduleStatus;
}