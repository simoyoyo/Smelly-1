package smelly;

/**
 * Nell'orribile programma seguente dovrete operare come segue
 * 1) Creare opportuni test Junit
 * 2) Rifattorizzare (modificando il main di conseguenza e indicando che "puzza"
 * avete rilevato e che metodo avete scelto per risolverlo)
 * 3) Aggiungere gli opportuni Javadoc se non banali
 * @author piffy
 */
public class Smelly {
    public static void main(String[] args) {
        Solido c = new Solido();
        c.H=2.0f;
        c.r=7.f;
        c.type=1;
        c.calcola();
        System.out.println("Area di superficie:"+c.A);
        System.out.println("Volume: "+c.V);
        Solido d = new Solido();
        d.r=5.0f;
        d.H=2.0f;
        d.type=1;
        d.calcola();
        Solido e = new Solido();
        e.r=5.3f;
        e.type=2;
        e.calcola();
        Solido Birillo[] = new Solido[10];
        Birillo[1]=c;Birillo[2]=d;Birillo[3]=e;
        if (Birillo[1].V>=Birillo[2].V && Birillo[1].V>=Birillo[3].V) 
            System.out.println("Il solido con volume maggiore è al posto 1");
        else if (Birillo[2].V>=Birillo[1].V && Birillo[2].V>=Birillo[3].V) 
            System.out.println("Il solido con volume maggiore è al posto 2");
        else if (Birillo[3].V>=Birillo[1].V && Birillo[3].V>=Birillo[2].V) 
            System.out.println("Il solido con volume maggiore è al posto 3");
    }
}
