package net.gtaun.shoebill.fcnpc.event;

import net.gtaun.shoebill.event.player.PlayerEvent;
import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class FCNPCChangeNodeEvent extends PlayerEvent {

    private int node;

    protected FCNPCChangeNodeEvent(Player player, int node) {
        super(player);
        this.node = node;
    }

    public int getNode() {
        return node;
    }
}
