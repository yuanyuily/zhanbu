package com.qihang.augur.entity.comman;
/**
 * 请求结果格式化处理实体类
 * @author yangrenzhi
 *
 */
public class Result<T>{
	private int status;
	private String msg;
	private String devMsg;
	private int code;
	private T data;

	public static<T> Result<T> success(){
		return Result.success("请求成功！",null);
	}
	
	public static<T> Result<T> success(T data){
		return Result.success("请求成功！",data);
	}
	

	public static<T> Result<T> success(String msg, T data){
		return new Result<T>(true,msg,data);
	}
	public static<T> Result<T> fail(){
		return new Result<T>(false,"请求失败",null);
	}
	public static<T> Result<T> fail(String msg){
		return new Result<T>(false,msg,null);
	}
	public static<T> Result<T> fail(String msg, int code){
		return new Result<T>(false,msg,null,code);
	}
	public static<T> Result<T> getResult(boolean isSuccess,T data){
		return new Result<>(isSuccess, "请求成功", data, ResultStatus.OK_CODE);
	}
	public static<T> Result<T> getResult(boolean isSuccess,String msg,T data){
		return new Result<>(isSuccess, msg, data, ResultStatus.OK_CODE);
	}
	public static<T> Result<T> getResult(boolean isSuccess,String msg,T data,int code){
		return new Result<>(isSuccess, msg, data, code);
	}
	
	public Result(boolean isSuccess, T data){
		if(isSuccess) {
			this.status = 1;
			this.code = ResultStatus.OK_CODE;
		}else {
			this.status = 0;
			this.code = ResultStatus.ERROR_CODE;
		}
		this.msg = "请求成功!";
		this.data = data;
	}
	
	public Result(boolean isSuccess, String msg, T data){
		if(isSuccess) {
			this.status = 1;
			this.code = ResultStatus.OK_CODE;
		}else {
			this.status = 0;
			this.code = ResultStatus.ERROR_CODE;
		}
		this.msg = msg;
		this.data = data;
	}
	
	public Result(boolean isSuccess, String msg, T data, int code){
		if(isSuccess) {
			this.status = 1;
		}else {
			this.status = 0;
		}
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDevMsg() {
		return devMsg;
	}

	public void setDevMsg(String devMsg) {
		this.devMsg = devMsg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}