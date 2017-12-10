package com.example.user.mid_project;

import android.support.annotation.NonNull;

/**
 * Created by user on 07-12-2017.
 */

//Task class to store the information by implementing Comparable interface to compare object at time of sorting.
public class Task implements Comparable<Task>
{

    //parameters of Task object
    public int mid;
    public String mtitle;
    public String mdescription;
    public String mdate;
    public int mstatus;

    //setter and getter methods to set and get the data of task object

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMdescription() {
        return mdescription;
    }

    public void setMdescription(String mdescription) {
        this.mdescription = mdescription;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public int getMstatus() {
        return mstatus;
    }

    public void setMstatus(int mstatus) {
        this.mstatus = mstatus;
    }

    //Method to compare current object and another object of similar kind.
    @Override
    public int compareTo(@NonNull Task task)
    {
        //Spliting the Strings into String arrays.
        String[] currentObj = this.mdate.split("/");
        String[] passedObj = task.mdate.split("/");

        //Seperating the day,month and year from String Array.
        int currentDay=Integer.parseInt(currentObj[0]);
        int currentMonth=Integer.parseInt(currentObj[1]);
        int currentYear=Integer.parseInt(currentObj[2]);

        //Seperating the day,month and year from String Array.
        int passedDay=Integer.parseInt(passedObj[0]);
        int passedMonth=Integer.parseInt(passedObj[1]);
        int passedYear=Integer.parseInt(passedObj[2]);

        //Comparing parameters and returning values according to it.
        if(currentYear < passedYear)
            return -1;
        else if(currentYear > passedYear)
            return 1;
        else if(currentYear == passedYear && currentMonth < passedMonth)
            return -1;
        else if(currentYear == passedYear && currentMonth > passedMonth)
            return 1;
        else if(currentYear == passedYear && currentMonth == passedMonth && currentDay < passedDay)
            return -1;
        else if(currentYear == passedYear && currentMonth == passedMonth && currentDay > passedDay)
            return 1;

        //returing 0 if both dates are same
        return 0;
    }
}
