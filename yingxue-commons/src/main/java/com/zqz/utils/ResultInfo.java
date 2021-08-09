package com.zqz.utils;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 公共返回对象
 */
@Data
public class ResultInfo<T> implements Serializable {
    
    private Integer code;
    private String message;
    private String path;
    private T data;
    
}