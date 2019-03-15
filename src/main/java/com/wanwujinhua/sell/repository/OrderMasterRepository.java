package com.wanwujinhua.sell.repository;

import com.wanwujinhua.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @desc ：订单repo
 * @auth ：pdp
 * @date ：Created in 2019/3/15 15:40
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
