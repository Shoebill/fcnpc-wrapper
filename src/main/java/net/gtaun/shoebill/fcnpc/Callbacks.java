package net.gtaun.shoebill.fcnpc;

import net.gtaun.shoebill.amx.AmxInstanceManager;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
class Callbacks {

    static void registerHandlers(AmxInstanceManager instanceManager) {
        instanceManager.hookCallback("FCNPC_OnCreate", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            //TODO: Add your event logic for FCNPC_OnCreate here
        }, "i");

        instanceManager.hookCallback("FCNPC_OnSpawn", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            //TODO: Add your event logic for FCNPC_OnSpawn here
        }, "i");

        instanceManager.hookCallback("FCNPC_OnRespawn", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            //TODO: Add your event logic for FCNPC_OnRespawn here
        }, "i");

        instanceManager.hookCallback("FCNPC_OnDeath", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            int killerid = (int) amxCallEvent.getParameters()[1];
            int weaponid = (int) amxCallEvent.getParameters()[2];
            //TODO: Add your event logic for FCNPC_OnDeath here
        }, "iii");

        instanceManager.hookCallback("FCNPC_OnVehicleEntryComplete", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            int vehicleid = (int) amxCallEvent.getParameters()[1];
            int seat = (int) amxCallEvent.getParameters()[2];
            //TODO: Add your event logic for FCNPC_OnVehicleEntryComplete here
        }, "iii");

        instanceManager.hookCallback("FCNPC_OnVehicleExitComplete", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            //TODO: Add your event logic for FCNPC_OnVehicleExitComplete here
        }, "i");

        instanceManager.hookCallback("FCNPC_OnReachDestination", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            //TODO: Add your event logic for FCNPC_OnReachDestination here
        }, "i");

        instanceManager.hookCallback("FCNPC_OnFinishPlayback", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            //TODO: Add your event logic for FCNPC_OnFinishPlayback here
        }, "i");

        instanceManager.hookCallback("FCNPC_OnTakeDamage", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            int damagerid = (int) amxCallEvent.getParameters()[1];
            int weaponid = (int) amxCallEvent.getParameters()[2];
            int bodypart = (int) amxCallEvent.getParameters()[3];
            float health_loss = (float) amxCallEvent.getParameters()[4];
            //TODO: Add your event logic for FCNPC_OnTakeDamage here
        }, "iiiif");

        instanceManager.hookCallback("FCNPC_OnFinishNodePoint", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            int point = (int) amxCallEvent.getParameters()[1];
            //TODO: Add your event logic for FCNPC_OnFinishNodePoint here
        }, "ii");

        instanceManager.hookCallback("FCNPC_OnChangeNode", amxCallEvent -> {
            int playerid = (int) amxCallEvent.getParameters()[0];
            int nodeid = (int) amxCallEvent.getParameters()[1];
            //TODO: Add your event logic for FCNPC_OnChangeNode here
        }, "ii");

        instanceManager.hookCallback("FCNPC_OnFinishNode", amxCallEvent -> {
            int npcid = (int) amxCallEvent.getParameters()[0];
            //TODO: Add your event logic for FCNPC_OnFinishNode here
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
