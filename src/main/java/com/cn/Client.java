package com.cn;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author yongruli
 *
 * CreateTimr 2020-12-31
 */
public class Client {
    private static final String BOXONE = "1";
    private static final String ZERO = "0";

    public int[] findAllSecretNum(){
        int[ ] array = new int[10];
        List<Box> list = new ArrayList<Box>(16);
        for(int i = 1; i<=10;i++){
            String preHash = i==1?"0":list.get(i-2).getHash();
            int secretNum = getSecretNum(String.valueOf(i),preHash);
            String hash = getHash(String.valueOf(i),preHash,String.valueOf(secretNum));
            Box newBox = new Box(String.valueOf(i),hash,preHash,String.valueOf(secretNum));
            list.add(newBox);
            array[i-1]=secretNum;
        }
        return array;
    }

    /**
     *
     * @param boxId
     * @param preHash
     * @param secretNum
     * @return 获取当前宝箱hash
     */
    private String getHash(String boxId, String preHash, String secretNum) {
        return Sha256.getSHA256(boxId+preHash+secretNum);
    }


    /**
     * 找到一个球神秘数字
     * @return
     */
    public int getSecretNum(String boxid,String preHash){

        String box1 = boxid + preHash;
        boolean findFlag = true;
        int secretNum = 10000;
        while (findFlag) {
            String response = Sha256.getSHA256(box1+secretNum);
            if(response.substring(0,5).equals("00000")){
                System.out.println("找到神秘数字:"+ secretNum);
                findFlag = false;
            }
            secretNum++;
        }
        return secretNum;

    }


}
