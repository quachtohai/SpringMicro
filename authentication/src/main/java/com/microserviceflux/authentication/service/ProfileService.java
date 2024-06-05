package com.microserviceflux.authentication.service;


import com.google.gson.Gson;
import com.microserviceflux.authentication.data.Profile;
import com.microserviceflux.authentication.model.ProfileDTO;
import com.microserviceflux.authentication.repository.ProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ProfileService {
    Gson gson = new Gson();
    @Autowired
    ProfileRepository profileRepository;

    public Flux<ProfileDTO> getAllProfile(){
        return  profileRepository.findAll()
                .map(ProfileDTO::entityToDto)
                .switchIfEmpty(Mono.error(new Exception("PF01"+"Empty profile list !")));
    }
}
