package com.github.alissonmartineli.citiesapi.cities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    // TODO: Implement POINT type
    @Column(name = "lat_lon")
    private String geolocation;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUf() {
        return this.uf;
    }

    public void setUf(Integer uf) {
        this.uf = uf;
    }

    public Integer getIbge() {
        return this.ibge;
    }

    public void setIbge(Integer ibge) {
        this.ibge = ibge;
    }

    public String getGeolocation() {
        return this.geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

}
