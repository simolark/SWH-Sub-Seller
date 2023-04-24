package com.example.subswh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.subswh.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author HeYi
 * @version 1.0
 * @date 2023/4/20 13:51
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

    @Select("SELECT * FROM orders WHERE order_id = #{orderId}")
    Orders selectById(String orderId);

}
