package org.example.unicodejpaopgave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    private int unicode;
    private char bogstav;
    private String description;
    private String name;

    public int getUnicode() {
        return unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}
