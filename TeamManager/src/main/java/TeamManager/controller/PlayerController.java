package TeamManager.example.teammanager.controller;

import TeamManager.example.teammanager.service.PlayerService;
import TeamManager.example.teammanager.entity.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService thePlayerService){
        playerService = thePlayerService;
    }

@GetMapping("/list")

    public String listPlayers(Model theModel) {
        //add players to list from DB
    List<Player> thePlayers = playerService.findAll();
        //add players list to the model for thymeleaf to access
    theModel.addAttribute("players", thePlayers);

    return "list-players";


}


@GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
    System.out.println("test");
        //create model attribute to bind form data
    Player thePlayer = new Player();

    theModel.addAttribute("player", thePlayer);

    return "player-form";

}

@GetMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("playerId") int theId,Model theModel) {

        //get the player from the service
    Player thePlayer = playerService.findById(theId);
        // set player in the model to prepopulate the form
   theModel.addAttribute("player", thePlayer);
        // send over to our form
    return"player-form";

}



@PostMapping("/save")
    public String savePlayer(@ModelAttribute("player") Player thePlayer) {
        //save the player
    playerService.save(thePlayer);

        //re direct to player list
    return "redirect:/list";

}

    @GetMapping("/delete")
    public String delete(@RequestParam("playerId") int theId) {
        //save the player

        playerService.deleteById(theId);

        //redirect to players list
        return "redirect:/list";

    }



}
