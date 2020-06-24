public class Health {
    private Integer healthPool;
    private Integer healthAmount;

    public Health(Integer hPool, Integer hAmount) {
        this.healthPool = hPool;
        this.healthAmount = hAmount;
    }

    public Integer getHealthPool(){
        return this.healthPool;
    }

    public Integer getHealthAmount(){
        return this.healthAmount;
    }

    public void setHealthPool(Integer hPool){
        this.healthPool = hPool;
    }

    public void setHealthAmount(Integer hAmount){ /////////////////////?????????????????
        this.healthAmount = Math.min(hAmount, this.healthPool);
    }
}
