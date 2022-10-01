package com.ufrn.springproject.repositories;

import com.ufrn.springproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
