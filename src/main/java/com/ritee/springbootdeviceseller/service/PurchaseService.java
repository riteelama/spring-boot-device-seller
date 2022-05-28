package com.ritee.springbootdeviceseller.service;

import com.ritee.springbootdeviceseller.model.Purchase;
import com.ritee.springbootdeviceseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
