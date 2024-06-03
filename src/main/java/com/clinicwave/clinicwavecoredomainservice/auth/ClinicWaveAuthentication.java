package com.clinicwave.clinicwavecoredomainservice.auth;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 5/31/24
 */
@Entity
@Table(name = "ClinicWaveAuthentication")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClinicWaveAuthentication extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false)
  private String password;
}
