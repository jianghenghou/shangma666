package com.javasm.springbootmybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author jhh
 * @since 2021-06-29
 */
@Data
public class Employee  {


    /**
     * 员工id
     */
    private Integer employeeId;

    /**
     * 员工名字
     */
    private String employeeName;

    /**
     * 员工头像
     */
    private String employeeImg;

    /**
     * 员工邮箱
     */
    private String employeeEmail;

    /**
     * 员工所在部门
     */
    private String employeeDept;

    /**
     * 入职时间
     */
    //@JsonFormat(pattern = "yyyy-MM-dd")
   // private Date employeeTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime employeeTime;


}
