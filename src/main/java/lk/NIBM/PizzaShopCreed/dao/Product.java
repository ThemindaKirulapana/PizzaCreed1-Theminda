package lk.NIBM.PizzaShopCreed.dao;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "PRODUCT")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<CartItem> cartItems;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Size")
    private String Size;

    @Column(name = "Price")
    private Double Price;

}
