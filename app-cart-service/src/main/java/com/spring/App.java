package com.spring;

import com.spring.cart.ICartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ICartService cartService = context.getBean(ICartService.class);
        System.out.println(cartService);
    }
}
