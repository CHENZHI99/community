package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND(2001,"问题不存在，换一个试试看"),
    TARGET_PARAM_COMMENT_NOT_FOUND(2002, "未选择回复对象"),
    NO_LOGIN(2003, "请先登录"),
    SYS_ERROR(2004, "服务器异常，稍后再试。"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或者不存在"),
    COMMENT_NOT_FOUND(2006, "评论不存在，换一个试试看"),
    COMMENT_IS_EMPTY(2006, "输入内容不能为空"),
    ;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
