package com.neuedu.dao;

import com.neuedu.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    Cart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    List<Cart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Cart record);
    /**
     * 查询用户购物车信息
     * **/
    List<Cart>  selectCartByUserId(Integer userId);

    /**
     * 统计用户购物信息是否全选
     * return >0 说明未全选
     * 统计没有选中商品的数量
     * */
    int isCheckedAll(Integer  userId);
    /**
     * 根据productId userId 查询购物车信息
     */
    Cart  selectCartByUserIdAndProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);
    /**
     * 移除购物车某个产品
     */
    int deleteByUserAndProductIds(@Param("userId") Integer userId,@Param("productIdList")List<Integer> productIdList);

    /**
     * 操作购物车是否选中
     * @param userId
     * @param productId
     * @param check 1:选中 0：未选中
     * @return
     */
    int selectOrUnselectProduct(@Param("userId") Integer userId, @Param("productId") Integer productId,@Param("check") Integer check);
    /**
     * 统计用户购物车中的数量
     *
     * @param userId
     * @return
     */
     int get_cart_product_count(Integer userId);

    /**
     * 查询购物车中用户已选中的商品
     * @param userId
     * @return
     */
     List<Cart>findCartListByUserIdAndChecked(Integer userId);

    /**
     * 批量删除购物车商品
     */
    int batchDelete(List<Cart>list);

}