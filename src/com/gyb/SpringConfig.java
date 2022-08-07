package com.gyb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Description:
 *
 * @author GB
 * @date 2022/5/13 21:17
 *
 * <pre>
 *              www.dustess.com
 *      Copyright (c) 2022. All Rights Reserved.
 * </pre>
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.gyb")
public class SpringConfig {
}
