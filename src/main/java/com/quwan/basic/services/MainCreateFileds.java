package com.quwan.basic.services;

import com.quwan.basic.common.utils.FileReadUtil;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class MainCreateFileds {

    public static void main(String[] args) {
        String fileName="/Users/gaoshiliang/gitjob/quwan/src/main/resources/fileds";
        String outPutFile = "/Users/gaoshiliang/gitjob/quwan/src/main/resources/output";
        FileReadUtil.readFileByLinesB(fileName,outPutFile);
    }

}
