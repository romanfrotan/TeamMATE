package TeamManager.example.teammanager.dao;

import TeamManager.example.teammanager.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

//add method to sort by last name
public List<Player> findAllByOrderByLastNameAsc();
}
