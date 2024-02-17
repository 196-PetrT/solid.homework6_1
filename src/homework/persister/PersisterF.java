package homework.persister;

public class PersisterF extends User implements Persister {
    private String name;
    private PersisterF persisterF;

    public PersisterF(String name) {
        super(name);
    }

    @Override
    public String getName() {

        return name;
    }


//    public void save(){ //  метод передачи в абстрактную среду
//        System.out.println("Save user: " + user.getName());
//    }



    @Override
    public void save() {
        System.out.println("Save user: " + name);
    }

    @Override
    public Object create(Object o) {
        return o;
    }
}