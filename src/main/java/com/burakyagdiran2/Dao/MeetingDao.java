package com.burakyagdiran2.Dao;


import com.burakyagdiran2.Entity.Department;
import com.burakyagdiran2.Entity.Meeting;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MeetingDao {

    private static Map<Integer , Meeting> meetings;

    static {

        meetings = new HashMap<Integer, Meeting>(){
            {
                put(1,new Meeting(1,"Financial", "Salary","Menagement"));
                put(2,new Meeting(2,"Projects", "Timing","Menagement" + "/Software"));
            }
        };
    }

    public Collection<Meeting> getAllMeeting(){

        return this.meetings.values();
    }

    public Meeting getMeetingById(int m_id){

        return this.meetings.get(m_id);
    }


    public void deleteMeetingById(int m_id) {

        this.meetings.remove(m_id);
    }

    public void updateMeeting(Meeting meeting){

        Meeting met = meetings.get(meeting.getM_id());
        met.setM_department(meeting.getM_department());
        met.setM_description(meeting.getM_description());
        met.setM_name(meeting.getM_name());
        met.setM_id(meeting.getM_id());
        meetings.put(meeting.getM_id(),meeting);

    }

    public void createMeeting(Meeting meeting){

        this.meetings.put(meeting.getM_id(),meeting);
    }

}
