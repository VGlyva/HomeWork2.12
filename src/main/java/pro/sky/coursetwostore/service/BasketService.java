package pro.sky.coursetwostore.service;

import pro.sky.coursetwostore.model.Basket;

import java.util.List;

public interface BasketService  {
    Basket addProduct(Integer id);
    List<Integer> getProduct();
}
