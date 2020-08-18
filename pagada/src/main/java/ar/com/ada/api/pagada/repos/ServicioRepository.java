package ar.com.ada.api.pagada.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.com.ada.api.pagada.entities.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

    @Query("Select s from Servicio s where s.empresa.empresaId = :empresaId") // JPQL
    // @Query(value = "Select * from servicio where s.empresa_id = ?", nativeQuery =
    // true)

    List<Servicio> findAllEmpresaId(Integer empresaId);

    @Query("Select s from Servicio s where s.empresa.empresaId = :empresaId and s.estadoId = 0") // JPQL, en este caso,
                                                                                                 // 0 es PENDIENTE

    List<Servicio> findAllPendientesEmpresaId(Integer empresaId);

    @Query("select s from Servicio s where s.empresa.empresaId = :empresaId and s.deudor.deudorId = :deudorId and s.estadoId = 0")

    public List<Servicio> findAllPendientesPorDeudorIdyEmpresaId(Integer empresaId, Integer deudorId);

    @Query("select s from Servicio s where s.empresa.empresaId = :empresaId and s.deudor.deudorId = :deudorId")

    public List<Servicio> findAllPorDeudorIdyEmpresaId(Integer empresaId, Integer deudorId);

    @Query("select s from Servicio s where s.codigoBarras = :codigoBarras")

    public List<Servicio> findAllByCodigoBarras(String codigoBarras);

    public Servicio findByServicioId(Integer servicioId);

}