package Homework18_Advanced_2.Homework18_Advanced_2;

import java.util.List;

public interface ParticipantService {
    Participant getParticipantById(Long id);
    List<Participant> getAllParticipants();
    void saveParticipant(Participant participant);
    void updateParticipant(Participant participant);
    void deleteParticipant(Long id);
}
