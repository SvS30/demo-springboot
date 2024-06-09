package com.progravita.demo.mapper;

import com.progravita.demo.dto.CouponDTO;
import com.progravita.demo.entity.Coupon;

public class CouponMapper {
    public static CouponDTO toDto(Coupon coupon) {
        return CouponDTO.builder()
            .id(coupon.getId())
            .code(coupon.getCode())
            .discount(coupon.getDiscount())
            .course(coupon.getCourse())
            .createdAt(coupon.getCreatedAt())
            .updatedAt(coupon.getUpdatedAt())
        .build();
    }

    public static Coupon toEntity(CouponDTO couponDTO) {
        return new Coupon(
            couponDTO.getId(),
            couponDTO.getCode(),
            couponDTO.getDiscount(),
            couponDTO.getCourse(),
            couponDTO.getCreatedAt(),
            couponDTO.getUpdatedAt()
        );
    }
}
