package homework.persister;

public abstract class User{
    private String name;
//    User user = new User();

    public User(String name){
        this.name = name;
    }

    public abstract String getName();
    }

//    public void save(){
//        PersisterF persister = new PersisterF(this);
//        persister.save();
//    }

//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
//}