package com.clinicwave.clinicwavecoredomainservice.user;

import com.clinicwave.clinicwavecoredomainservice.audit.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author aamir on 5/30/24
 */
@Entity
@Table(name = "Address")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address extends Audit implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String addressLine;

  private String country;

  private String city;

  private String state;

  private String zipCode;
}
