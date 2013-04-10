package com.test.fine.ws.impl;

import com.test.fine.ws.TestRestService;

/**
 * Created with IntelliJ IDEA.
 * User: vasanta
 * Date: 4/9/13
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestRestServiceImpl implements TestRestService {
    @Override
    public String saySomething() {
        return "Hello " + System.currentTimeMillis();
    }
}
