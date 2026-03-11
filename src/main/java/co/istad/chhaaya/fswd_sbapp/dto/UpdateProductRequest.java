package co.istad.chhaaya.fswd_sbapp.dto;

import java.math.BigDecimal;

public record UpdateProductRequest(
//        String code,
        String name,
        BigDecimal price

) {
}
