package homework.core.impl.cloud;

import homework.core.Persister;
import homework.core.User;

public class PersisterCloud implements Persister {
    private final User user;

    public PersisterCloud(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user in cloud: " + user.getName());
    }

}