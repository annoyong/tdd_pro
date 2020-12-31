package com.cn;
/**
 * @author yongruli
 *
 * CreateTimr 2020-12-31
 */
public class Box {
    /** 宝箱编号 */
    private String boxID;
    /** 宝箱哈希值 */
    private String hash;
    /** 上一个宝箱hash值*/
    private String preHash;
    /** 神秘数字 */
    private String secretNum;

    public Box(String boxID, String hash, String preHash, String secretNum) {
        this.boxID = boxID;
        this.hash = hash;
        this.preHash = preHash;
        this.secretNum = secretNum;
    }

    public String getBoxID() {
        return boxID;
    }

    public String getHash() {
        return hash;
    }

    public String getPreHash() {
        return preHash;
    }

    public String getSecretNum() {
        return secretNum;
    }




}
