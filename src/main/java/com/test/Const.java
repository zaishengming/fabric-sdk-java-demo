package com.test;

import java.net.URISyntaxException;

/**
 * @author newonexd
 * @ClassName Const
 * Description 常量信息
 * @date 2019-12-28 11:05
 * @Version 1.0
 */
public final class Const {

    public static String BASE_PATH;

    /*使用java类加载器，报异常java.nio.file.InvalidPathException 需要加上截取方法  */
    static {
        try {
            BASE_PATH = Const.class.getClassLoader().getResource("").toURI().getPath().substring(1);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static final String PEER0_ORG1_DOMAIN_NAME = "peer0.org1.example.com";

    public static final String PEER0_ORG2_DOMAIN_NAME = "peer0.org2.example.com";

    public static final String PEER0_ORG1_HOST = "grpcs://10.5.181.186:7051";

    public static final String PEER0_ORG2_HOST = "grpcs://10.5.181.186:9051";

    public static final String PEER0_ORG1_TLS_DIR = "crypto-config/peerOrganizations/org1.example.com/tlsca/tlsca.org1.example.com-cert.pem";

    public static final String PEER0_ORG2_TLS_DIR = "crypto-config/peerOrganizations/org2.example.com/tlsca/tlsca.org2.example.com-cert.pem";

    public static final String ORDERER_DOMAIN_NAME = "orderer.example.com";

    public static final String ORDERER_TLS_DIR = "crypto-config/ordererOrganizations/example.com/orderers/orderer.example.com/tls/ca.crt";

    public static final String ORDERER_HOST = "grpcs://10.5.181.186:7050";

    public static final String CHANNEL_NAME = "mychannel";

    public static final String CHAINCODE_NAME = "mycc";


    public static final String USER_MSP_ID="Org1MSP";

    public static final String USER_AFFILIATION="org1";

    public static final String USER_KEY_FILE = "crypto-config/peerOrganizations/org1.example.com/users/Admin@org1.example.com/msp/keystore/priv_sk";

    public static final String USER_CERT_FILE = "crypto-config/peerOrganizations/org1.example.com/users/Admin@org1.example.com/msp/signcerts/Admin@org1.example.com-cert.pem";

}
