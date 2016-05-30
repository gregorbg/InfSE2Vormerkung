package de.uni_hamburg.informatik.swt.se2.mediathek.services.vormerkung;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde;
import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;

import java.util.List;
import java.util.Queue;

public interface VormerkService
{
    void merkeVor(Kunde kunde, List<Medium> medien);

    boolean istVormerkenMoeglich(Kunde kunde, List<Medium> medien);

    Queue<Kunde> getVormerkerFuer(Medium medium);

    List<Medium> getVorgemerkteMedienFuer(Kunde kunde);

    boolean istVorgemerkt(Medium medium);
}
