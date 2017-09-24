package DataClasses;

import java.sql.Time;
import java.util.Date;

public class Appointment
{
    private boolean accepted ;
    private boolean canceled ;
    private String Username;
    private Date date;
    private Time timeStart;
    private Time timeStop;
    private int appointmentNum;
    private int professionalPhoneNum;
    private int clientPhoneNum;

    public Appointment(boolean accepted, boolean canceled, String username, Date date, Time timeStart, Time timeStop, int appointmentNum,
             int professionalPhoneNum, int clientPhoneNum)
    {
        this.accepted = accepted;
        this.canceled = canceled;
        Username = username;
        this.date = date;
        this.timeStart = timeStart;
        this.timeStop = timeStop;
        this.appointmentNum = appointmentNum;
        this.professionalPhoneNum = professionalPhoneNum;
        this.clientPhoneNum = clientPhoneNum;
    }

    @Override

    public String toString()
    {
        return "appointment{" +
                "accepted=" + accepted +
                ", canceled=" + canceled +
                ", Username='" + Username + '\'' +
                ", date=" + date +
                ", timeStart=" + timeStart +
                ", timeStop=" + timeStop +
                ", appointmentNum=" + appointmentNum +
                ", professionalPhoneNum=" + professionalPhoneNum +
                ", clientPhoneNum=" + clientPhoneNum +
                '}';
    }

    private boolean isAccepted()
    {
        return accepted;
    }

    private void setAccepted(boolean accepted)
    {
        this.accepted = accepted;
    }

    private boolean isCanceled() {
        return canceled;
    }

    private void setCanceled(boolean canceled)
    {
        this.canceled = canceled;
    }

    private String getUsername()
    {
        return Username;
    }

    private void setUsername(String username)
    {
        Username = username;
    }

    private Date getDate()
    {
        return date;
    }

    private void setDate(Date date)
    {
        this.date = date;
    }

    private Time getTimeStart()
    {
        return timeStart;
    }

    private void setTimeStart(Time timeStart)
    {
        this.timeStart = timeStart;
    }

    private Time getTimeStop()
    {
        return timeStop;
    }

    private void setTimeStop(Time timeStop)
    {
        this.timeStop = timeStop;
    }

    private int getAppointmentNum()
    {
        return appointmentNum;
    }

    private void setAppointmentNum(int appointmentNum)
    {
        this.appointmentNum = appointmentNum;
    }

    private int getProfessionalPhoneNum()
    {
        return professionalPhoneNum;
    }

    private void setProfessionalPhoneNum(int professionalPhoneNum)
    {
        this.professionalPhoneNum = professionalPhoneNum;
    }

    private int getClientPhoneNum()
    {
        return clientPhoneNum;
    }

    private void setClientPhoneNum(int clientPhoneNum)
    {
        this.clientPhoneNum = clientPhoneNum;
    }
}
