package com.rong.test.pressure;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by rongjiabin on 2017/6/7.
 */
public class PressureTest {

    public static void main(String[] args) {
        final List<PressureEntry> data = preData();
        final Random random = new Random();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 50; j++) {
                        int i1 = random.nextInt(10);
                        PressureEntry pressureEntry = data.get(i1);
                        int i2 = random.nextInt(pressureEntry.getDatas().size());
                        try {
                            String s = HttpUtil.doPost("datacenter", pressureEntry.getMethod(), pressureEntry.getDatas().get(i2).getParam());
                            System.out.println(pressureEntry.getMethod() + "===" + pressureEntry.getDatas().get(i2).getParam() + "===real result===" + s);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

        }
    }

    public static List<PressureEntry> preData() {
        ArrayList<PressureEntry> arrayList = new ArrayList<>();
        PressureEntry pressureEntry = new PressureEntry();
        pressureEntry.setMethod("selectBySource");
        pressureEntry.setDatas(preSelectBySourceParam());
        arrayList.add(pressureEntry);
        PressureEntry pressureEntry2 = new PressureEntry();
        pressureEntry2.setMethod("selectCustomersBySourceAndCustomerId");
        pressureEntry2.setDatas(preSelectCustomersBySourceAndCustomerIdParam());
        arrayList.add(pressureEntry2);
        PressureEntry pressureEntry3 = new PressureEntry();
        pressureEntry3.setMethod("selectCustomerAuthorizationRelationBySCA");
        pressureEntry3.setDatas(preSelectCustomerAuthorizationRelationBySCAParam());
        arrayList.add(pressureEntry3);
        PressureEntry pressureEntry4 = new PressureEntry();
        pressureEntry4.setMethod("selectClientServiceBySource");
        pressureEntry4.setDatas(preSelectClientServiceBySourceParam());
        arrayList.add(pressureEntry4);
        PressureEntry pressureEntry5 = new PressureEntry();
        pressureEntry5.setMethod("selectLastOneBySourceAndState");
        pressureEntry5.setDatas(preSelectLastOneBySourceAndStateParam());
        arrayList.add(pressureEntry5);
        PressureEntry pressureEntry6 = new PressureEntry();
        pressureEntry6.setMethod("getRequestTemplate");
        pressureEntry6.setDatas(preGetRequestTemplateParam());
        arrayList.add(pressureEntry6);
        PressureEntry pressureEntry7 = new PressureEntry();
        pressureEntry7.setMethod("getServiceDataFormat");
        pressureEntry7.setDatas(preGetServiceDataFormatParam());
        arrayList.add(pressureEntry7);
        PressureEntry pressureEntry8 = new PressureEntry();
        pressureEntry8.setMethod("selectCrawlerNotifyLogByNotifyIdAndToken");
        pressureEntry8.setDatas(preSelectCrawlerNotifyLogByNotifyIdAndTokenParam());
        arrayList.add(pressureEntry8);
        PressureEntry pressureEntry9 = new PressureEntry();
        pressureEntry9.setMethod("selectByServiceType");
        pressureEntry9.setDatas(preSelectByServiceTypearam());
        arrayList.add(pressureEntry9);
        PressureEntry pressureEntry10 = new PressureEntry();
        pressureEntry10.setMethod("selectCustomerAuthorizationRelationBySC");
        pressureEntry10.setDatas(preSelectCustomerAuthorizationRelationBySCParam());
        arrayList.add(pressureEntry10);
        return arrayList;
    }

    private static List<PressureData> preSelectCustomerAuthorizationRelationBySCParam() {
        ArrayList<PressureData> arrayList=new ArrayList<>();
        PressureData pressureData=new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("serviceType","transportation");
        param1.addProperty("customerId","c3e995e1e07f0fbb127504eaf647f75f");
        pressureData.setParam(param1.toString());
        //pressureData.setResult("[{\"id\":55281,\"source\":100173,\"clientCustomerId\":\"100056_588b8f1b192e2e3a80d86b7bb7e88eda5\",\"token\":\"4eb27011ac649caac068b00462cc395365d8e92064a0407d4e4ef1864340f466\",\"customerId\":\"4eb27011ac649caac068b00462cc3953\",\"serviceType\":\"xuexinwang\",\"authorizationAccount\":\"13140514287\",\"authorizationIsEffect\":true,\"createTime\":\"Oct 24, 2016 5:08:11 PM\"}]");
        arrayList.add(pressureData);
        PressureData pressureData1=new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("serviceType","walmart");
        param2.addProperty("customerId","0a1155750a9466619039a0d4b8112de2");
        pressureData1.setParam("{\"serviceType\":\"transportation\",\"customerId\":\"736a57c59249f1ccb21b25752fa7c968\"}");
//        pressureData1.setResult("[{\"id\":34,\"source\":100160,\"clientCustomerId\":\"748389F06ACED79A\",\"token\":\"736a57c59249f1ccb21b25752fa7c96853725e0e28054156b093b6d3d68b1632\",\"customerId\":\"736a57c59249f1ccb21b25752fa7c968\",\"serviceType\":\"transportation\",\"authorizationAccount\":\"18641378939\",\"authorizationIsEffect\":true,\"createTime\":\"Dec 24, 2015 11:49:59 PM\"},{\"id\":56,\"source\":100160,\"clientCustomerId\":\"748389F06ACED79A\",\"token\":\"736a57c59249f1ccb21b25752fa7c96861229ef3d65c9f3cc613a89f7d4a33fa\",\"customerId\":\"736a57c59249f1ccb21b25752fa7c968\",\"serviceType\":\"transportation\",\"authorizationAccount\":\"15842354458\",\"authorizationIsEffect\":true,\"createTime\":\"Dec 24, 2015 11:53:14 PM\"}]");
        arrayList.add(pressureData1);
        return arrayList;
    }

    private static List<PressureData> preSelectByServiceTypearam() {
        ArrayList<PressureData> arrayList=new ArrayList<>();
        PressureData pressureData=new PressureData();
        pressureData.setParam("{\"serviceType\":\"cpf_reliability\"}");
//        pressureData.setResult("{\"id\":1,\"serviceName\":\"运营商\",\"serviceType\":\"transportation\",\"serviceState\":\"normal\",\"serviceDescription\":\"提供移动、联通、电信的通话详情、短信详情、流量详情等网络数据。\",\"createTime\":\"Dec 5, 2015 2:42:07 PM\",\"updateTime\":\"Dec 5, 2015 2:42:07 PM\",\"maxAuthCount\":3,\"fields\":4119}");
        arrayList.add(pressureData);
        PressureData pressureData1=new PressureData();
        pressureData1.setParam("{\"serviceType\":\"email_reliability\"}");
//        pressureData1.setResult("{\"id\":4,\"serviceName\":\"学信网\",\"serviceType\":\"xuexinwang\",\"serviceState\":\"normal\",\"serviceDescription\":\"提供个人学信网毕业院校、所学专业等学历学籍信息。\",\"createTime\":\"Mar 3, 2016 2:05:08 PM\",\"updateTime\":\"Mar 3, 2016 2:05:08 PM\",\"maxAuthCount\":100,\"fields\":7}");
        arrayList.add(pressureData1);
        return arrayList;
    }

    private static List<PressureData> preSelectCrawlerNotifyLogByNotifyIdAndTokenParam() {
        ArrayList<PressureData> arrayList=new ArrayList<>();
        PressureData pressureData=new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("notifyId","1B8EF78966FC43B1B026EEE2CBBF328942AE5AA991A44CCBAA893587F45033E3");
        param1.addProperty("token","53a74028f4397cd4a622f66235954604738a4fefaacf95b87946f88e357fc89d");
        pressureData.setParam(param1.toString());
//        pressureData.setResult("{\"id\":276699,\"notifyId\":\"3770AF1E6358484CA179EDBC2D7AFC4A060A33F0EEA64FA08562FB86B6AA800D\",\"token\":\"6a39d312dc3855e96f487d9cef1d989ddb1c9ae86ab4c58df5290e7081fdb933\",\"source\":100247,\"clientCustomerId\":\"8347906AD8AC3BA0\",\"account\":\"rjb_test_account00\",\"serviceType\":\"debit_bank\",\"crawlerState\":\"success\",\"code\":\"E000000\",\"timestamp\":\"1496306828024\",\"json\":\"{\\\"id\\\":\\\"3770AF1E6358484CA179EDBC2D7AFC4A060A33F0EEA64FA08562FB86B6AA800D\\\",\\\"source\\\":100247,\\\"clientCustomerId\\\":\\\"8347906AD8AC3BA0\\\",\\\"account\\\":\\\"rjb_test_account00\\\",\\\"crawlerState\\\":\\\"SUCCESS\\\",\\\"serviceType\\\":\\\"debit_bank\\\",\\\"queueType\\\":\\\"debit_bank_queue\\\",\\\"exchangeType\\\":\\\"debit_bank_exchange\\\",\\\"timestamp\\\":1496306828024,\\\"code\\\":\\\"E000000\\\"}\",\"updateTime\":\"Jun 1, 2017 4:38:41 PM\",\"createTime\":\"Jun 1, 2017 4:38:41 PM\"}");
        arrayList.add(pressureData);
        PressureData pressureData1=new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("notifyId","4CC56CB154E4431799717C1FE969D6B218852DE7D2E34E96B8D00360CF7024E0");
        param2.addProperty("token","0a1155750a9466619039a0d4b8112de273480728d9e80d101795b813b9cd2361");
        pressureData1.setParam(param2.toString());
//        pressureData1.setResult("{\"id\":276709,\"notifyId\":\"FDA239B01CFD4E4FAEA298D9618D038A5ECC22CB15A24C61BB1D583C3F920750\",\"token\":\"b3db2d76cae9275bea599ecf94e15c7576fadd1ec4fa5543352f7339212280ba\",\"source\":100234,\"clientCustomerId\":\"1192454545C9C985\",\"account\":\"12345678912\",\"serviceType\":\"insurance\",\"crawlerState\":\"success\",\"code\":\"E000000\",\"timestamp\":\"1494818953572\",\"json\":\"{\\\"id\\\":\\\"FDA239B01CFD4E4FAEA298D9618D038A5ECC22CB15A24C61BB1D583C3F920750\\\",\\\"source\\\":100234,\\\"clientCustomerId\\\":\\\"1192454545C9C985\\\",\\\"account\\\":\\\"12345678912\\\",\\\"crawlerState\\\":\\\"SUCCESS\\\",\\\"serviceType\\\":\\\"insurance\\\",\\\"queueType\\\":\\\"insurance_queue\\\",\\\"exchangeType\\\":\\\"insurance_exchange\\\",\\\"timestamp\\\":1494818953572,\\\"code\\\":\\\"E000000\\\"}\",\"updateTime\":\"Jun 1, 2017 4:41:50 PM\",\"createTime\":\"Jun 1, 2017 4:41:50 PM\"}");
        arrayList.add(pressureData1);
        return arrayList;
    }

    private static List<PressureData> preGetServiceDataFormatParam() {
        ArrayList<PressureData> arrayList=new ArrayList<>();
        PressureData pressureData=new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("serviceType","card_authentication_with_two");
        param1.addProperty("dataFormatType","origin");
        param1.addProperty("state","normal");
        pressureData.setParam(param1.toString());
//        pressureData.setResult("{\"id\":138,\"serviceType\":\"fund\",\"dataFormatType\":\"publicfunds_funddetail\",\"state\":\"normal\",\"createTime\":\"Jul 7, 2016 8:18:19 PM\",\"serviceFormatType\":\"api\",\"requestId\":330,\"allowCallback\":true,\"allowPaint\":true,\"allowDiyProtocol\":false,\"allowDiyCss\":false,\"defaultCss\":\"/**/\",\"serviceName\":\"公积金\",\"dataFormatProperty\":\"credit_report\",\"dataFormatName\":\"公积金详细信息\",\"serviceFormatName\":\"接口授权\",\"dataFormatIsShow\":\"f\",\"dataFormatCombinationIds\":\"55\"}");
        arrayList.add(pressureData);
        PressureData pressureData1=new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("serviceType","label_loan_info");
        param2.addProperty("dataFormatType","origin");
        param2.addProperty("state","normal");
        pressureData1.setParam(param2.toString());
//        pressureData1.setResult("{\"id\":86,\"serviceType\":\"transportation\",\"dataFormatType\":\"operator_wecashprofile\",\"state\":\"normal\",\"createTime\":\"Jul 7, 2016 8:18:19 PM\",\"serviceFormatType\":\"api\",\"requestId\":304,\"allowCallback\":true,\"allowPaint\":true,\"allowDiyProtocol\":false,\"allowDiyCss\":false,\"defaultCss\":\"/**/\",\"serviceName\":\"运营商\",\"dataFormatProperty\":\"credit_report\",\"dataFormatName\":\"运营商闪银用户信息概要\",\"serviceFormatName\":\"接口授权\",\"dataFormatIsShow\":\"f\",\"dataFormatCombinationIds\":\"29\"}");
        arrayList.add(pressureData1);
        return arrayList;
    }

    private static List<PressureData> preGetRequestTemplateParam() {
        ArrayList<PressureData> arrayList = new ArrayList<>();
        PressureData pressureData = new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("requestId","55");
        pressureData.setParam(param1.toString());
//        pressureData.setResult("{\"id\":55,\"url\":\"http://121.42.147.36:8180/query/v1/common/callback\",\"method\":\"POST\",\"charset\":\"UTF-8\",\"timeout\":10000,\"gzip\":false,\"acceptStatCode\":\"200\",\"header\":\"{\\\"Content-Type\\\":\\\"application/json\\\"}\",\"params\":\"{}\",\"createTime\":\"Feb 17, 2016 10:36:44 AM\",\"updateTime\":\"Feb 17, 2016 10:36:44 AM\"}");
        arrayList.add(pressureData);
        PressureData pressureData2 = new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("requestId","116");
        pressureData2.setParam(param2.toString());
//        pressureData2.setResult("{\"id\":116,\"url\":\"https://dc.wecash.net/protype-jingdong/getJDInfo\",\"method\":\"POST\",\"charset\":\"UTF-8\",\"timeout\":20000,\"gzip\":true,\"acceptStatCode\":\"200,401,403,404,405,500\",\"header\":\"{\\\"Content-Type\\\":\\\"application/json\\\",\\\"Authorization\\\":\\\"Basic cGxhdGZvcm06UVpjbER5R0U4UmN0aXZLWUdBOTA\\u003d\\\"}\",\"params\":\"{\\\"source\\\":\\\"${source}\\\",\\\"custId\\\":\\\"${client_customer_id}\\\",\\\"jd_account\\\":\\\"${account}\\\"}\",\"createTime\":\"Mar 22, 2016 10:23:10 AM\",\"updateTime\":\"Mar 22, 2016 10:23:10 AM\"}");
        arrayList.add(pressureData2);
        return arrayList;
    }


    private static List<PressureData> preSelectLastOneBySourceAndStateParam() {
        ArrayList<PressureData> arrayList = new ArrayList<>();
        PressureData pressureData = new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("source","100005");
        param1.addProperty("state","normal");
        pressureData.setParam(param1.toString());
//        pressureData.setResult("{\"id\":34,\"source\":100005,\"key\":\"3CB72DFB-0ADA-4117-90C0-8F10ACF0789F-20151209140826336-100005\",\"state\":\"normal\",\"createTime\":\"Dec 9, 2015 2:08:26 PM\"}");
        arrayList.add(pressureData);
        PressureData pressureData2 = new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("source","100001");
        param2.addProperty("state","normal");
        pressureData2.setParam(param2.toString());
//        pressureData2.setResult("{\"id\":223,\"source\":100001,\"key\":\"34711352-AA7F-4555-A3D0-2C10AC94720E-20160309140855969-100001\",\"state\":\"normal\",\"createTime\":\"Mar 9, 2016 2:08:55 PM\"}");
        arrayList.add(pressureData2);
        return arrayList;
    }

    private static List<PressureData> preSelectClientServiceBySourceParam() {
        ArrayList<PressureData> arrayList = new ArrayList<>();
        PressureData pressureData = new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("source","100187");
        param1.addProperty("serviceType","jingdong");
        param1.addProperty("state","normal");
        pressureData.setParam(param1.toString());
//        pressureData.setResult("[{\"id\":604,\"source\":100246,\"serviceType\":\"alipay\",\"dataFormatType\":\"origin\",\"callbackUrl\":\"http://baidu.com\",\"state\":\"normal\",\"createTime\":\"Aug 5, 2016 3:04:59 PM\",\"updateTime\":\"Aug 5, 2016 3:04:59 PM\",\"callbackParams\":\"{\\\"service_type\\\":\\\"${service_type}\\\",\\\"signature\\\":\\\"${signature}\\\",\\\"client_customer_id\\\":\\\"${client_customer_id}\\\",\\\"source\\\":\\\"${source}\\\",\\\"state\\\":\\\"${state}\\\",\\\"account\\\":\\\"${account}\\\",\\\"token\\\":\\\"${token}\\\",\\\"timestamp\\\":\\\"${timestamp}\\\"}\",\"serviceFormatType\":\"sdk\",\"serviceDataFormatId\":200,\"requestId\":358,\"callbackProtocol\":\"http\",\"dataFormatIsShow\":\"t\",\"dataFormatCombinationIds\":\"1\",\"price\":0.00,\"hitPrice\":0.00}]");
        arrayList.add(pressureData);
        PressureData pressureData2 = new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("source","100116");
        param2.addProperty("serviceType","mobile_certification_check");
        param2.addProperty("state","normal");
        pressureData2.setParam(param2.toString());
//        pressureData2.setResult("[{\"id\":74,\"source\":100002,\"serviceType\":\"transportation\",\"dataFormatType\":\"report\",\"callbackUrl\":\"http://www.baidu.com\",\"state\":\"normal\",\"createTime\":\"Feb 17, 2016 10:28:27 AM\",\"updateTime\":\"Feb 17, 2016 10:28:27 AM\",\"callbackParams\":\"{}\",\"serviceFormatType\":\"api\",\"serviceDataFormatId\":6,\"requestId\":53,\"callbackProtocol\":\"http\",\"useDefaultProtocol\":false,\"protocolContent\":\"\",\"protocolFileId\":101,\"dataFormatIsShow\":\"t\",\"dataFormatCombinationIds\":\"2\",\"price\":0.00,\"hitPrice\":0.00}]");
        arrayList.add(pressureData2);
        return arrayList;
    }

    private static List<PressureData> preSelectCustomerAuthorizationRelationBySCAParam() {
        ArrayList<PressureData> arrayList = new ArrayList<>();
        PressureData pressureData = new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("serviceType","transportation");
        param1.addProperty("customerId","5dcee178403a9b82f60a0928decac033");
        param1.addProperty("account","18284369323");
        pressureData.setParam(param1.toString());
//        pressureData.setResult("{\"id\":251,\"source\":100160,\"clientCustomerId\":\"E343CB2E68F9F521\",\"token\":\"a66e5b04c49649d647143b4a5919a78656efe3f3094cfb1c9de114999d871bf9\",\"customerId\":\"a66e5b04c49649d647143b4a5919a786\",\"serviceType\":\"transportation\",\"authorizationAccount\":\"13088115005\",\"authorizationIsEffect\":true,\"createTime\":\"Dec 25, 2015 1:22:58 PM\"}");
        arrayList.add(pressureData);
        PressureData pressureData2 = new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("serviceType","xuexinwang");
        param2.addProperty("customerId","29da763dda1e40615715ad06a8f974f0");
        param2.addProperty("account","15734091816");
        pressureData2.setParam(param2.toString());
//        pressureData2.setResult("{\"id\":39,\"source\":100160,\"clientCustomerId\":\"180DD54FF9B977B7\",\"token\":\"1b03578de5763cb88fcd94dcce8a1323fbe6b1b7ef5c4c7cd36217172ba05a45\",\"customerId\":\"1b03578de5763cb88fcd94dcce8a1323\",\"serviceType\":\"transportation\",\"authorizationAccount\":\"18773211735\",\"authorizationIsEffect\":true,\"createTime\":\"Dec 24, 2015 11:50:42 PM\"}");
        arrayList.add(pressureData2);
        return arrayList;
    }

    private static List<PressureData> preSelectBySourceParam() {
        ArrayList<PressureData> arrayList = new ArrayList<>();
        PressureData pressureData = new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("source","100287");
        pressureData.setParam(param1.toString());
//        pressureData.setResult("{\"id\":289,\"source\":100287,\"masterSource\":100287,\"companyName\":\"12345678901\",\"contactName\":\"12345678901\",\"contactPhone\":\"12345678901\",\"allowedServiceReg\":\".*\",\"product\":\"12345678901\",\"type\":\"normal\",\"state\":\"invalid\",\"isComplete\":false,\"createTime\":\"Nov 7, 2016 8:53:16 PM\",\"updateTime\":\"Nov 7, 2016 8:53:33 PM\"}");
        arrayList.add(pressureData);
        PressureData pressureData2 = new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("source","100288");
        pressureData2.setParam(param2.toString());
//        pressureData2.setResult("{\"id\":290,\"source\":100288,\"masterSource\":100288,\"companyName\":\"12345678901\",\"contactName\":\"12345678901\",\"contactPhone\":\"12345678901\",\"allowedServiceReg\":\".*\",\"product\":\"12345678901\",\"type\":\"normal\",\"state\":\"invalid\",\"isComplete\":false,\"createTime\":\"Nov 7, 2016 8:53:25 PM\",\"updateTime\":\"Nov 7, 2016 8:53:42 PM\"}");
        arrayList.add(pressureData2);
        return arrayList;
    }

    private static List<PressureData> preSelectCustomersBySourceAndCustomerIdParam() {
        ArrayList<PressureData> arrayList = new ArrayList<>();
        PressureData pressureData = new PressureData();
        JsonObject param1=new JsonObject();
        param1.addProperty("source","100173");
        param1.addProperty("clientCustomerId","10000_0EE4FA1F4806862B");
        pressureData.setParam(param1.toString());
//        pressureData.setResult("{\"id\":80379,\"source\":100173,\"clientCustomerId\":\"10000_73CB1DBBBC642451\",\"customerId\":\"276399f4b1abeef35a57f775cb536c3e\",\"createTime\":\"May 20, 2016 3:24:03 PM\"}");
        arrayList.add(pressureData);
        PressureData pressureData2 = new PressureData();
        JsonObject param2=new JsonObject();
        param2.addProperty("source","100160");
        param2.addProperty("clientCustomerId","D2A156B762705327");
        pressureData2.setParam(param2.toString());
//        pressureData2.setResult("{\"id\":88778,\"source\":100286,\"clientCustomerId\":\"999999999901\",\"customerId\":\"260d22480cf4517993f0cf8f2b809f78\",\"createTime\":\"Jun 6, 2017 5:53:09 PM\"}");
        arrayList.add(pressureData2);
        return arrayList;
    }
}
