package com.rhb.first.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author rhb
 * @Date 2020/2/4
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String resultCode;

    private T date;
}
