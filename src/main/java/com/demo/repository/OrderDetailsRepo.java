package com.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.OrderDetailsEntity;

public interface OrderDetailsRepo  extends JpaRepository<OrderDetailsEntity, Serializable>{

}
