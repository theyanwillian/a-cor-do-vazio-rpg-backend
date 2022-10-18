package br.com.acordovaziobackend.controller;

import br.com.acordovaziobackend.exception.ResourceNotFoundException;
import br.com.acordovaziobackend.model.Team;
import br.com.acordovaziobackend.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public List<Team> getAllTeams(Sort sort){
        return teamRepository.findAll(sort);
    }

    @PostMapping("/teams")
    public Team createTeam(@RequestBody Team team) {
        return teamRepository.save(team);
    }

    @PutMapping("/teams")
    public ResponseEntity<Team> updateTeam(@RequestBody Team team){
        Team updatedTeam = teamRepository.save(team);
        return ResponseEntity.ok(updatedTeam);
    }

    @GetMapping("/teams/{id}")
    public ResponseEntity<Team> getTeamById(@PathVariable Long id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Team not exist with id :" + id));
        return ResponseEntity.ok(team);
    }

    @DeleteMapping("/teams/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteTeam(@PathVariable Long id){
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Team not exist with id :" + id));

        teamRepository.delete(team);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
