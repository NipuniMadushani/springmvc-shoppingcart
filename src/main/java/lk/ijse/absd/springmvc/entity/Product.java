package lk.ijse.absd.springmvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private String  brand;
    private String description;

    @Column(name = "unit_price")
    private Double unitPrice;

    private Integer quantity;
    @Column(name = "is_active")

    private  Boolean active=true;

    @Column(name = "category_name")
    private String  categoryName;

    @Column(name = "supplier_id")
    private  Long supplierId;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image_brand")
    private String imageBrand;

    public Product() {
        this.code= "PRD"+UUID.randomUUID().toString().substring(26).toUpperCase();
    }

    public Product(String code, String name, String brand, String description, Double unitPrice, Integer quantity, Boolean active, String categoryName, Long supplierId, String imageUrl, String imageBrand) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.active = active;
        this.categoryName = categoryName;
        this.supplierId = supplierId;
        this.imageUrl = imageUrl;
        this.imageBrand = imageBrand;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageBrand() {
        return imageBrand;
    }

    public void setImageBrand(String imageBrand) {
        this.imageBrand = imageBrand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", active=" + active +
                ", categoryName='" + categoryName + '\'' +
                ", supplierId=" + supplierId +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageBrand='" + imageBrand + '\'' +
                '}';
    }
}

