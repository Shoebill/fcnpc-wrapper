package net.gtaun.shoebill.fcnpc.constant;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public enum MoveType {
    WALK(0),
    RUN(1),
    SPRINT(2),
    DRIVE(3);

    private int value;
    private MoveType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
