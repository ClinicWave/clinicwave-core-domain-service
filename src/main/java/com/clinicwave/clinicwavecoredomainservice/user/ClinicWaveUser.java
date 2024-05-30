package com.clinicwave.clinicwavecoredomainservice.user;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import com.clinicwave.clinicwavecoredomainservice.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author aamir on 5/29/24
 */
@Entity
@Table(name = "ClinicWaveUser")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClinicWaveUser extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String firstName;

  @Column(nullable = false)
  private String lastName;

  @Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false)
  private LocalDate dateOfBirth;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Gender gender;

  private String bio;

  private Boolean status;

  @OneToOne
  private Role role;

  @OneToOne
  private Address address;

  @OneToOne
  private UserType userType;
}
