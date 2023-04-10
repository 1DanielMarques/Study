package org.example.core.solid.dip.incorrect;

public class Service {

    private MySQLRepository repository;

    public Service(MySQLRepository repository) {
        this.repository = repository;
    }
}
