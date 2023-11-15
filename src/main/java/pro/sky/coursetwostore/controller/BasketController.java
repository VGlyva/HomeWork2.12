package pro.sky.coursetwostore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.coursetwostore.model.Basket;
import pro.sky.coursetwostore.service.BasketService;

import java.util.List;
@RestController
@RequestMapping("/order" )
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public Basket addOrder(@RequestParam int idProduct) {
        return basketService.addProduct(idProduct);
    }
    @GetMapping("/get")
    public List<Integer> getOrder() {
        return basketService.getProduct();
    }

}
