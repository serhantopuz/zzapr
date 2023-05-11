package Week06;

public class Dog extends Animal{
    private String kind;
    public Dog(String name, int age, String furColor, String gender) {
        super(name, age, furColor, gender);
        super.setSound("Hrr Hrr");
        this.kind = "Dog";
    }

    public String getKind(){
        return this.kind;
    }

    public void setKind(String kind){
        this.kind = kind;
    }



    @Override
    public String toString() {
        String text = "";
        text += "Kind: " + this.kind + super.toString();
        return text;
    }
}
