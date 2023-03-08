package chat_services;

import java.io.Serializable;

public class MessageDto<T> implements Serializable {

private String auth;
private boolean  success;
private String message;

private Command command;

private T data;

    public MessageDto(String auth, boolean success, String message, Command command, T data) {
        this.auth = auth;
        this.success = success;
        this.message = message;
        this.command = command;
        this.data = data;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getAuth() {
        return auth;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Command getCommand() {
        return command;
    }

    public T getData() {
        return data;
    }
}
