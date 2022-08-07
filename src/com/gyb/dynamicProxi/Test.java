package com.gyb.dynamicProxi;

import com.gyb.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Hashtable;

/**
 * Description:
 *
 * @author GB
 * @date 2022/5/14 20:06
 *
 * <pre>
 *              www.dustess.com
 *      Copyright (c) 2022. All Rights Reserved.
 * </pre>
 */
@Component("test1")
public class Test {
    private Hashtable<Object,Object> objectObjectHashtable = new Hashtable<>();

}
