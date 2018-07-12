package com.xudong.utils;

import java.util.Random;

public class RandomUtils {

    /**
     *
     * @Title: getAge
     * @Description:产生[min,max]之间的随机整数
     * @return int
     *
     */
    public static int nextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }
}
