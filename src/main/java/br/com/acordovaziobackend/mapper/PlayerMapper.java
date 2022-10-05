package br.com.acordovaziobackend.mapper;

import br.com.acordovaziobackend.dto.PlayerDTO;
import br.com.acordovaziobackend.model.Player;
import org.mapstruct.Mapper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface PlayerMapper extends EntityMapper<PlayerDTO, Player> {

    PlayerDTO toDto(Player player);

    default List<PlayerDTO> toDto(List<Player> players) {
        if (players == null) {
            return Collections.emptyList();
        }
        return players.stream().map(this::toDto).collect(Collectors.toList());
    }

    Player toEntity(PlayerDTO playerDTO);

    default Player fromId(Long id) {
        if (id == null) {
            return null;
        }
        Player player = new Player();
        player.setId(id);
        return player;
    }
}
