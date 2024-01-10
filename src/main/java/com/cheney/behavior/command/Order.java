package com.cheney.behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 19:29
 * @注释
 */
public class Order {
    // 订单
    private long ID;
    // 用来存储餐名并记录份数
    private Map<String, Integer> foodDic = new HashMap<String, Integer>();

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, int num) {
        foodDic.put(name,num);
    }
}
