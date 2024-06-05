package com.clinicwave.clinicwavecoredomainservice.notification;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author aamir on 6/3/24
 */
@Entity
@Table(name = "Notification")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Notification extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String title;

  private String body;

  @Column(nullable = false)
  private LocalDateTime notificationTime;

  @Column(nullable = false)
  private LocalDateTime expiryTime;

  private LocalDateTime createdTime;

  private LocalDateTime lastModifiedTime;

  private Boolean isSpecificToUser;

  private Boolean isActive = true;

  @Transient
  private Long userId;

  @OneToOne
  private NotificationType notificationType;
}
