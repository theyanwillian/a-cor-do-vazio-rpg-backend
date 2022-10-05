package br.com.acordovaziobackend.service;

import br.com.acordovaziobackend.dto.PlayerDTO;
import br.com.acordovaziobackend.mapper.PlayerMapper;
import br.com.acordovaziobackend.model.Player;
import br.com.acordovaziobackend.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class PlayerService {

    private PlayerRepository playerRepository;

    private PlayerMapper playerMapper;

    @Transactional(readOnly = true)
    public List<PlayerDTO> getAllPlayers (Sort sort) {
        List<Player> players = playerRepository.findAll(sort);
        return playerMapper.toDto(players);
    }
}
