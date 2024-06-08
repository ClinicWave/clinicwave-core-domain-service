package com.clinicwave.clinicwavecoredomainservice.user;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aamir on 5/27/24
 */
@Entity
@Table(name = "Role")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Role extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, unique = true)
  private String roleName;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
  private Set<RolePermission> rolePermissionSet;
}
