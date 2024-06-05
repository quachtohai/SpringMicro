package com.microserviceflux.authentication;


import com.google.gson.Gson;
import com.microserviceflux.authentication.model.ProfileDTO;
import com.microserviceflux.authentication.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/profiles")
public class controller {
    @Autowired
    ProfileService profileService;
    Gson gson = new Gson();
    @GetMapping
    public ResponseEntity<Flux<ProfileDTO>> getAllProfile(){
        return ResponseEntity.ok(profileService.getAllProfile());
    }
}
