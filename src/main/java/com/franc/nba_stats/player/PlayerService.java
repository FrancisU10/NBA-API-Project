package com.franc.nba_stats.player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;
    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }
    public List<Player> getPlayersFromTeam(String teamAbbreviation) {
        return playerRepository.findAll().stream()
                .filter(p -> teamAbbreviation.equals(p.getTeamAbbreviation()))
                .collect(Collectors.toList());
    }

    public List<Player> findPlayersByTeamId(Long teamId) {
        return playerRepository.findAll().stream()
                .filter(p -> teamId.equals(p.getTeamId()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String searchText) {
        return playerRepository.findAll().stream()
                .filter(p -> p.getPlayerName().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Optional<Player> findPlayerById(Long playerId) {
        return playerRepository.findById(playerId);
    }

    public Player addPlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player updatedPlayer) {
        Optional<Player> existingPlayer = playerRepository.findById(updatedPlayer.getPlayerId());
        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setPlayerName(updatedPlayer.getPlayerName());
            playerToUpdate.setTeamId(updatedPlayer.getTeamId());
            playerToUpdate.setTeamAbbreviation(updatedPlayer.getTeamAbbreviation());
            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
       return null;
    }

    @Transactional
    public void deletePlayer(Long playerId) {
        playerRepository.deleteById(playerId);
    }
}
