package com.clinicwave.clinicwavecoredomainservice.doctor;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import com.clinicwave.clinicwavecoredomainservice.enums.DoctorScheduleStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 6/5/24
 */
@Entity
@Table(name = "DoctorScheduleStatus")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DoctorScheduleStatus extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private DoctorScheduleStatusEnum status;
}