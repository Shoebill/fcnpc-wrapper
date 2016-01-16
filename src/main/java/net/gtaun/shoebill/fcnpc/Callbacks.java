package net.gtaun.shoebill.fcnpc;

import net.gtaun.shoebill.amx.AmxInstanceManager;
import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.fcnpc.event.*;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.Vehicle;
import net.gtaun.util.event.EventManager;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
class Callbacks {

    static void registerHandlers(AmxInstanceManager instanceManager) {
        Wrapper wrapper = Wrapper.getInstance();
        EventManager eventManager = wrapper.getEventManager();
        instanceManager.hookCallback("FCNPC_OnCreate", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            FCNPC npc = FCNPC.get(npcid);
            eventManager.dispatchEvent(new FCNPCCreateEvent(npc), npc);
        }, "i");

        instanceManager.hookCallback("FCNPC_OnSpawn", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            FCNPC npc = FCNPC.get(npcid);
            eventManager.dispatchEvent(new FCNPCSpawnEvent(npc), npc);
        }, "i");

        instanceManager.hookCallback("FCNPC_OnRespawn", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            FCNPC npc = FCNPC.get(npcid);
            eventManager.dispatchEvent(new FCNPCRespawnEvent(npc), npc);
        }, "i");

        instanceManager.hookCallback("FCNPC_OnDeath", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            int killerid = (int) amxCallEvent.getParameters()[1];
            int weaponid = (int) amxCallEvent.getParameters()[2];
            FCNPC npc = FCNPC.get(npcid);
            Player killer = Player.get(killerid);
            WeaponModel weapon = WeaponModel.get(weaponid);
            eventManager.dispatchEvent(new FCNPCDeathEvent(npc, killer, weapon), npc, killer, weapon);
        }, "iii");

        instanceManager.hookCallback("FCNPC_OnVehicleEntryComplete", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            int vehicleid = (int) amxCallEvent.getParameters()[1];
            int seat = (int) amxCallEvent.getParameters()[2];
            FCNPC npc = FCNPC.get(npcid);
            Vehicle vehicle = Vehicle.get(vehicleid);
            eventManager.dispatchEvent(new FCNPCVehicleEntryCompleteEvent(npc, vehicle, seat), npc, vehicle, seat);
        }, "iii");

        instanceManager.hookCallback("FCNPC_OnVehicleExitComplete", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            FCNPC npc = FCNPC.get(npcid);
            eventManager.dispatchEvent(new FCNPCVehicleExitCompleteEvent(npc), npc);
        }, "i");

        instanceManager.hookCallback("FCNPC_OnReachDestination", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            FCNPC npc = FCNPC.get(npcid);
            eventManager.dispatchEvent(new FCNPCReachDestinationEvent(npc), npc);
        }, "i");

        instanceManager.hookCallback("FCNPC_OnFinishPlayback", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            FCNPC npc = FCNPC.get(npcid);
            eventManager.dispatchEvent(new FCNPCFinishPlaybackEvent(npc), npc);
        }, "i");

        instanceManager.hookCallback("FCNPC_OnTakeDamage", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            int damagerid = (int) amxCallEvent.getParameters()[1];
            int weaponid = (int) amxCallEvent.getParameters()[2];
            int bodypart = (int) amxCallEvent.getParameters()[3];
            float health_loss = (float) amxCallEvent.getParameters()[4];
            FCNPC npc = FCNPC.get(npcid);
            Player damager = Player.get(damagerid);
            WeaponModel weaponModel = WeaponModel.get(weaponid);
            FCNPCTakeDamageEvent event = new FCNPCTakeDamageEvent(npc, damager, weaponModel, bodypart, health_loss);
            eventManager.dispatchEvent(event, npc, damager, weaponid, bodypart);
            amxCallEvent.setReturnValue(event.getReturnValue());
        }, "iiiif");

        instanceManager.hookCallback("FCNPC_OnFinishNodePoint", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            int point = (int) amxCallEvent.getParameters()[1];
            FCNPC npc = FCNPC.get(npcid);
            FCNPCFinishNodePointEvent event = new FCNPCFinishNodePointEvent(npc, point);
            eventManager.dispatchEvent(event, npc, point);
            amxCallEvent.setReturnValue(event.getReturnValue());
        }, "ii");

        instanceManager.hookCallback("FCNPC_OnChangeNode", amxCallEvent -> {
            int playerid = (int) amxCallEvent.getParameters()[0];
            int nodeid = (int) amxCallEvent.getParameters()[1];
            Player player = Player.get(playerid);
            eventManager.dispatchEvent(new FCNPCChangeNodeEvent(player, nodeid), player, nodeid);
        }, "ii");

        instanceManager.hookCallback("FCNPC_OnFinishNode", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            FCNPC npc = FCNPC.get(npcid);
            eventManager.dispatchEvent(new FCNPCFinishNodeEvent(npc), npc);
        }, "i");

    }

    static void unregisterHandlers(AmxInstanceManager instanceManager) {
        instanceManager.unhookCallback("FCNPC_OnCreate");
        instanceManager.unhookCallback("FCNPC_OnSpawn");
        instanceManager.unhookCallback("FCNPC_OnRespawn");
        instanceManager.unhookCallback("FCNPC_OnDeath");
        instanceManager.unhookCallback("FCNPC_OnVehicleEntryComplete");
        instanceManager.unhookCallback("FCNPC_OnVehicleExitComplete");
        instanceManager.unhookCallback("FCNPC_OnReachDestination");
        instanceManager.unhookCallback("FCNPC_OnFinishPlayback");
        instanceManager.unhookCallback("FCNPC_OnTakeDamage");
        instanceManager.unhookCallback("FCNPC_OnFinishNodePoint");
        instanceManager.unhookCallback("FCNPC_OnChangeNode");
        instanceManager.unhookCallback("FCNPC_OnFinishNode");
    }

}
