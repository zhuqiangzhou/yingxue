package com.zqz.controller;

import com.zqz.entity.Admin;
import com.zqz.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2021-08-09 22:31:51
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Admin selectOne(Integer id) {
        return this.adminService.queryById(id);
    }


    @GetMapping("/demo")
    public String deom() {
        return "demo";
    }
}
