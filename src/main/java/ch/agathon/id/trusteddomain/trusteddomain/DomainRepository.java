package ch.agathon.id.trusteddomain.trusteddomain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomainRepository extends JpaRepository<Domain, Integer> {

    public List<Domain> findByDomain(String Domain);
}
