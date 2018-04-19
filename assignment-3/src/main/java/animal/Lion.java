package animal;

public class Lion extends Animal{

    public Lion(int id, String name, boolean gender, double length, double weight, String condition, boolean health, boolean canPerform){
        super(id, name, gender, length, weight, condition, health, canPerform);
        this.type = "Lion";
    }

    public String hunt(){
        return "Err....";
    }

    public String brush(){
        return "Hauhhmm!";
    }

    public String disturb(){
        return "HAUHHMM!";
    }

}