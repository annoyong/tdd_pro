package com.cn;
/**
 * @author yongruli
 *
 * CreateTimr 2020-12-31
 */
public class Box {
    private String boxID;
    private String hash;
    private String preHash;
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
