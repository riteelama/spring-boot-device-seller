package com.ritee.springbootdeviceseller.repository.projection;

import com.ritee.springbootdeviceseller.model.DeviceType;

import java.time.LocalDateTime;

public interface PurchaseItem
{
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
