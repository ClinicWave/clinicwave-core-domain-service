package com.clinicwave.clinicwavecoredomainservice.doctor;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 6/7/24
 */
@Entity
@Table(name = "DoctorAvailableDayTime")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DoctorAvailableDayTime extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  private DoctorSchedule doctorSchedule;

  @ManyToOne
  @JoinColumn(nullable = false)
  private DoctorAvailableDay doctorAvailableDay;

  @ManyToOne
  @JoinColumn(nullable = false)
  private DoctorAvailableTime doctorAvailableTime;
}
