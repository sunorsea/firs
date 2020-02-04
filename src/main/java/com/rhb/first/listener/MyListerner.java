package com.rhb.first.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author rhb
 * @Date 2020/2/3
 */
@Component
public class MyListerner implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyListener init");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener dest");
    }
}
