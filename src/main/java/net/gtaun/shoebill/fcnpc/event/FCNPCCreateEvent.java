package net.gtaun.shoebill.fcnpc.event;

import net.gtaun.shoebill.fcnpc.FCNPC;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class FCNPCCreateEvent extends FCNPCEvent {

    public FCNPCCreateEvent(FCNPC npc) {
        super(npc);
    }
}
