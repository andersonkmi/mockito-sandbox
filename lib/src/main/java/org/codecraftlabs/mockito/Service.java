package org.codecraftlabs.mockito;

public class Service {
    private Database database;

    public Service(Database database) {
        this.database = database;
    }

    public boolean query(String query) {
        return this.database.isAvailable();
    }

    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(this.database.getUniqueId());
    }
}
