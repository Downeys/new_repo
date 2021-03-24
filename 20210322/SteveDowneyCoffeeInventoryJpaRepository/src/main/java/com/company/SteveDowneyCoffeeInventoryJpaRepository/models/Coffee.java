package com.company.SteveDowneyCoffeeInventoryJpaRepository.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "coffee")
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer roasterId;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "roasterId", referencedColumnName = "roasterId", insertable = false, updatable = false)
//    private Roaster roaster;
    private String name;
    private int count;
    private double unitPrice;
    private String description;
    private String type;

    public Integer getRoasterId() {
        return roasterId;
    }

    public void setRoasterId(Integer roasterId) {
        this.roasterId = roasterId;
    }

//    public Roaster getRoaster() {
//        return roaster;
//    }
//
//    public void setRoaster(Roaster roaster) {
//        this.roaster = roaster;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return count == coffee.count && Double.compare(coffee.unitPrice, unitPrice) == 0 && Objects.equals(id, coffee.id) && Objects.equals(roasterId, coffee.roasterId) && Objects.equals(name, coffee.name) && Objects.equals(description, coffee.description) && Objects.equals(type, coffee.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roasterId, name, count, unitPrice, description, type);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "id=" + id +
                ", roasterId=" + roasterId +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", unitPrice=" + unitPrice +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
