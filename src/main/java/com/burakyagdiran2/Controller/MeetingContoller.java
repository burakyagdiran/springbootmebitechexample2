package com.burakyagdiran2.Controller;


import com.burakyagdiran2.Entity.Meeting;
import com.burakyagdiran2.Service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/meetings")
public class MeetingContoller {

    @Autowired
    private MeetingService meetingService;


    @RequestMapping(method = RequestMethod.GET) // Var olan tüm toplantıları yazdırma
    public Collection<Meeting> getAllMEetings(){

        return meetingService.getAllMeetings();
    }

    @RequestMapping(value = "/{m_id}", method = RequestMethod.GET) // Id ye göre ilgili toplantının özelliklerini yazdırma
    public Meeting getMeetingById(@PathVariable("m_id") int m_id){

        return meetingService.getMeetingById(m_id);
    }

    @RequestMapping(value = "/{m_id}", method = RequestMethod.DELETE) // Toplantı silme
    public void removeMeetingById(@PathVariable("m_id") int m_id){

        meetingService.deleteMeetingById(m_id);
    }

    @RequestMapping(method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)// toplantı bilgilerini değiştirme
    public void updateMeeting(@RequestBody Meeting meeting){

        meetingService.updateMeeting(meeting);
    }

    @RequestMapping(method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)// yeni toplantı oluşturma
    public void createMeeting(@RequestBody Meeting meeting){

        meetingService.createMeeting(meeting);
    }
}
