package lk.NIBM.PizzaShopCreed.dao;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PIZZA_ORDERS")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    private Cart cart;

    @Column(name = "price")
    private Double price;


}
