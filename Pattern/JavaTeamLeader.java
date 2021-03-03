package Pattern;

public class JavaTeamLeader extends DeveloperDecorator {
    public JavaTeamLeader(Developer developer) {
        super(developer);
    }

    public String sendReport(){
        return "Send week report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + sendReport();
    }
}
