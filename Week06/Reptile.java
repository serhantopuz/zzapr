package Week06;

public class Reptile extends Animal{
    private boolean isColdBlooded;

    public Reptile(String name, int age, boolean isColdBlooded) {
        super(name, age);
        this.isColdBlooded = isColdBlooded;
        super.setSpecies("Reptile");
    }

    public boolean getIsColdBlooded() {
        return isColdBlooded;
    }

    public void setIsColdBlooded(boolean isColdBlooded) {
        this.isColdBlooded = isColdBlooded;
    }


}
