package com.sangjin.securityCustom;

import com.sangjin.securityCustom.account.Account;
import com.sangjin.securityCustom.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account sangjin = accountService.createAccount("sangjin", "1234");
        System.out.println(sangjin.getUsername()+" password: " + sangjin.getPassword());
    }

}
