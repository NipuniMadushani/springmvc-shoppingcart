package lk.ijse.absd.springmvc.entity;


import javax.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "grand_total")
    private Double grandTotal;
    @Column(name = "cart_lines")
    private Integer cartLines;
    @Column(name = "image_url")
    private String imageUrl;

   //one to one mapping
    @OneToOne
    private User user;

    public Cart() {
    }

    public Cart(Double grandTotal, Integer cartLines, String imageUrl, User user) {
        this.grandTotal = grandTotal;
        this.cartLines = cartLines;
        this.imageUrl = imageUrl;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", grandTotal=" + grandTotal +
                ", cartLines=" + cartLines +
                ", imageUrl='" + imageUrl + '\'' +
                ", user=" + user +
                '}';
    }
}
