package dev.mission.exec;

import org.springframework.stereotype.Controller;
import dev.mission.repository.MissionRepository;
import java.time.LocalDate;
import dev.mission.entite.Mission;

@Controller
public class RechercherMissionParDateDebut implements Runnable {
	private MissionRepository missionRepository;

	public RechercherMissionParDateDebut(dev.mission.repository.MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		LocalDate dateDebutRecherche = LocalDate.of(2019, 1, 1);
		Mission m = this.missionRepository.findByDateDebut(dateDebutRecherche);
		System.out.println(m.getId()+"-" + m.getDateDebut()+"-"+m.getDateFin()+"-"
				+m.getTauxJournalier());
	}
}
