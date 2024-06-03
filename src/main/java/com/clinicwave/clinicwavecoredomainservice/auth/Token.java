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
@Table(name = "Token")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Token extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, unique = true)
  private String accessToken;

  @Column(nullable = false)
  private String idToken;

  @Column(nullable = false)
  private String refreshToken;

  @Column(nullable = false)
  private String tokenType;

  @Column(nullable = false)
  private String expiryToken;

  @OneToOne
  private TokenAudit tokenAudit;
}
