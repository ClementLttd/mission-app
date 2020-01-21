package dev.mission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.mission.entite.Mission;
import java.time.LocalDate;

public interface MissionRepository extends JpaRepository<Mission, Integer> {

	Mission findByDateDebut(LocalDate dateDebut);
}