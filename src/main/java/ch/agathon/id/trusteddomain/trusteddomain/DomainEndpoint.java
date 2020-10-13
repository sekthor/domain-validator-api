package ch.agathon.id.trusteddomain.trusteddomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DomainEndpoint {

    @Autowired
    DomainRepository domainRepository;

    @PostMapping("add")
    public ResponseEntity addDomain(@RequestBody Domain domain) {
        try {
            domainRepository.save(domain);
            return ResponseEntity.accepted().build();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("trusted/{domainname}")
    public DomainResponse checkDomain(@PathVariable String domainname) {
        try {
            Domain d = domainRepository.findByDomain(domainname).get(0);
            DomainResponse dr = new DomainResponse();
            dr.setDomain(d);
            dr.setTrusted(true);
            return dr;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
