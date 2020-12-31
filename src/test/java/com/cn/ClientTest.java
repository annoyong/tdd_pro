package com.cn;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
/**
 * @author yongruli
 *
 * CreateTimr 2020-12-31
 */
public class ClientTest {

    /**
     *
     * 测试获取第一个宝箱的神秘数字
     */
    @Test
    public void should_returen_secret_num_when_box_is_one() {
        //given
        Client client = new Client();
        int expect = 3229170;
        //when
        int actual = client.getSecretNum("1","0");

        //then
        assertEquals(expect,actual);
    }

    /**
     *
     * 获取所有宝箱的神秘数字
     */
    @Test
    public void should_returen_secret_num_when_find_all_box() {
        //given
        Client client = new Client();
        int[] expect ={3229170, 1135497, 2125891, 3041721, 179272, 1295904, 395138, 1871275, 99911, 1695112};
        //when
        int[] actual = client.findAllSecretNum();

        //then
        assertArrayEquals(expect,actual);
    }
}