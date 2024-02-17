package homework;

import homework.persister.PersisterF;

public class Main{
    public static void main(String[] args){
        PersisterF user1 =  new PersisterF("Bob");
//        user1.report("Bob");
        user1.save();
    }
}