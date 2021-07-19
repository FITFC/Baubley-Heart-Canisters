package com.traverse.bhc.common.util;

public enum HeartType {
    RED(10),
    YELLOW(20),
    GREEN(30),
    BLUE(40);

    public final int healAmount;

    HeartType(int healAmount) {
        this.healAmount = healAmount;
    }
}
