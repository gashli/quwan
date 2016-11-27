package com.quwan.basic.exception;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class QuWanException extends RuntimeException {

    private static final long serialVersionUID = 8959096626837531832L;
    public static final QuWanException SUCCESS = new QuWanException("000000", "成功");
    public static final QuWanException FAIL = new QuWanException("999999", "系统异常");


    //数据库操作错误
    public static final QuWanException DB_ERROR = new QuWanException("QW000001", "数据库异常");

    //文件操作异常
    public static final QuWanException FILE_WRITE_ERROR = new QuWanException("QW001000", "文件操作异常");

    //积分计算出错
    public static final QuWanException SCORE_CAL_ERROR = new QuWanException("QW002000", "评分计算异常");


    private String code;
    private String message;

    public QuWanException(String status) {
        this.code = status;
    }

    public QuWanException(String status, String message) {
        super(message);
        this.code = status;
        this.message = message;
    }

    public QuWanException newInstance(String message) {
        QuWanException ex = new QuWanException(code);
        ex.setMessage(message);
        return ex;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 业务异常不需要跟踪堆栈信息，减少VM在抛异常时java进程的子线程的停顿
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
