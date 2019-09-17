package lk.ijse.absd.springmvc.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    @Column(name = "order_total")
    private double orderTotal;


    @Column(name = "order_count")
    private int orderCount;

    @Column(name="order_date")
    private String orderDate;

    @Column(name = "delivery_address")
    private String address;


    @Column(name = "contact_number")
    private String contactNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="user_id")
     private User serchedItems;


    @OneToMany(mappedBy="orderDetail", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();

    public OrderDetail() {
    }

    public OrderDetail(String id, double orderTotal, int orderCount, String orderDate, String address, String contactNumber, User serchedItems, List<OrderItem> orderItems) {
        this.id = id;
        this.orderTotal = orderTotal;
        this.orderCount = orderCount;
        this.orderDate = orderDate;
        this.address = address;
        this.contactNumber = contactNumber;
        this.serchedItems = serchedItems;
        this.orderItems = orderItems;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public User getSerchedItems() {
        return serchedItems;
    }

    public void setSerchedItems(User serchedItems) {
        this.serchedItems = serchedItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", orderTotal=" + orderTotal +
                ", orderCount=" + orderCount +
                ", orderDate='" + orderDate + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", serchedItems=" + serchedItems +
                ", orderItems=" + orderItems +
                '}';
    }
}
