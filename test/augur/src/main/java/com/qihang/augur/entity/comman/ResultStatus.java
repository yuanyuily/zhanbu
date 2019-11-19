package com.qihang.augur.entity.comman;

public class ResultStatus {
	/**请求成功**/
	public static final int OK_CODE = 200;
	/**请求失败**/
	public static final int ERROR_CODE = 500;
	/**由于程序异常导致出现的错误**/
	public static final int ERROR_EXCEPTOIN = 10501;
	/**缺少参数**/
	public static final int ERROR_MiSS_PARAM = 10502;
	/**JSON解析错误**/
	public static final int ERROR_JSON_PARSE = 10503;
	/**用户权限不足**/
	public static final int ERROR_AUTH = 10505;
	/**非法的公共请求**/
	public static final int ERROR_PUB_REQ_ILLEGALITY = 10601;
	/**APP未在我方注册**/
	public static final int ERROR_APP_UNREGISTERED = 10602;
	/**设备已激活**/
	public static final int ERROR_APP_ACTIVED = 10603;
	/**设备已上报**/
	public static final int ERROR_APP_REPORTED = 10604;
}
