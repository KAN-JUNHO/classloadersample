package me.junhoship;


public class Moim {

    int maxNumberOfAttendees;

    int numberOfEnrolloment;

    public boolean isEnrollmentFull(){
        if (maxNumberOfAttendees==0){
            return false;
        }
        if (numberOfEnrolloment<maxNumberOfAttendees){
            return false;
        }
        return true ;
    }
}
