package de.uni_hamburg.informatik.swt.se2.mediathek.materialien;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;

public class VormerkKarte
{
    private Kunde _kunde;
    private Medium _medium;

    public VormerkKarte(Kunde kunde, Medium medium)
    {
        this._kunde = kunde;
        this._medium = medium;
    }

    public Kunde getKunde()
    {
        return _kunde;
    }

    public Medium getMedium()
    {
        return _medium;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof VormerkKarte)
        {
            VormerkKarte other = (VormerkKarte) obj;
            return other._kunde.equals(_kunde) && other._medium.equals(_medium);
        } else return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((_kunde == null) ? 0 : _kunde.hashCode());
        result = prime * result
                + ((_medium == null) ? 0 : _medium.hashCode());
        result = prime * result + ((_medium == null) ? 0 : _medium.hashCode());
        return result;
    }
}
