package Day9;

import java.util.UUID;

public class Task {
    private UUID id;
    private String description;

    public Task(String description) {
        this.id = UUID.randomUUID();
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}