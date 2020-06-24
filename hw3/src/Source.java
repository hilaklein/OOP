public class Source {

    private Integer abilityCooldwon;
    private Integer remainingCooldown;

    public Source(Integer abilityCL){
        this.abilityCooldwon = abilityCL;
        this.remainingCooldown = abilityCooldwon;

    }
    public void setAbilityCooldwon(Integer abilityCooldwon) {
        this.abilityCooldwon = abilityCooldwon;
    }

    public void setRemainingCooldown(Integer remainingCooldown) {
        this.remainingCooldown = remainingCooldown;
    }

    public Integer getRemainingCooldown() {
        return remainingCooldown;
    }

    public Integer getAbilityCooldwon(){
        return abilityCooldwon;
    }
}
