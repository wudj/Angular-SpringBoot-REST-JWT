package com.app.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.order.OrderInfo;


public interface OrderInfoRepo extends JpaRepository<OrderInfo, Long> {
    public List<OrderInfo> findAll();
    public Page<OrderInfo> findAll(Pageable p);

}

