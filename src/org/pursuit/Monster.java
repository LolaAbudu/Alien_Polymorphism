package org.pursuit;

public class Monster {
    private String food;
    private String habitat;
    private String attackWeapon;

    Monster(){}

    Monster(String food, String habitat, String attackWeapon){
        this.food = food;
        this.habitat = habitat;
        this.attackWeapon = attackWeapon;
    }

    public String getFood(){
        return food;
    }

    public String getHabitat(){
        return habitat;
    }

    public String getAttackWeapon(){
        return attackWeapon;
    }

    public void setFood(String food){
        this.food = food;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public void getAttackWeapon(String attackWeapon){
        this.attackWeapon = attackWeapon;
    }

    public void whoAmI(){
        System.out.println("I am a " + getClass().getSimpleName() + ", I live " + getHabitat() + ", and I attack with my " + getAttackWeapon());
    }


























//    private String food;
//    private String habitat;
//    private String attackWeapon;
//
//    Monster(){};
//
//    Monster (String food, String habitat, String attackWeapon){
//        this.food = food;
//        this.habitat = habitat;
//        this.attackWeapon = attackWeapon;
//
//    }
//
//    public String getFood(){
//        return food;
//    }
//    public String getHabitat(){
//        return habitat;
//    }
//    public String getAttackWeapon(){
//        return attackWeapon;
//    }
//
//    public void whoAmI(){
//        System.out.println("I am a " + getClass().getSimpleName() + ". I live" + getHabitat() + " , and I attack with my" + getAttackWeapon());
//    }
}
