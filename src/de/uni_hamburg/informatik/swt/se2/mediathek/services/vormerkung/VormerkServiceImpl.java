package de.uni_hamburg.informatik.swt.se2.mediathek.services.vormerkung;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde;
import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.services.AbstractObservableService;

import java.util.*;

public class VormerkServiceImpl extends AbstractObservableService
        implements VormerkService
{
    private Map<Medium, Queue<Kunde>> _vormerkungen;

    public VormerkServiceImpl()
    {
        _vormerkungen = new HashMap<>();
    }

    @Override
    public void merkeVor(Kunde kunde, List<Medium> medien)
    {
        for (Medium medium : medien)
        {
            Queue<Kunde> vormerker = _vormerkungen.getOrDefault(medium, new LinkedList<>());
            if (vormerker.size() < 3)
            {
                vormerker.add(kunde);
                _vormerkungen.put(medium, vormerker);
            }
        }

        informiereUeberAenderung();
    }

    @Override
    public void entferneVormerkung(Kunde kunde, List<Medium> medien)
    {
        for (Medium medium : medien)
        {
            Queue<Kunde> vormerker = _vormerkungen.get(medium);
            if (vormerker != null && vormerker.contains(kunde))
            {
                vormerker.remove(kunde);
                _vormerkungen.put(medium, vormerker);
            }
        }

        informiereUeberAenderung();
    }

    @Override
    public Queue<Kunde> getVormerkerFuer(Medium medium)
    {
        return _vormerkungen.getOrDefault(medium, new LinkedList<>());
    }

    @Override
    public List<Medium> getVorgemerkteMedienFuer(Kunde kunde)
    {
        List<Medium> vorgemerkteMedien = new ArrayList<>();

        for (Medium medium : _vormerkungen.keySet())
        {
            if (_vormerkungen.get(medium).contains(kunde))
            {
                vorgemerkteMedien.add(medium);
            }
        }

        return vorgemerkteMedien;
    }

    @Override
    public boolean istVorgemerkt(Medium medium)
    {
        Queue<Kunde> vormerker = _vormerkungen.get(medium);

        return vormerker != null && vormerker.size() > 0;
    }
}
