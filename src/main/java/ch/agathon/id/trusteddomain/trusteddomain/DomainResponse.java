package ch.agathon.id.trusteddomain.trusteddomain;

public class DomainResponse {

    private Domain domain;
    private boolean trusted;

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }
}
