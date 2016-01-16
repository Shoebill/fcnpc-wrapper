package net.gtaun.shoebill.fcnpc.event;

import net.gtaun.shoebill.fcnpc.FCNPC;
import net.gtaun.util.event.Event;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public abstract class FCNPCEvent extends Event {
    private FCNPC npc;

    public FCNPCEvent(FCNPC npc) {
        this.npc = npc;
    }

    public FCNPC getNpc() {
        return npc;
    }
}
