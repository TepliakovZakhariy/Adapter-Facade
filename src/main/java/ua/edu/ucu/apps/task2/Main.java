package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Auth auth = new Auth();
        if (auth.authenticate(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
