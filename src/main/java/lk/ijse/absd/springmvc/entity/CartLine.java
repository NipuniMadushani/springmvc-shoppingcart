package lk.ijse.absd.springmvc.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cart_line")
public class CartLine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="cart_id")
    private Cart cart;

    @Column(name = "grand_total")
    private Double grandTotal;
    @Column(name = "cart_lines")
    private Integer cartLines;

    public CartLine() {
    }

    public CartLine(Cart cart, Double grandTotal, Integer cartLines) {
        this.cart = cart;
        this.grandTotal = grandTotal;
        this.cartLines = cartLines;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Integer getCartLines() {
        return cartLines;
    }

    public void setCartLines(Integer cartLines) {
        this.cartLines = cartLines;
    }

    @Override
    public String toString() {
        return "CartLine{" +
                "id=" + id +
                ", cart=" + cart +
                ", grandTotal=" + grandTotal +
                ", cartLines=" + cartLines +
                '}';
    }
}
