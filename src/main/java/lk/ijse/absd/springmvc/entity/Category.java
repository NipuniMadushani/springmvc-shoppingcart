package lk.ijse.absd.springmvc.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @Column(name = "cat_name")
    private String catName;

    private Integer id;

    private String description;

    @Column(name = "is_active")
    private Boolean active = true;
    public Category() {
    }

    public Category(String catName, Integer id, String description, Boolean active) {
        this.catName = catName;
        this.id = id;
        this.description = description;
        this.active = active;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catName='" + catName + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}
