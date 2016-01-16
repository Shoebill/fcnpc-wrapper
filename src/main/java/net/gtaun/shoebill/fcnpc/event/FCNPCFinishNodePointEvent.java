package net.gtaun.shoebill.fcnpc.event;

import net.gtaun.shoebill.fcnpc.FCNPC;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class FCNPCFinishNodePointEvent extends FCNPCEvent {

    private int point;

    private int retval;

    public FCNPCFinishNodePointEvent(FCNPC npc, int point) {
        super(npc);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void disallow() {
        this.retval |= 0;
    }

    public int getReturnValue() {
        return retval;
    }
}
