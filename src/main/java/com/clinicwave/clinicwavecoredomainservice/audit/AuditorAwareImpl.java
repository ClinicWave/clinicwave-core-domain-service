package com.clinicwave.clinicwavecoredomainservice.audit;

import lombok.NonNull;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author aamir on 5/27/24
 */
@Component(value = "auditorAwareImpl")
public class AuditorAwareImpl implements AuditorAware<String> {
  /**
   * Returns the current auditor of the application.
   *
   * @return the current auditor
   *
   * TODO: Retrieve the current user from the security context
   */
  @Override
  @NonNull
  public Optional<String> getCurrentAuditor() {
      return Optional.of("user");
  }
}
