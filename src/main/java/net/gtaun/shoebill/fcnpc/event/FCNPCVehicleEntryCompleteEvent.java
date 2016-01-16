package net.gtaun.shoebill.fcnpc.event;

import net.gtaun.shoebill.fcnpc.FCNPC;
import net.gtaun.shoebill.object.Vehicle;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class FCNPCVehicleEntryCompleteEvent extends FCNPCEvent {

    private Vehicle vehicle;
    private int seat;

    public FCNPCVehicleEntryCompleteEvent(FCNPC npc, Vehicle vehicle, int seat) {
        super(npc);
        this.vehicle = vehicle;
        this.seat = seat;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSeat() {
        return seat;
    }
}
