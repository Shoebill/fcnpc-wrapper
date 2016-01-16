package net.gtaun.shoebill.fcnpc;

import net.gtaun.shoebill.amx.AmxCallable;
import net.gtaun.shoebill.amx.AmxInstance;
import net.gtaun.shoebill.amx.types.ReferenceFloat;
import net.gtaun.shoebill.amx.types.ReferenceInt;
import net.gtaun.shoebill.amx.types.ReturnType;

import java.util.HashMap;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
class Functions {

    private static HashMap<String, AmxCallable> functions = new HashMap<>();

    static void registerFunctions(AmxInstance instance) {
        functions.put("FCNPC_SetUpdateRate", instance.getNative("FCNPC_SetUpdateRate", ReturnType.INTEGER));
        functions.put("FCNPC_InitZMap", instance.getNative("FCNPC_InitZMap", ReturnType.INTEGER));
        functions.put("FCNPC_Create", instance.getNative("FCNPC_Create", ReturnType.INTEGER));
        functions.put("FCNPC_Destroy", instance.getNative("FCNPC_Destroy", ReturnType.INTEGER));
        functions.put("FCNPC_Spawn", instance.getNative("FCNPC_Spawn", ReturnType.INTEGER));
        functions.put("FCNPC_Respawn", instance.getNative("FCNPC_Respawn", ReturnType.INTEGER));
        functions.put("FCNPC_IsSpawned", instance.getNative("FCNPC_IsSpawned", ReturnType.INTEGER));
        functions.put("FCNPC_Kill", instance.getNative("FCNPC_Kill", ReturnType.INTEGER));
        functions.put("FCNPC_IsDead", instance.getNative("FCNPC_IsDead", ReturnType.INTEGER));
        functions.put("FCNPC_SetPosition", instance.getNative("FCNPC_SetPosition", ReturnType.INTEGER));
        functions.put("FCNPC_GetPosition", instance.getNative("FCNPC_GetPosition", ReturnType.INTEGER));
        functions.put("FCNPC_SetAngle", instance.getNative("FCNPC_SetAngle", ReturnType.INTEGER));
        functions.put("FCNPC_GetAngle", instance.getNative("FCNPC_GetAngle", ReturnType.FLOAT));
        functions.put("FCNPC_SetQuaternion", instance.getNative("FCNPC_SetQuaternion", ReturnType.INTEGER));
        functions.put("FCNPC_GetQuaternion", instance.getNative("FCNPC_GetQuaternion", ReturnType.INTEGER));
        functions.put("FCNPC_SetVelocity", instance.getNative("FCNPC_SetVelocity", ReturnType.INTEGER));
        functions.put("FCNPC_GetVelocity", instance.getNative("FCNPC_GetVelocity", ReturnType.INTEGER));
        functions.put("FCNPC_SetInterior", instance.getNative("FCNPC_SetInterior", ReturnType.INTEGER));
        functions.put("FCNPC_GetInterior", instance.getNative("FCNPC_GetInterior", ReturnType.INTEGER));
        functions.put("FCNPC_SetHealth", instance.getNative("FCNPC_SetHealth", ReturnType.INTEGER));
        functions.put("FCNPC_GetHealth", instance.getNative("FCNPC_GetHealth", ReturnType.FLOAT));
        functions.put("FCNPC_SetArmour", instance.getNative("FCNPC_SetArmour", ReturnType.INTEGER));
        functions.put("FCNPC_GetArmour", instance.getNative("FCNPC_GetArmour", ReturnType.FLOAT));
        functions.put("FCNPC_SetSkin", instance.getNative("FCNPC_SetSkin", ReturnType.INTEGER));
        functions.put("FCNPC_GetSkin", instance.getNative("FCNPC_GetSkin", ReturnType.INTEGER));
        functions.put("FCNPC_SetWeapon", instance.getNative("FCNPC_SetWeapon", ReturnType.INTEGER));
        functions.put("FCNPC_GetWeapon", instance.getNative("FCNPC_GetWeapon", ReturnType.INTEGER));
        functions.put("FCNPC_SetAmmo", instance.getNative("FCNPC_SetAmmo", ReturnType.INTEGER));
        functions.put("FCNPC_GetAmmo", instance.getNative("FCNPC_GetAmmo", ReturnType.INTEGER));
        functions.put("FCNPC_SetKeys", instance.getNative("FCNPC_SetKeys", ReturnType.INTEGER));
        functions.put("FCNPC_GetKeys", instance.getNative("FCNPC_GetKeys", ReturnType.INTEGER));
        functions.put("FCNPC_SetSpecialAction", instance.getNative("FCNPC_SetSpecialAction", ReturnType.INTEGER));
        functions.put("FCNPC_GetSpecialAction", instance.getNative("FCNPC_GetSpecialAction", ReturnType.INTEGER));
        functions.put("FCNPC_ToggleReloading", instance.getNative("FCNPC_ToggleReloading", ReturnType.INTEGER));
        functions.put("FCNPC_ToggleInfiniteAmmo", instance.getNative("FCNPC_ToggleInfiniteAmmo", ReturnType.INTEGER));
        functions.put("FCNPC_GoTo", instance.getNative("FCNPC_GoTo", ReturnType.INTEGER));
        functions.put("FCNPC_Stop", instance.getNative("FCNPC_Stop", ReturnType.INTEGER));
        functions.put("FCNPC_IsMoving", instance.getNative("FCNPC_IsMoving", ReturnType.INTEGER));
        functions.put("FCNPC_AimAt", instance.getNative("FCNPC_AimAt", ReturnType.INTEGER));
        functions.put("FCNPC_StopAim", instance.getNative("FCNPC_StopAim", ReturnType.INTEGER));
        functions.put("FCNPC_MeleeAttack", instance.getNative("FCNPC_MeleeAttack", ReturnType.INTEGER));
        functions.put("FCNPC_StopAttack", instance.getNative("FCNPC_StopAttack", ReturnType.INTEGER));
        functions.put("FCNPC_IsAiming", instance.getNative("FCNPC_IsAiming", ReturnType.INTEGER));
        functions.put("FCNPC_IsShooting", instance.getNative("FCNPC_IsShooting", ReturnType.INTEGER));
        functions.put("FCNPC_IsReloading", instance.getNative("FCNPC_IsReloading", ReturnType.INTEGER));
        functions.put("FCNPC_EnterVehicle", instance.getNative("FCNPC_EnterVehicle", ReturnType.INTEGER));
        functions.put("FCNPC_ExitVehicle", instance.getNative("FCNPC_ExitVehicle", ReturnType.INTEGER));
        functions.put("FCNPC_PutInVehicle", instance.getNative("FCNPC_PutInVehicle", ReturnType.INTEGER));
        functions.put("FCNPC_RemoveFromVehicle", instance.getNative("FCNPC_RemoveFromVehicle", ReturnType.INTEGER));
        functions.put("FCNPC_GetVehicleID", instance.getNative("FCNPC_GetVehicleID", ReturnType.INTEGER));
        functions.put("FCNPC_GetVehicleSeat", instance.getNative("FCNPC_GetVehicleSeat", ReturnType.INTEGER));
        functions.put("FCNPC_StartPlayingPlayback", instance.getNative("FCNPC_StartPlayingPlayback", ReturnType.INTEGER));
        functions.put("FCNPC_StopPlayingPlayback", instance.getNative("FCNPC_StopPlayingPlayback", ReturnType.INTEGER));
        functions.put("FCNPC_PausePlayingPlayback", instance.getNative("FCNPC_PausePlayingPlayback", ReturnType.INTEGER));
        functions.put("FCNPC_ResumePlayingPlayback", instance.getNative("FCNPC_ResumePlayingPlayback", ReturnType.INTEGER));
        functions.put("FCNPC_OpenNode", instance.getNative("FCNPC_OpenNode", ReturnType.INTEGER));
        functions.put("FCNPC_CloseNode", instance.getNative("FCNPC_CloseNode", ReturnType.INTEGER));
        functions.put("FCNPC_IsNodeOpen", instance.getNative("FCNPC_IsNodeOpen", ReturnType.INTEGER));
        functions.put("FCNPC_GetNodeType", instance.getNative("FCNPC_GetNodeType", ReturnType.INTEGER));
        functions.put("FCNPC_SetNodePoint", instance.getNative("FCNPC_SetNodePoint", ReturnType.INTEGER));
        functions.put("FCNPC_GetNodePointPosition", instance.getNative("FCNPC_GetNodePointPosition", ReturnType.INTEGER));
        functions.put("FCNPC_GetNodePointCount", instance.getNative("FCNPC_GetNodePointCount", ReturnType.INTEGER));
        functions.put("FCNPC_GetNodeInfo", instance.getNative("FCNPC_GetNodeInfo", ReturnType.INTEGER));
        functions.put("FCNPC_PlayNode", instance.getNative("FCNPC_PlayNode", ReturnType.INTEGER));
        functions.put("FCNPC_StopPlayingNode", instance.getNative("FCNPC_StopPlayingNode", ReturnType.INTEGER));
        functions.put("FCNPC_GetZGround", instance.getNative("FCNPC_GetZGround", ReturnType.INTEGER));
    }

    static int FCNPC_SetUpdateRate(int rate) {
        return (int) functions.get("FCNPC_SetUpdateRate").call(rate);
    }

    static int FCNPC_InitZMap(String file) {
        return (int) functions.get("FCNPC_InitZMap").call(file);
    }

    static int FCNPC_Create(String name) {
        return (int) functions.get("FCNPC_Create").call(name);
    }

    static int FCNPC_Destroy(int npcid) {
        return (int) functions.get("FCNPC_Destroy").call(npcid);
    }

    static int FCNPC_Spawn(int npcid, int skinid, float X, float Y, float Z) {
        return (int) functions.get("FCNPC_Spawn").call(npcid, skinid, X, Y, Z);
    }

    static int FCNPC_Respawn(int npcid) {
        return (int) functions.get("FCNPC_Respawn").call(npcid);
    }

    static int FCNPC_IsSpawned(int npcid) {
        return (int) functions.get("FCNPC_IsSpawned").call(npcid);
    }

    static int FCNPC_Kill(int npcid) {
        return (int) functions.get("FCNPC_Kill").call(npcid);
    }

    static int FCNPC_IsDead(int npcid) {
        return (int) functions.get("FCNPC_IsDead").call(npcid);
    }

    static int FCNPC_SetPosition(int npcid, float X, float Y, float Z) {
        return (int) functions.get("FCNPC_SetPosition").call(npcid, X, Y, Z);
    }

    static int FCNPC_GetPosition(int npcid, ReferenceFloat X, ReferenceFloat Y, ReferenceFloat Z) {
        return (int) functions.get("FCNPC_GetPosition").call(npcid, X, Y, Z);
    }

    static int FCNPC_SetAngle(int npcid, float Angle) {
        return (int) functions.get("FCNPC_SetAngle").call(npcid, Angle);
    }

    static float FCNPC_GetAngle(int npcid) {
        return (float) functions.get("FCNPC_GetAngle").call(npcid);
    }

    static int FCNPC_SetQuaternion(int npcid, float X, float Y, float Z, float A) {
        return (int) functions.get("FCNPC_SetQuaternion").call(npcid, X, Y, Z, A);
    }

    static int FCNPC_GetQuaternion(int npcid, ReferenceFloat X, ReferenceFloat Y, ReferenceFloat Z, ReferenceFloat A) {
        return (int) functions.get("FCNPC_GetQuaternion").call(npcid, X, Y, Z, A);
    }

    static int FCNPC_SetVelocity(int npcid, float X, float Y, float Z) {
        return (int) functions.get("FCNPC_SetVelocity").call(npcid, X, Y, Z);
    }

    static int FCNPC_GetVelocity(int npcid, ReferenceFloat X, ReferenceFloat Y, ReferenceFloat Z) {
        return (int) functions.get("FCNPC_GetVelocity").call(npcid, X, Y, Z);
    }

    static int FCNPC_SetInterior(int npcid, int interiorid) {
        return (int) functions.get("FCNPC_SetInterior").call(npcid, interiorid);
    }

    static int FCNPC_GetInterior(int npcid) {
        return (int) functions.get("FCNPC_GetInterior").call(npcid);
    }

    static int FCNPC_SetHealth(int npcid, float health) {
        return (int) functions.get("FCNPC_SetHealth").call(npcid, health);
    }

    static float FCNPC_GetHealth(int npcid) {
        return (float) functions.get("FCNPC_GetHealth").call(npcid);
    }

    static int FCNPC_SetArmour(int npcid, float armour) {
        return (int) functions.get("FCNPC_SetArmour").call(npcid, armour);
    }

    static float FCNPC_GetArmour(int npcid) {
        return (float) functions.get("FCNPC_GetArmour").call(npcid);
    }

    static int FCNPC_SetSkin(int npcid, int skinid) {
        return (int) functions.get("FCNPC_SetSkin").call(npcid, skinid);
    }

    static int FCNPC_GetSkin(int npcid) {
        return (int) functions.get("FCNPC_GetSkin").call(npcid);
    }

    static int FCNPC_SetWeapon(int npcid, int weaponid) {
        return (int) functions.get("FCNPC_SetWeapon").call(npcid, weaponid);
    }

    static int FCNPC_GetWeapon(int npcid) {
        return (int) functions.get("FCNPC_GetWeapon").call(npcid);
    }

    static int FCNPC_SetAmmo(int npcid, int ammo) {
        return (int) functions.get("FCNPC_SetAmmo").call(npcid, ammo);
    }

    static int FCNPC_GetAmmo(int npcid) {
        return (int) functions.get("FCNPC_GetAmmo").call(npcid);
    }

    static int FCNPC_SetKeys(int npcid, int Keys) {
        return (int) functions.get("FCNPC_SetKeys").call(npcid, Keys);
    }

    static int FCNPC_GetKeys(int npcid, ReferenceInt UDAnalog, ReferenceInt LRAnalog, ReferenceInt Keys) {
        return (int) functions.get("FCNPC_GetKeys").call(npcid, UDAnalog, LRAnalog, Keys);
    }

    static int FCNPC_SetSpecialAction(int npcid, int actionid) {
        return (int) functions.get("FCNPC_SetSpecialAction").call(npcid, actionid);
    }

    static int FCNPC_GetSpecialAction(int npcid) {
        return (int) functions.get("FCNPC_GetSpecialAction").call(npcid);
    }

    static int FCNPC_ToggleReloading(int npcid, boolean toggle) {
        return (int) functions.get("FCNPC_ToggleReloading").call(npcid, toggle);
    }

    static int FCNPC_ToggleInfiniteAmmo(int npcid, boolean toggle) {
        return (int) functions.get("FCNPC_ToggleInfiniteAmmo").call(npcid, toggle);
    }

    static int FCNPC_GoTo(int npcid, float X, float Y, float Z, int type, float speed, int UseZMap) {
        return (int) functions.get("FCNPC_GoTo").call(npcid, X, Y, Z, type, speed, UseZMap);
    }

    static int FCNPC_Stop(int npcid) {
        return (int) functions.get("FCNPC_Stop").call(npcid);
    }

    static int FCNPC_IsMoving(int npcid) {
        return (int) functions.get("FCNPC_IsMoving").call(npcid);
    }

    static int FCNPC_AimAt(int npcid, float X, float Y, float Z, int shoot) {
        return (int) functions.get("FCNPC_AimAt").call(npcid, X, Y, Z, shoot);
    }

    static int FCNPC_StopAim(int npcid) {
        return (int) functions.get("FCNPC_StopAim").call(npcid);
    }

    static int FCNPC_MeleeAttack(int npcid, int delay) {
        return (int) functions.get("FCNPC_MeleeAttack").call(npcid, delay);
    }

    static int FCNPC_StopAttack(int npcid) {
        return (int) functions.get("FCNPC_StopAttack").call(npcid);
    }

    static int FCNPC_IsAiming(int npcid) {
        return (int) functions.get("FCNPC_IsAiming").call(npcid);
    }

    static int FCNPC_IsShooting(int npcid) {
        return (int) functions.get("FCNPC_IsShooting").call(npcid);
    }

    static int FCNPC_IsReloading(int npcid) {
        return (int) functions.get("FCNPC_IsReloading").call(npcid);
    }

    static int FCNPC_EnterVehicle(int npcid, int vehicleid, int seatid, int type) {
        return (int) functions.get("FCNPC_EnterVehicle").call(npcid, vehicleid, seatid, type);
    }

    static int FCNPC_ExitVehicle(int npcid) {
        return (int) functions.get("FCNPC_ExitVehicle").call(npcid);
    }

    static int FCNPC_PutInVehicle(int npcid, int vehicleid, int seatid) {
        return (int) functions.get("FCNPC_PutInVehicle").call(npcid, vehicleid, seatid);
    }

    static int FCNPC_RemoveFromVehicle(int npcid) {
        return (int) functions.get("FCNPC_RemoveFromVehicle").call(npcid);
    }

    static int FCNPC_GetVehicleID(int npcid) {
        return (int) functions.get("FCNPC_GetVehicleID").call(npcid);
    }

    static int FCNPC_GetVehicleSeat(int npcid) {
        return (int) functions.get("FCNPC_GetVehicleSeat").call(npcid);
    }

    static int FCNPC_StartPlayingPlayback(int npcid, String file) {
        return (int) functions.get("FCNPC_StartPlayingPlayback").call(npcid, file);
    }

    static int FCNPC_StopPlayingPlayback(int npcid) {
        return (int) functions.get("FCNPC_StopPlayingPlayback").call(npcid);
    }

    static int FCNPC_PausePlayingPlayback(int npcid) {
        return (int) functions.get("FCNPC_PausePlayingPlayback").call(npcid);
    }

    static int FCNPC_ResumePlayingPlayback(int npcid) {
        return (int) functions.get("FCNPC_ResumePlayingPlayback").call(npcid);
    }

    static int FCNPC_OpenNode(int nodeid) {
        return (int) functions.get("FCNPC_OpenNode").call(nodeid);
    }

    static int FCNPC_CloseNode(int nodeid) {
        return (int) functions.get("FCNPC_CloseNode").call(nodeid);
    }

    static int FCNPC_IsNodeOpen(int nodeid) {
        return (int) functions.get("FCNPC_IsNodeOpen").call(nodeid);
    }

    static int FCNPC_GetNodeType(int nodeid) {
        return (int) functions.get("FCNPC_GetNodeType").call(nodeid);
    }

    static int FCNPC_SetNodePoint(int nodeid, int point) {
        return (int) functions.get("FCNPC_SetNodePoint").call(nodeid, point);
    }

    static int FCNPC_GetNodePointPosition(int nodeid, ReferenceFloat X, ReferenceFloat Y, ReferenceFloat Z) {
        return (int) functions.get("FCNPC_GetNodePointPosition").call(nodeid, X, Y, Z);
    }

    static int FCNPC_GetNodePointCount(int nodeid) {
        return (int) functions.get("FCNPC_GetNodePointCount").call(nodeid);
    }

    static int FCNPC_GetNodeInfo(int nodeid, ReferenceInt vehnodes, ReferenceInt pednodes, ReferenceInt navinode) {
        return (int) functions.get("FCNPC_GetNodeInfo").call(nodeid, vehnodes, pednodes, navinode);
    }

    static int FCNPC_PlayNode(int npcid, int nodeid, int type) {
        return (int) functions.get("FCNPC_PlayNode").call(npcid, nodeid, type);
    }

    static int FCNPC_StopPlayingNode(int npcid) {
        return (int) functions.get("FCNPC_StopPlayingNode").call(npcid);
    }

    static int FCNPC_GetZGround(float x, float y, ReferenceFloat z) {
        return (int) functions.get("FCNPC_GetZGround").call(x, y, z);
    }


}
