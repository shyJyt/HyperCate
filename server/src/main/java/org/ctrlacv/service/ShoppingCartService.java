package org.ctrlacv.service;

import java.util.List;

import org.ctrlacv.dto.ShoppingCartDTO;
import org.ctrlacv.entity.ShoppingCart;

public interface ShoppingCartService {

    /**
     * 添加购物车
     * 
     * @param shoppingCartDTO
     */
    void add(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * 
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车
     */
    void cleanShoppingCart();

    /**
     * 删除购物车中一个商品
     * 
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
