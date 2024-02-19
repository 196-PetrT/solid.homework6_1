package homework.core.impl;

import homework.core.Report;
import homework.core.User;

public class ReportPrint implements Report {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());

    }
}
