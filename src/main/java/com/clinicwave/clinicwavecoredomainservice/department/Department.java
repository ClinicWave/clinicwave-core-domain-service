package com.clinicwave.clinicwavecoredomainservice.department;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 6/4/24
 */
@Entity
@Table(name = "Department")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String name;

  private String description;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private DepartmentStatus departmentStatus;
}
