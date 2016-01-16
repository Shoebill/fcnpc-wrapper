package net.gtaun.shoebill.fcnpc.data;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class Keys {

    private int udAnalog, lrAnalog, keys;

    public Keys(int udAnalog, int lrAnalog, int keys) {
        this.udAnalog = udAnalog;
        this.lrAnalog = lrAnalog;
        this.keys = keys;
    }

    public int getUdAnalog() {
        return udAnalog;
    }

    public int getLrAnalog() {
        return lrAnalog;
    }

    public int getKeys() {
        return keys;
    }
}
