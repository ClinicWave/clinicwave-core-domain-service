package com.clinicwave.clinicwavecoredomainservice.appointment;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import com.clinicwave.clinicwavecoredomainservice.enums.AppointmentStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 6/8/24
 */
@Entity
@Table(name = "AppointmentStatus")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentStatus extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private AppointmentStatusEnum status;
}
