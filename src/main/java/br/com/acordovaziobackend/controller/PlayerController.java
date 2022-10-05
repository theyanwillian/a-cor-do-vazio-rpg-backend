package br.com.acordovaziobackend.controller;

import br.com.acordovaziobackend.dto.PlayerDTO;
import br.com.acordovaziobackend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    @GetMapping("/players")
    public ResponseEntity<List<PlayerDTO>> getAllPlayers(Sort sort){
        List<PlayerDTO> players = playerService.getAllPlayers(sort);
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
        return ResponseEntity.ok().headers(headers).body(players);
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
