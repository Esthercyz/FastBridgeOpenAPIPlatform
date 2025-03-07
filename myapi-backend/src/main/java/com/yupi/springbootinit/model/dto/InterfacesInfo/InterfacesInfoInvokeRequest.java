package com.yupi.springbootinit.model.dto.InterfacesInfo;

import lombok.Data;

import java.io.Serializable;

/*
接口调用请求
 */
@Data
public class InterfacesInfoInvokeRequest implements Serializable {
    /*
    主键
     */
    private Long id;
    /*
    用户请求参数
     */
    private String userRequestParams;

    private static final long serialVersionID = 1L;
}
