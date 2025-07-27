package com.example.cardapio.service;

import com.example.cardapio.dto.FoodRequestDTO;
import com.example.cardapio.food.Food;
import com.example.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAll(){
        return foodRepository.findAll();
    }

    public void saveFood(FoodRequestDTO food){
        Food foodData = new Food();

        foodData.setTitle(food.title());
        foodData.setImage(food.image());
        foodData.setPrice(food.price());

        foodRepository.save(foodData);

    }

}
