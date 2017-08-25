package com.burakyagdiran2.Service;
import com.burakyagdiran2.Dao.MeetingDao;
import com.burakyagdiran2.Entity.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MeetingService {

    @Autowired
    private MeetingDao meetingDao;

    public Collection<Meeting> getAllMeetings(){

        return meetingDao.getAllMeeting();
    }

    public Meeting getMeetingById(int m_id){

        return this.meetingDao.getMeetingById(m_id);
    }

    public void deleteMeetingById (int m_id){

        this.meetingDao.deleteMeetingById(m_id);
    }

    public void updateMeeting(Meeting meeting){

        this.meetingDao.updateMeeting(meeting);
    }

    public void createMeeting(Meeting meeting){

        this.meetingDao.createMeeting(meeting);
    }
}
