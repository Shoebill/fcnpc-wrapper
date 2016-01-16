package net.gtaun.shoebill.fcnpc;

import net.gtaun.shoebill.amx.AmxInstance;
import net.gtaun.shoebill.amx.AmxInstanceManager;
import net.gtaun.shoebill.amx.types.ReferenceFloat;
import net.gtaun.shoebill.amx.types.ReferenceInt;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.fcnpc.constant.NodeType;
import net.gtaun.shoebill.fcnpc.data.NodeInfo;
import net.gtaun.shoebill.resource.Plugin;
import net.gtaun.util.event.EventManager;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class Wrapper extends Plugin {

    private static Wrapper instance;
    public static Wrapper getInstance() {
        return instance;
    }

    public static final int MAX_NODES = 64;
    public static final int INVALID_ENTITY_ID = 0xFFFF;

    private Logger logger;
    private EventManager eventManager;

    private List<FCNPC> npcs;

    @Override
    protected void onEnable() throws Throwable {
        instance = this;
        logger = getLogger();
        eventManager = getEventManager();
        Callbacks.registerHandlers(AmxInstanceManager.get());
        Functions.registerFunctions(AmxInstance.getDefault());

        npcs = new ArrayList<>();
    }

    @Override
    protected void onDisable() throws Throwable {
        Callbacks.unregisterHandlers(AmxInstanceManager.get());

        npcs.stream().filter(fcnpc -> !fcnpc.isDestroyed()).collect(Collectors.toList()).forEach(FCNPC::destroy);
        npcs.clear();
    }

    protected void addNpc(FCNPC npc) {
        npcs.add(npc);
    }

    protected void removeNpc(FCNPC npc) {
        npcs.remove(npc);
    }

    public void setUpdateRate(int rate) {
        Functions.FCNPC_SetUpdateRate(rate);
    }

    public boolean initZMap(String file) {
        return Functions.FCNPC_InitZMap(file) > 0;
    }

    public boolean openNode(int node) {
        return Functions.FCNPC_OpenNode(node) > 0;
    }

    public void closeNode(int node) {
        Functions.FCNPC_CloseNode(node);
    }

    public boolean isNodeOpen(int node) {
        return Functions.FCNPC_IsNodeOpen(node) > 0;
    }

    public NodeType getNodeType(int node) {
        return NodeType.getType(Functions.FCNPC_GetNodeType(node));
    }

    public void setNodePoint(int node, int point) {
        Functions.FCNPC_SetNodePoint(node, point);
    }

    public Vector3D getNodePointPosition(int node) {
        ReferenceFloat x = new ReferenceFloat(0f), y = new ReferenceFloat(0f), z = new ReferenceFloat(0f);
        Functions.FCNPC_GetNodePointPosition(node, x, y, z);
        return new Vector3D(x.getValue(), y.getValue(), z.getValue());
    }

    public int getNodePointCount(int node) {
        return Functions.FCNPC_GetNodePointCount(node);
    }

    public NodeInfo getNodeInfo(int node) {
        ReferenceInt vehNodes = new ReferenceInt(0), pedNodes = new ReferenceInt(0), naviNodes = new ReferenceInt(0);
        Functions.FCNPC_GetNodeInfo(node, vehNodes, pedNodes, naviNodes);
        return new NodeInfo(vehNodes.getValue(), pedNodes.getValue(), naviNodes.getValue());
    }

    public float getZGround(float x, float y) {
        ReferenceFloat z = new ReferenceFloat(0f);
        Functions.FCNPC_GetZGround(x, y, z);
        return z.getValue();
    }

    public List<FCNPC> getNpcs() {
        return npcs;
    }
}
