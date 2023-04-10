package org.example.core.solid.dip.correct;

public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }
}
