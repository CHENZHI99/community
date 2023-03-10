package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND("问题不存在，换一个试试看");
    @Override
    public String getMessage() {
        return message;
    }
    private String message;
    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
