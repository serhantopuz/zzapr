package Week06;

public class Animal {
    private String name, furColor, gender, sound;
    private int age;

    public Animal(String name, int age, String furColor, String gender) {
        this.name = name;
        this.age = age;
        this.furColor = furColor;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    @Override
    public String toString() {
        String text = "";
        text += ", Name: " + this.name + ", Gender: " + this.gender + ", Fur Color: " + this.furColor + ", Age: " + this.age +" yrs.";

        return text;
    }
}
