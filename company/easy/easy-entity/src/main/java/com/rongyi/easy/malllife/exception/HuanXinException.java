package com.rongyi.easy.malllife.exception;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  摩生活 业务异常类
 * time:  2015/5/12
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/12              1.0            创建文件
 *
 */
public class HuanXinException extends Exception{


    public HuanXinException(){

    }

    public HuanXinException(String message) {
        super(message) ;
    }

    public HuanXinException(String message, Throwable cause) {
        super(message, cause);
    }

    public HuanXinException(Throwable cause) {
        super(cause);
    }

    public HuanXinException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}