public class Cat1 {
    private String color;
    private String mood;

    //public constructor
    public Cat1(String color, String mood){
        //this refers current instance of class
        this.color = color;
        this.mood = mood;

    }
    //public method to access the private field color and mood
    public String getColor(){
        return color;
    }
    public String getMood(){
        return mood;
    }
    //private method only accessible within the class
    private void changeMood(String newMood){
        mood = newMood;
    }

    public void purr(){
        System.out.println("Cat purrs");
    }

    public void makeHappy(){
        changeMood("happy");
        purr();
    }

    public static void main(String[] args){
        Cat1 myCat = new Cat1("black", "active");
        System.out.println("This cat is " + myCat.getColor() + " and feels " + myCat.getMood());
        myCat.makeHappy();
    }
}
