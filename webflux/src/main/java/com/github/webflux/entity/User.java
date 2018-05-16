package com.github.webflux.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author liuyuhu
 * @date 2018/5/16 下午6:06
 */

@Data
@Accessors(chain = true)
public class User {

    private String userName;

    private String company;
}
