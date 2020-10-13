package ch.agathon.id.trusteddomain.trusteddomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Domain {

    @Id
    @GeneratedValue
    private Integer domainID;
    private String domain;

    public Integer getDomainID() {
        return domainID;
    }

    public void setDomainID(Integer domainID) {
        this.domainID = domainID;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
