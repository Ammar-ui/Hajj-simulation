import java.util.Calendar;

public class PDateTest {

    public static void main(String[] args){
        PDate timeMan = new PDate();
        timeMan.step(Calendar.MINUTE, 120);
        System.out.println(timeMan.getStartTime());
        System.out.println(timeMan.getEndTime());
        System.out.println(timeMan.getCurrentTime());
    }

    private void test1(){
        PDate date = new PDate();
        int unit = Calendar.SECOND;
        int value = 1;
        System.out.printf("Start:\n" +
                "%s\n" +
                "End:\n" +
                "%s\n" +
                "Now: %s\n", date.getStartTime(), date.getEndTime(), date.getCurrentTime());
        while (!date.isEnded()){
            date.step(unit, value);
            System.out.printf("%s\r",date.getCurrentTime());
        }
    }
}
