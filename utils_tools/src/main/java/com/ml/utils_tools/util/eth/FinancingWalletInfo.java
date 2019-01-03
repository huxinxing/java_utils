package com.ml.utils_tools.util.eth;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class FinancingWalletInfo implements Serializable {
	private static final long serialVersionUID = 1064792812673627238L;

    private Integer id;

    private Date createTime;//创建时间

    private String financingUuid;//项目唯一标示

    private Integer walletType;//钱包类型

    private Integer walletLevel;//钱包级别

    private String token;//钱包地址

    private Integer status;//状态（1：生效；0：失效）

    private byte[] fileByte;//导入项目地址签名文件

    private String tokenIndex;//钱包地址索引号


}
