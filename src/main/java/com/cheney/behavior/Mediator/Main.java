package com.cheney.behavior.Mediator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 18:40
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        // 中介公司
        MediatorCompany mediatorCompany = new MediatorCompany("王牌中介公司");

        // 实例化同事类
        HouseOwner houseOwner = new HouseOwner("马云", "杭州西溪阿里园区",mediatorCompany);
        Tenant tenant = new Tenant("马化腾", "99年", mediatorCompany);

        mediatorCompany.setTenant(tenant);
        mediatorCompany.setHouseOwner(houseOwner);

        String msg1 = mediatorCompany.constact("你的房子什么情况呀？",houseOwner);
        System.out.println("房东回复："+msg1);

        String msg2 = mediatorCompany.constact("你想租多久呀？",tenant);
        System.out.println("租客回复："+msg2);

    }
}
