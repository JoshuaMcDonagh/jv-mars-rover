package entities;

import datatypes.EntityIDPrefix;

public abstract class Entity {
    private String entityID;

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(EntityIDPrefix prefix, int entityCount) {
        this.entityID = prefix.toString().concat(String.valueOf(entityCount)); // entityID = Prefix + entityCount. Example: RV1 (Rover one)
    }
}
