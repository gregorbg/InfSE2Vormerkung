package de.uni_hamburg.informatik.swt.se2.mediathek.services.vormerkung;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde;
import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;

import java.util.List;
import java.util.Queue;

public class VormerkServiceImpl implements VormerkService
{
    @Override
    public void merkeVor(Kunde kunde, List<Medium> medien)
    {

    }

    @Override
    public boolean istVormerkenMoeglich(Kunde kunde,
            List<Medium> medien)
    {
        return false;
    }

    @Override
    public Queue<Kunde> getVormerkerFuer(Medium medium)
    {
        return null;
    }

    @Override
    public List<Medium> getVorgemerkteMedienFuer(Kunde kunde)
    {
        return null;
    }

    @Override
    public boolean istVorgemerkt(Medium medium)
    {
        return false;
    }
}
