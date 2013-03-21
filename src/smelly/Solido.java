package smelly;

/**
 *
 * @author piffy
 */
class Solido {
        final float pi=(float)Math.PI;
    
        int type; //0=Cerchio, 1=cilindro, 2=sfera
        float H;  
        float r; 
        float A;
        float V;

    public Solido() {

    }

    void calcola() {
        switch(type) 
        {
            case 0:
                A=r*r*pi;
                V=0;
                break;
            case 1:
                A=(2 * r * pi*H) + 2*(r*r*pi);
                V=(r*r*pi)*H;
                break;
            case 2:
                V=(4/3*r*r*r*pi);
                A=(4*pi*r*r);
                break;                                             
                
        }
    }
    
}
