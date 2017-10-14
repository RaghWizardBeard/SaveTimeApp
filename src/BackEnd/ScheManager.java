package BackEnd;

import DataClasses.Appointment;
import Utilities.DatabaseUtil;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.*;

public class ScheManager {

GregorianCalendar Scheduler = new GregorianCalendar();
DatabaseUtil Bently = new DatabaseUtil();

public void addAppointment(Appointment newApp)
    {
       //Puts appointment into database
    }
public Appointment getAppointment(int apntNum)
    {
        Appointment requested = new Appointment();
        requested = Bently.getAppointment(apntNum);
        //query to database for apntNum assigns requested

        return requested;
    }
public void delAppointment(int delApnt)
    {
        //sends del to dataBase to Del appointment using num
    }

public List<Appointment> apntList(Date start, Date end)
    {
        List<Appointment> apntList = new ArrayList<>();
        //passes dates to populate arrayList Of appointments

        //apntList = Bently.getApntList(start , end);

        return apntList;
    }


    //For passing first day into a calender view?
public int passFirstDayOfWeek()
{
    int firstDay = Scheduler.getFirstDayOfWeek();

    return firstDay;
}


}