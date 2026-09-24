package com.example.restaurantcache.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu_items")
public class MenuItem {

    @Id
    private Long id;

    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column(name = "dish_name")
    private String dishName;

    @Column(name = "price")
    private Double price;

    // =====================
    // Constructors
    // =====================

    public MenuItem() {
    }

    public MenuItem(Long id, Long restaurantId, String dishName, Double price) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.dishName = dishName;
        this.price = price;
    }

    // =====================
    // Getters & Setters
    // =====================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", restaurantId=" + restaurantId +
                ", dishName='" + dishName + '\'' +
                ", price=" + price +
                '}';
    }
}
