package net.gtaun.shoebill.fcnpc.event;

import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.fcnpc.FCNPC;
import net.gtaun.shoebill.object.Player;
import net.gtaun.util.event.Interruptable;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class FCNPCTakeDamageEvent extends FCNPCEvent {

    private Player damager;
    private WeaponModel weapon;
    private int bodyPart;
    private float amount;

    private int retval = 1;

    public FCNPCTakeDamageEvent(FCNPC npc, Player damager, WeaponModel weapon, int bodyPart, float amount) {
        super(npc);
        this.damager = damager;
        this.weapon = weapon;
        this.bodyPart = bodyPart;
        this.amount = amount;
    }

    public Player getDamager() {
        return damager;
    }

    public WeaponModel getWeapon() {
        return weapon;
    }

    public int getBodyPart() {
        return bodyPart;
    }

    public float getAmount() {
        return amount;
    }

    public void disallow() {
        this.retval |= 0;
    }

    public int getReturnValue() {
        return retval;
    }
}
