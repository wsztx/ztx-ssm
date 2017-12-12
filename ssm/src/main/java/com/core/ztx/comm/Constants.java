package com.core.ztx.comm;

public class Constants {
    /**
     * 默认成功代码
     */
    public static final String DEF_SUCC_CODE = "success";

    /**
     * 默认失败代码
     */
    public static final String DEF_FAIL_CODE = "error";
    /**
     * 默认成功消息
     */
    public static final String DEF_SUCC_MSG = "操作成功";

    /**
     * 默认失败消息
     */
    public static final String DEF_FAIL_MSG = "操作失败";

    /**
     * session超时时间（秒）
     */
    public static final int SESSION_TIME_OUT = 60 * 60 * 3 ;

    public enum SystemUrl {


        /** 登录页 */
    	login("/login","登录页"),
        /** 首页 */
        index("/index","首页"),
        /*** 报错页面 **/
        error("error/error", "错误页面");

        private String url;
        private String val;


        SystemUrl(String url,String val){
            this.url = url;
            this.val = val;
        }

        public String getUrl() {
            return url;
        }
        public String getVal() {
            return val;
        }
        public static SystemUrl getStatusCd(String name) {
            if (name!=null) {
                for (SystemUrl systemUrl : SystemUrl.values()) {
                    if (systemUrl.name().equalsIgnoreCase(name)) {
                        return systemUrl;
                    }
                }
            }
            return null;
        }
    }

}
