package ar.com.ada.api.pagada.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.pagada.entities.Pago;

public interface PagoRepository  extends JpaRepository <Pago,Integer>{

   Pago findByPagoId(Integer pagoId); 
}