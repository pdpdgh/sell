package com.wanwujinhua.sell.repository;

import com.wanwujinhua.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @desc ：订单详情repo
 * @auth ：pdp
 * @date ：Created in 2019/3/15 15:43
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
