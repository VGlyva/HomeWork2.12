package pro.sky.coursetwostore.model;

import java.util.Objects;

public class Basket {
    private final int idProduct;

    public Basket(int idProduct)  {
        this.idProduct = idProduct;
    }


    public Integer getIdProduct() {
        return idProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(idProduct, basket.idProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct);
    }
}
