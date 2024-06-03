package com.clinicwave.clinicwavecoredomainservice.auth;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author aamir on 5/27/24
 */
@Entity
@Table(name = "TokenAudit")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
  public class TokenAudit extends Audit implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    // IDP or Database
    @Column(nullable = false)
    private String authenticationStore;

    @Column(nullable = false)
    private LocalDateTime tokenRefreshTime;

    @Column(nullable = false)
    private String oldAccessToken;

    @Column(nullable = false)
    private String newAccessToken;
  }
