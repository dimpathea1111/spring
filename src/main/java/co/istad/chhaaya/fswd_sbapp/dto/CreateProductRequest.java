package co.istad.chhaaya.fswd_sbapp.dto;

import java.math.BigDecimal;

public record CreateProductRequest(
        String name,
        BigDecimal price,
        Integer qty,
        String category,
        Integer categoryId
)
{
}
