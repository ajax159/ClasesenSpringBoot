package com.clasesylombok.modulo1.Models;

public enum OrderStatus {
    PENDING_PAYMENT, // int = 0
    PROCESSING, // int = 1
    SHIPPED, // int = 2
    DELIVERED; // int = 3

    public static OrderStatus fromInteger(int x) {
        switch (x) {
            case 0:
                return PENDING_PAYMENT;
            case 1:
                return PROCESSING;
            case 2:
                return SHIPPED;
            case 3:
                return DELIVERED;
            default:
                return null;
        }
    }
}
