package com.rong.test;

import net.wecash.brazil.titan.model.ClientInfo;
import net.wecash.brazil.titan.service.DataCenterService;
import sun.applet.Main;

import java.util.List;

/**
 * Created by rongjiabin on 2017/5/5.
 */
public class TestRPCAPI {
    public static void main(String[] args) {
        DataCenterService dataCenterService=new DataCenterService("127.0.0.1",8090);
        List<ClientInfo> clientInfo = dataCenterService.getClientInfo(0, 10);
        for (ClientInfo c:clientInfo){
            System.out.println(c.getAccount());
        }
    }
}
