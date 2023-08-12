package Homework18_Advanced_2.Homework18_Advanced_2;

import java.util.List;

@Controller
@RequestMapping("/participants")
public class App {
    @Autowired
    private ParticipantService participantService;

    @RequestMapping("/list")
    public ModelAndView listParticipants() {
        List<Participant> participants = participantService.getAllParticipants();
        return new ModelAndView("participant/list", "participants", participants);
    }
}

