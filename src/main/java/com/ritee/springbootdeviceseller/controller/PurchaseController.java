package com.ritee.springbootdeviceseller.controller;

import com.ritee.springbootdeviceseller.model.Purchase;
import com.ritee.springbootdeviceseller.security.UserPrincipal;
import com.ritee.springbootdeviceseller.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")//pre-patch
public class PurchaseController
{
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping//api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping //api/purchas
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseService.findPurchaseItemOfUser(userPrincipal.getId()));
    }
}
