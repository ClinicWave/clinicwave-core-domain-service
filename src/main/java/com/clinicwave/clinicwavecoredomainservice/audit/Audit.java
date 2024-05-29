package com.clinicwave.clinicwavecoredomainservice.audit;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author aamir on 5/27/24
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public abstract class Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @CreatedDate
  @Column(updatable = false, nullable = false)
  private LocalDateTime createdAt;

  @CreatedBy
  @Column(updatable = false, nullable = false, length = 20)
  private String createdBy;

  @LastModifiedDate
  @Column(insertable = false)
  private LocalDateTime updatedAt;

  @LastModifiedBy
  @Column(insertable = false, length = 20)
  private String updatedBy;
}
