package com.itheima.service;

import com.itheima.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Mendy
 * @create 2023-06-24 15:46
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private  AccountService accountService;


    @Test
    public void testFindById(){
        System.out.println(accountService.findById(2));

    }


    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }


}
