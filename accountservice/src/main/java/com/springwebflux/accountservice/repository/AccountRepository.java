package com.springwebflux.accountservice.repository;

import com.springwebflux.accountservice.data.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AccountRepository extends ReactiveCrudRepository<Account,String> {
}
