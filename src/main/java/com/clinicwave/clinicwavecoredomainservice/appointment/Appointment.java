package com.clinicwave.clinicwavecoredomainservice.appointment;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import com.clinicwave.clinicwavecoredomainservice.department.Department;
import com.clinicwave.clinicwavecoredomainservice.user.ClinicWaveUser;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author aamir on 6/8/24
 */
@Entity
@Table(name = "Appointment")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Appointment extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private LocalDate appointmentDate;

  @Column(nullable = false)
  private LocalTime appointmentTime;

  @Column(nullable = false)
  private String patientEmail;

  @Column(nullable = false)
  private Long patientPhoneNumber;

  private String message;

  @OneToOne
  private ClinicWaveUser patient;

  @OneToOne
  private ClinicWaveUser doctor;

  @OneToOne
  private Department department;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private AppointmentStatus appointmentStatus;
}
