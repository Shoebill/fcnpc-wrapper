package net.gtaun.shoebill.fcnpc.event;

import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.fcnpc.FCNPC;
import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class FCNPCDeathEvent extends FCNPCEvent {

    private Player killer;
    private WeaponModel weapon;

    public FCNPCDeathEvent(FCNPC npc, Player killer, WeaponModel weapon) {
        super(npc);
        this.killer = killer;
        this.weapon = weapon;
    }

    public Player getKiller() {
        return killer;
    }

    public WeaponModel getWeapon() {
        return weapon;
    }
}
