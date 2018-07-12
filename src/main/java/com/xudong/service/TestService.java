package com.xudong.service;

import com.xudong.dao.test2.TestDB2Dao;
import com.xudong.dao.test1.TestDBDao;
import com.xudong.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    int i = 0;

    @Autowired
    private TestDBDao test1;
    @Autowired
    private TestDB2Dao test2;

    @Transactional
    public void save() {
        test1.saveTest("" + RandomUtils.nextInt(1, 100));
        test2.saveTest("" + RandomUtils.nextInt(100, 200));

        if (i > 2) {
            throw new NullPointerException();
        }
        i++;
    }

}
