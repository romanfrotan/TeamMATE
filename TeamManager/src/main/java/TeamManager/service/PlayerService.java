package TeamManager.example.teammanager.service;

import TeamManager.example.teammanager.entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();

    Player findById(int theId);

    Player save(Player thePlayer);

    void deleteById(int theId);

}
