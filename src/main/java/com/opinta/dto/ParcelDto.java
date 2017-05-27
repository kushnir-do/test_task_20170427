package com.opinta.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Dmytro Kushnir on 13.05.17.
 */
@Getter
@Setter
public class ParcelDto {
    private long id;
    private float weight;
    private float length;
    private float width;
    private float height;
    private BigDecimal declaredPrice;
    private BigDecimal price;
    private List<ParcelItemDto> parcelItems;
}