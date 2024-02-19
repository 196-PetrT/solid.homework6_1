package homework;

import homework.core.impl.cloud.PersisterCloud;
import homework.core.impl.ReportPrint;
import homework.core.User;

public class Main{
    public static void main(String[] args){
        User user1 =  new User("Bob");
        PersisterCloud persisterCloud = new PersisterCloud(user1);
        ReportPrint reportPersisterCloud = new ReportPrint();
        reportPersisterCloud.report(user1);
        persisterCloud.save();
    }
}