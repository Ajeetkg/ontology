package com.illumina.db.model;

import javax.persistence.*;


/**
 * Created by agupta2 on 11/2/15.
 */

@Entity
@Table(name = "ONTOLOGY")
public class Ontology {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ontologyId;

    private String description;
    private String versionId;

    protected Ontology() {
    }

    public Ontology(String description, String versionId) {
        this.description = description;
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        return String.format("Ontology[ontologyId=%d, description='$s', versionId='%s']", ontologyId, description, versionId);
    }
}