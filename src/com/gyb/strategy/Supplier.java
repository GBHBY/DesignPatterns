package com.gyb.strategy;

/**
 * @author gb
 * @version 1.0
 * description:
 * @date 2021/8/25 0:14
 */

interface Supplier {
    /**
     * create by: gb
     * description: 返回token
     * create time: 2021/8/25 0:16
     *
     * @param
     * @return
     */
    String getToken();

    /**
     * create by: gb
     * description: 返回客户端id
     * create time: 2021/8/25 0:17
     *
     * @param
     * @return
     */
    String getClientId();
}
