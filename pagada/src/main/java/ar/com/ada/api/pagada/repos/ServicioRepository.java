package ar.com.ada.api.pagada.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.pagada.entities.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {
    
}