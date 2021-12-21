package org.springframework.samples.petclinic.product;

import java.beans.Transient;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends NamedEntity{
    @Min(0)
    double price;
    @ManyToOne
    ProductType productType;
}
