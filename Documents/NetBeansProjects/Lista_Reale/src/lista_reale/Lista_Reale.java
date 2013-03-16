/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_reale;

/**
 *
 * @author Simone
 */
public class Lista_Reale {
    
    float r;
    Lista_Reale next;

    public Lista_Reale(float r) {
        this.r = r;
        this.next = null;
    }

    public Lista_Reale() {
    }
    
    public void Inserisci_NumR(float x)
    {
        Lista_Reale com = new Lista_Reale();
        for (com=this;com.next!=null;com=com.next);
        com.next=new Lista_Reale(x);
            
    }

    public boolean Is_ordered()
    {
        Lista_Reale com = new Lista_Reale();
        for(com=this;com.next!=null;com=com.next)
        {
            if (com.r>com.next.r)
                return false;
        }
        return true;
    }
    
    public void Remove_Unordered()
    {
        Lista_Reale com = new Lista_Reale();
        for(com=this;com.next!=null;)
        {
                if (com.r>com.next.r)
                    com.next=com.next.next; 
                else
                    com=com.next;
        }
    }
    
    public void Merge(Lista_Reale l)
    {
        Lista_Reale com = new Lista_Reale();
        for (com=this;com.next!=null;com=com.next);
        com.next=l;
    }
    
    
    @Override
    public String toString() {
        Lista_Reale com = new Lista_Reale();
        String s="{ ";
        for (com=this;com.next!=null;com=com.next){
        s+=com.r+" | ";
        }
        s+=com.r+" }";
        return s;
    }
    
    
    public static void main(String[] args) {
        Lista_Reale pr=new Lista_Reale(1f);
        pr.Inserisci_NumR(1.5f);
        pr.Inserisci_NumR(40f);
        pr.Inserisci_NumR(2f);
        pr.Inserisci_NumR(100f);
        pr.Inserisci_NumR(1f);
        pr.Inserisci_NumR(200f);
        pr.Inserisci_NumR(10f);
        System.out.println(pr);
        boolean ord=pr.Is_ordered();
        if (ord)
            System.out.println("Ordinata");
        else
            System.out.println("Non ordinata");
        pr.Remove_Unordered();
        System.out.println(pr);
        Lista_Reale ps=new Lista_Reale(2f);
        ps.Inserisci_NumR(5f);
        ps.Inserisci_NumR(3f);
        ps.Inserisci_NumR(6f);
        ps.Inserisci_NumR(205f);
        ps.Inserisci_NumR(0f);
        ps.Inserisci_NumR(205f);      
        System.out.println(ps);
        boolean ord2=ps.Is_ordered();
        if (ord2)
            System.out.println("Ordinata");
        else
            System.out.println("Non ordinata");
        ps.Remove_Unordered();
        System.out.println(ps);
        pr.Merge(ps);
        System.out.println(pr);
        pr.Remove_Unordered();
        System.out.print(pr);
    }
}
