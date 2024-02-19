package homework.core;

public  class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
//    public void save(){
//        PersisterF persister = new PersisterF(this);
//        persister.save();
//    }

//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
}