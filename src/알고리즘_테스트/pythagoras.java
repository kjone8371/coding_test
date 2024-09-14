package 알고리즘_테스트;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}


public class pythagoras {

}
