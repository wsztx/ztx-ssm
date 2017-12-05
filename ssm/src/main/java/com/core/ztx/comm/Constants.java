package com.core.ztx.comm;

public class Constants {
    /**
     * 默认成功消息
     */
    public static final String DEF_SUCC_MSG = "操作成功";

    /**
     * 默认失败消息
     */
    public static final String DEF_FAIL_MSG = "操作失败";

    /**
     * 默认每页数量
     */
    public static final int DEF_PAGE_SIZE = 500;

    /**
     * 认证票据
     */
    public static final String TICKET = "ticket";

    /**
     * 平台信息，ios / android
     */
    public static final String PLATFORM = "platform";

    /**
     * session超时时间（秒）
     */
    public static final int SESSION_TIME_OUT = 60 * 60 * 24 ;

    public static final int COOKIE_TIME_OUT =60 * 60 * 24 * 30;

    public static final String LOGIN_TIME = "loginTime";

    public static final String IS_CHECKED = "1";

    public static final String LATEST_UPDATE_TIME = "latestUpdateTime";

    public static final String CLIENT_ADDRESS = "clientAddress";

    public static final String USER_NAME = "userName";


    public static final Long SYSTEM_ID = 1l;


    public static final String TEMP_FILE_PATH = "/tmp/";

    public static final String COMMON_SPLIT = "#";

    public static final String COMMA_SPLIT = ",";

    public static final String MIDDLELINE = "-";


    /**
     * 返回代码：成功
     */
    public static final int RES_CODE_OK = 200;

    /**
     * 返回代码：失败
     */
    public static final int RES_CODE_ERROR = 500;

    /**
     * 返回代码：参数错误
     */
    public static final int RES_CODE_UNPROCESSABLE = 422;
    
    /**
     * 返回代码：未验证
     */
    public static final int RES_CODE_UNAUTH = 401;


    public static final String LOGIN_NEXT_URL = "lg_nt_rl";

    public enum SystemUrl {


//        /** 首页 */
//        index("/index","/index/view","首页"),
        /** 首页 */
        index("/user","/user/login","首页"),
        /*** 报错页面 **/
        e_404("/404", "/404/view", "报错404页面"),
        web_error("/error", "error/error", "错误页面"),

        ;

        private String controller;
        private String url;
        private String val;


        SystemUrl(String controller,String url,String val){
            this.controller = controller;
            this.url = url;
            this.val = val;
        }

        public String forward(){
            return "forward:"+this.controller;
        }

        public String redirect(){
            return "redirect:"+this.controller;
        }

        public String getUrl() {
            return url;
        }
        public String getController() {
            return controller;
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
