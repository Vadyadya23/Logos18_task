package Homework18_Advanced_2.Homework18_Advanced_2;

import java.util.List;

public interface ParticipantDao {
 Participant getById(Long id);
 List<Participant> getAll();
 void save(Participant participant);
 void update(Participant participant);
 void delete(Long id);
}



