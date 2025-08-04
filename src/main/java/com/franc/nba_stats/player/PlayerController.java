package com.franc.nba_stats.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<?> getPlayers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Long teamId,
            @RequestParam(required = false) Long playerId,
            @RequestParam(required = false) String team
    ) {
        if (playerId != null) {
            return playerService.findPlayerById(playerId)
                    .map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
        } else if (name != null) {
            return ResponseEntity.ok(playerService.getPlayersByName(name));
        } else if (teamId != null) {
            return ResponseEntity.ok(playerService.findPlayersByTeamId(teamId));
        } else if (team != null) {
            return ResponseEntity.ok(playerService.getPlayersFromTeam(team));
        }  else {
            return ResponseEntity.ok(playerService.getPlayers());
        }
    }

    @PostMapping
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player newPlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(newPlayer,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        Player updatedPlayer = playerService.updatePlayer(player);
        if (updatedPlayer != null) {
            return new ResponseEntity<>(updatedPlayer,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{playerId}")
    public ResponseEntity<String> deletePlayer(@PathVariable Long playerId) {
        playerService.deletePlayer(playerId);
        return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
    }
}
