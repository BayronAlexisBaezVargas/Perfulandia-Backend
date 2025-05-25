package com.perfumeria.perfumeria_pedido.repository;

import com.perfumeria.perfumeria_pedido.model.pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PedidoRepository extends JpaRepository<pedido, Long> {

}
