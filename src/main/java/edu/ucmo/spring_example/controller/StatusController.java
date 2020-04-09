package edu.ucmo.spring_example.controller;

import edu.ucmo.spring_example.dao.CarDao;
import edu.ucmo.spring_example.dao.MeetingDao;
import edu.ucmo.spring_example.dao.UserDao;
import edu.ucmo.spring_example.model.Meeting;
import edu.ucmo.spring_example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

@Controller
public class StatusController {

    @Autowired
    private MeetingDao meetingDao;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/status/{name}")
    public String status(@PathVariable String name) {
        // Get the user id that is logged in?
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserName = authentication.getName();
            Meeting meeting = meetingDao.findByName(name);
            User user = userDao.findByUserName(currentUserName);
            Set<Meeting> meetings = user.getMeetings();
            meetings.add(meeting);
            user.setMeetings(meetings);
            userDao.save(user);
        }
        else {
            System.out.println("Error - No One Logged In");
        }

        return "status";
    }
}
