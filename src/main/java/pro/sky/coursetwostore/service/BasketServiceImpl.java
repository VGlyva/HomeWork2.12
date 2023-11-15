package pro.sky.coursetwostore.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.coursetwostore.model.Basket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService  {

    private final List<Integer> idProducts;

    public BasketServiceImpl(List<Integer> idProducts) {
        this.idProducts = idProducts;
    }

    public Basket addProduct(Integer id) {
        Basket basket = new Basket(id);
        idProducts.add(basket.getIdProduct());
        return basket;

    }

    public List<Integer> getProduct() {
        return idProducts;
    }

}
