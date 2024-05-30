package com.clinicwave.clinicwavecoredomainservice.user;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 5/27/24
 */
@Entity
@Table(name = "Permission")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Permission extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, unique = true)
  private String name;
}
