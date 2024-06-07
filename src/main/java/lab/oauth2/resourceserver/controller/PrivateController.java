package lab.oauth2.resourceserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateController {

    @GetMapping("/api/secured")
    public ResponseEntity<String> authenticated(){
        return ResponseEntity.ok("Secured API success");
    }
}
