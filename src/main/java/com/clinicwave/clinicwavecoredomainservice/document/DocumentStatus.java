package com.clinicwave.clinicwavecoredomainservice.document;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import com.clinicwave.clinicwavecoredomainservice.enums.DocumentStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 6/3/24
 */
@Entity
@Table(name = "DocumentStatus")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DocumentStatus extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private DocumentStatusEnum status;
}
