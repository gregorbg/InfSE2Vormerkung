package de.uni_hamburg.informatik.swt.se2.mediathek.services.vormerkung;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde;
import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.services.ObservableService;

import java.util.List;
import java.util.Queue;

public interface VormerkService extends ObservableService
{
    void merkeVor(Kunde kunde, List<Medium> medien);

    void entferneVormerkung(Kunde kunde, List<Medium> medien);

    Queue<Kunde> getVormerkerFuer(Medium medium);

    List<Medium> getVorgemerkteMedienFuer(Kunde kunde);

    boolean istVorgemerkt(Medium medium);
}
