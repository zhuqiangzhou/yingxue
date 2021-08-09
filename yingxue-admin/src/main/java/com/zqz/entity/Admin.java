package com.zqz.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2021-08-09 22:31:49
 */
@Data
public class Admin implements Serializable {
    private static final long serialVersionUID = 390491366715189030L;
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户头像地址
     */
    private String avatar;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;
    /**
     * 删除时间
     */
    private Date deletedAt;


}
