package co.istad.chhaaya.fswd_sbapp.domain;

//public class Product {
//}

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double price;

    // Many products belong to one category
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // One product can appear in many orders
    @OneToMany(mappedBy = "product")
    private List<Order> orders;
}
