package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Meeting;

import javax.servlet.http.HttpServletRequest;

@Controller
public class meetingController {
    @Autowired
    Meeting meeting;

    @RequestMapping("/meeting.do")
    public String meeting(HttpServletRequest request){
        request.setAttribute("meeting",meeting);
        return "index";
    }
}
