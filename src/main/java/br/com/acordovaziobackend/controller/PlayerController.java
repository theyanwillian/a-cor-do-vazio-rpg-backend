package br.com.acordovaziobackend.controller;

import br.com.acordovaziobackend.dto.PlayerDTO;
import br.com.acordovaziobackend.exception.ResourceNotFoundException;
import br.com.acordovaziobackend.model.Player;
import br.com.acordovaziobackend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    @GetMapping("/players")
    public ResponseEntity<List<PlayerDTO>> getAllPlayers(Sort sort){
        List<PlayerDTO> players = playerService.getAllPlayers(sort);
        return ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(players);
    }
//
//    @PostMapping("/players")
//    public Player createPlayer(@RequestBody Player player) {
//        return playerRepository.save(player);
//    }
//
//    @PutMapping("/players")
//    public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
//        Player updatedPlayer = playerRepository.save(player);
//        return ResponseEntity.ok(updatedPlayer);
//    }
//
//    @GetMapping("/players/{id}")
//    public ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
//        Player player = playerRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Player not exist with id :" + id));
//        return ResponseEntity.ok(player);
//    }
//
//    @DeleteMapping("/players/{id}")
//    public ResponseEntity<Map<String, Boolean>> deletePlayer(@PathVariable Long id){
//        Player player = playerRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Player not exist with id :" + id));
//
//        playerRepository.delete(player);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return ResponseEntity.ok(response);
//    }
}
