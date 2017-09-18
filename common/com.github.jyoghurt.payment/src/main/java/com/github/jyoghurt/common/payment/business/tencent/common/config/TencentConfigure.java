package com.github.jyoghurt.common.payment.business.tencent.common.config;

/**
 * User: rizenguo
 * Date: 2014/10/29
 * Time: 14:40
 * 这里放置各种配置数据
 */
public class TencentConfigure {
//这个就是自己要保管好的私有Key了（切记只能放在自己的后台代码里，不能放在任何可能被看到源代码的客户端程序中）
    // 每次自己Post数据给API的时候都要用这个key来对所有字段进行签名，生成的签名会放在Sign这个字段，API收到Post数据的时候也会用同样的签名算法对Post过来的数据进行签名和验证
    // 收到API的返回的时候也要用这个key来对返回的数据算下签名，跟API的Sign数据进行比较，如果值不一致，有可能数据被第三方给篡改

    private String key = "";

    //微信分配的公众号ID（开通公众号之后可以获取到）
    private String appID = "";

    //微信支付分配的商户号ID（开通公众号的微信支付功能之后可以获取到）
    private String mchID = "";

    //受理模式下给子商户分配的子商户号
    private String subMchID = "";

    //HTTPS证书的本地路径
    private String certLocalPath = "";

    //HTTPS证书密码，默认密码等于商户号MCHID
    private String certPassword = mchID;

    //是否使用异步线程的方式来上报API测速，默认为异步模式
    private boolean useThreadToDoReport = true;


    //以下是几个API的路径：
    //1）被扫支付API
    public static String PAY_API = "https://api.mch.weixin.qq.com/pay/micropay";

    //2）被扫支付查询API
    public static String PAY_QUERY_API = "https://api.mch.weixin.qq.com/pay/orderquery";

    //3）退款API
    public static String REFUND_API = "https://api.mch.weixin.qq.com/secapi/pay/refund";

    //4）退款查询API
    public static String REFUND_QUERY_API = "https://api.mch.weixin.qq.com/pay/refundquery";

    //5）撤销API
    public static String REVERSE_API = "https://api.mch.weixin.qq.com/secapi/pay/reverse";

    //6）下载对账单API
    public static String DOWNLOAD_BILL_API = "https://api.mch.weixin.qq.com/pay/downloadbill";

    //7) 统计上报API
    public static String REPORT_API = "https://api.mch.weixin.qq.com/payitil/report";

    //8) 统一下单
    public static String NATIVE_PAY = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    //9) 关闭订单  WEB
    public static String CLOSE_ORDER = "https://api.mch.weixin.qq.com/pay/closeorder";

    public static String HttpsRequestClassName = "com.tencent.common.HttpsRequest";

    public TencentConfigure initTencentConfigure(String key, String appID, String mchID, String subMchID, String
            certLocalPath) {
        this.setKey(key);
        this.setAppID(appID);
        this.setMchID(mchID);
        this.setSubMchID(subMchID);
        this.setCertLocalPath(certLocalPath);
        return this;
    }

    public boolean isUseThreadToDoReport() {
        return useThreadToDoReport;
    }

    public void setUseThreadToDoReport(boolean useThreadToDoReport) {
        this.useThreadToDoReport = useThreadToDoReport;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getMchID() {
        return mchID;
    }

    public void setMchID(String mchID) {
        this.mchID = mchID;
        this.certPassword = mchID;
    }

    public String getSubMchID() {
        return subMchID;
    }

    public void setSubMchID(String subMchID) {
        this.subMchID = subMchID;
    }

    public String getCertLocalPath() {
        return certLocalPath;
    }

    public void setCertLocalPath(String certLocalPath) {
        this.certLocalPath = certLocalPath;
    }

    public String getCertPassword() {
        return certPassword;
    }

}
