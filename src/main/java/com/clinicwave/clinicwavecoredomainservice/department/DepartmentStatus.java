package com.clinicwave.clinicwavecoredomainservice.department;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import com.clinicwave.clinicwavecoredomainservice.enums.DepartmentStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 6/4/24
 */
@Entity
@Table(name = "DepartmentStatus")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentStatus extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private DepartmentStatusEnum status;
}
