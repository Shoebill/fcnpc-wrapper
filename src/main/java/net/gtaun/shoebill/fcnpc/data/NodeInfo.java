package net.gtaun.shoebill.fcnpc.data;

/**
 * Created by marvin on 16.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class NodeInfo {

    private int vehicleNodes, pedNodes, naviNodes;

    public NodeInfo(int vehicleNodes, int pedNodes, int naviNodes) {
        this.vehicleNodes = vehicleNodes;
        this.pedNodes = pedNodes;
        this.naviNodes = naviNodes;
    }

    public int getVehicleNodes() {
        return vehicleNodes;
    }

    public int getPedNodes() {
        return pedNodes;
    }

    public int getNaviNodes() {
        return naviNodes;
    }
}
