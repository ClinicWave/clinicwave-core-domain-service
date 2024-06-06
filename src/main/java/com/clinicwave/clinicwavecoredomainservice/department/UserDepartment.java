package com.clinicwave.clinicwavecoredomainservice.department;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import com.clinicwave.clinicwavecoredomainservice.user.ClinicWaveUser;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 6/5/24
 */
@Entity
@Table(name = "UserDepartment")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDepartment extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @OneToOne
  private ClinicWaveUser clinicWaveUser;

  @OneToOne
  private Department department;
}
