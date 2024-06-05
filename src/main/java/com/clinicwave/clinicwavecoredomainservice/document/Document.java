package com.clinicwave.clinicwavecoredomainservice.document;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 6/3/24
 */
@Entity
@Table(name = "Document")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Document extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String title;

  private String description;

  @Column(nullable = false)
  private String path;

  private String documentKey;

  @Transient
  private Long userId;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private DocumentStatus documentStatus;
}
