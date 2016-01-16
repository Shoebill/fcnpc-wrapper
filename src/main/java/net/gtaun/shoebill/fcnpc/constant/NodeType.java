package net.gtaun.shoebill.fcnpc.constant;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public enum NodeType {
    NONE(-1),
    PED(0),
    VEHICLE(1),
    BOAT(2);

    private int value;
    private NodeType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static NodeType getType(int type) {
        for(NodeType nodeType : values()) {
            if (nodeType.getValue() == type)
                return nodeType;
        }
        return NodeType.NONE;
    }
}
