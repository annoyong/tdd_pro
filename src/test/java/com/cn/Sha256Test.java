package com.cn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 *
 * CreateTime 2020-12-31
 */
public class Sha256Test {

    /**
     *    Test
     *    测试通过Sha256算法成功获取hash值
     */
    @Test
    public void shoul_return_hash_when_use_Sha256() {
        //given
        String boxID = "1";
        String preHash = "1";
        String sectetNum = "78699";
        String expect = "65bd9c747e5ef2147d321716bc673b69e465d3c5b85f74d809d0578253360f8d";

        //when
        String actural = Sha256.getSHA256(boxID+preHash+sectetNum);

        //then
        assertEquals(expect,actural);

    }
}