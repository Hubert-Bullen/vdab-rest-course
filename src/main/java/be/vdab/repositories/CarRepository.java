package be.vdab.repositories;

import be.vdab.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Hyuberuto on 06/07/15.
 */

@Repository
public interface CarRepository extends JpaRepository<Car,Integer>{


}
