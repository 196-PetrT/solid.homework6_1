package homework.persister;

public interface Persister extends UserRegistration {
    void save();

    @Override
    String getName();

}
