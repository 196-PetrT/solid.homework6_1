package homework.persister;

import homework.persister.User;

public class ReportPrint {

    private ReportPrint note;

    public ReportPrint(ReportPrint note) {
        this.note = note;
    }

    public void report(String name){
        System.out.println("Report for user: " + name);
    }
}
