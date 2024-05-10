package com.fazil.ms.productservice.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@JsonSerialize
public record ProductResponse(String id, String name, String description, BigDecimal price) {
}
