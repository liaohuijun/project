package com.github.liaohuijun.proxy.study.demo4.proxy.annon;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Seven {
	
	public String value() default "小黑";
	
	public String Property() default "无属性";
	
}
