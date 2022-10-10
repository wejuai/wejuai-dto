package com.wejuai.dto.response;

import com.wejuai.entity.mysql.User;

/**
 * @author ZM.Wang
 * 所有键值对相关
 */
public class KeyValue {

    private String key;
    private Object value;

    public KeyValue(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public KeyValue(User user) {
        this.key = user.getId();
        this.value = user.getNickName();
    }

    KeyValue() {
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
