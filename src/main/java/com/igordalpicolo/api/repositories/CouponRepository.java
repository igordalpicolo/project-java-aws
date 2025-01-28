package com.igordalpicolo.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igordalpicolo.api.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID>{

}
