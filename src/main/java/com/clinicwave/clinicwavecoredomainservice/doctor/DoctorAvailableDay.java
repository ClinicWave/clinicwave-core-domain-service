package com.clinicwave.clinicwavecoredomainservice.doctor;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.DayOfWeek;

/**
 * @author aamir on 6/5/24
 */
@Entity
@Table(name = "DoctorAvailableDay")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DoctorAvailableDay extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private DayOfWeek dayOfWeek;
}