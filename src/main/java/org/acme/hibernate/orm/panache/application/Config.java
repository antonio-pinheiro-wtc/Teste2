package org.acme.hibernate.orm.panache.application;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class Config {
    @ConfigProperty(name = "fruit.name.uppercase.force")
    Boolean fruitNameUppercaseForce;

    public Boolean getFruitNameUppercaseForce() {
        return fruitNameUppercaseForce;
    }

}