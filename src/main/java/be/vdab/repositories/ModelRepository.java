package be.vdab.repositories;

import be.vdab.domain.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hyuberuto on 07/07/15.
 */
public interface ModelRepository extends JpaRepository<CarModel,Integer> {
}
