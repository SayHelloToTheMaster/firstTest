package com.secretemanager;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Getter
@Setter
@Accessors(chain = true)
@JsonPropertyOrder({"status", "message", "message_code", "data"})
public class ResponseModel {
    private int status;
    private String message;
    private String message_code;
    private Object data;

    @Override
    public String toString() {
        return "ResponseModel{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", message_code='" + message_code + '\'' +
                ", data=" + data +
                '}';
    }
}

