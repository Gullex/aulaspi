package IFRN.PI.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import IFRN.PI.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
