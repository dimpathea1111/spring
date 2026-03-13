package co.istad.chhaaya.fswd_sbapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor

public class OrderLineId {

    private UUID orderId;

    private String productCode;




}
