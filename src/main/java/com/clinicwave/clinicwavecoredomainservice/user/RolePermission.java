package com.clinicwave.clinicwavecoredomainservice.user;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 5/27/24
 */
@Entity
@Table(name = "RolePermission")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RolePermission implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(nullable = false)
  private Role role;

  @ManyToOne
  @JoinColumn(nullable = false)
  private Permission permission;
}
