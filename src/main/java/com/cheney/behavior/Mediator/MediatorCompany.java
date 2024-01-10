package com.cheney.behavior.Mediator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 18:36
 * @注释
 */
public class MediatorCompany extends Mediator{
    private HouseOwner houseOwner;
    private Tenant tenant;
    @Override
    public String constact(String msg,Person person) {
        if(person instanceof HouseOwner){
            // 如果是房东
            return houseOwner.getMessage(msg);
        }
        if(person instanceof Tenant){
            // 如果是租客
            return tenant.getMessage(msg);
        }
        return null;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
