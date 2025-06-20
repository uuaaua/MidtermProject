public abstract class Character implements Creature{
    String name;
    int hp;

    //コンストラクタ
    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public abstract void attack(Character target);

    public final boolean isAlive(){
        if(hp <= 0){
            return false;
        }else {
            return true;
        }
    }
    public void showStatus(){
        System.out.println(name + ":HP " + hp);
    }
}
