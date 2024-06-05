package com.microserviceflux.authentication.repository;

import com.microserviceflux.authentication.data.Profile;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProfileRepository extends ReactiveCrudRepository<Profile,Long> {
}
