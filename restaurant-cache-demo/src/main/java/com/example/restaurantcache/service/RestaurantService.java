package com.example.restaurantcache.service;

import com.example.restaurantcache.entity.MenuItem;
import com.example.restaurantcache.repository.MenuItemRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private final MenuItemRepository menuItemRepository;

    public RestaurantService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }


    @Cacheable(value = "restaurantMenu", key = "#id")
    public List<MenuItem> getMenuByRestaurantId(Long id) {

        // Log để biết method có thực sự được gọi hay không
        System.out.println(">>> ĐANG TRUY VẤN DATABASE - restaurantId = " + id);

        // Mô phỏng query DB chậm mất 3 giây
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return menuItemRepository.findByRestaurantId(id);
    }
}
