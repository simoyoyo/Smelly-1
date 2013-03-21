package smelly;

/**
 *
 * @author piffy
 */
public class Solido {
    
        
        private int type; //0=cilindro, 1=sfera
        private float Altezza;  
        private float raggio; 
        private float Area;
        private float Volume;

    public Solido(float r) {
        this.type=1;
        this.raggio=r;
        Calcola();
    }
    
    public Solido(float r, float H){
        this.type=0;
        this.raggio=r;
        this.Altezza=H;
        Calcola();
    }

    public static float Potenza(float r, int i){
        return (float)Math.pow(r, i);
    }
    
    public static float CalcolaAreaCilindro(float r, float H){
        return (2*r*(float)Math.PI*H)+2*(Potenza(r, 2)*(float)Math.PI);
    }
    
    public static float CalcolaVolumeCilindro(float r, float H){
        return (Potenza(r,2)*(float)Math.PI)*H;
    }
    
    public static float CalcolaAreaSfera(float r){
        return (4*(float)Math.PI*Potenza(r,2));
    }
    
    public static float CalcolaVolumeSfera(float r){
        return (4/3*(Potenza(r,3)*(float)Math.PI));
    }
    
    private void Calcola() {
        switch(this.getType()) 
        {
            case 0:
                Area=CalcolaAreaCilindro(this.getRaggio(),this.getAltezza());
                Volume=CalcolaVolumeCilindro(this.getRaggio(),this.getAltezza());
                break;
            case 1:
                Area=CalcolaAreaSfera(this.getRaggio());
                Volume=CalcolaVolumeSfera(this.getRaggio());
                break;                                        
                
        }
    }

    public float getAltezza() {
        return Altezza;
    }

    public void setAltezza(float Altezza) {
        this.Altezza = Altezza;
    }

    public float getArea() {
        return Area;
    }

    public void setArea(float Area) {
        this.Area = Area;
    }

    public float getVolume() {
        return Volume;
    }

    public void setVolume(float Volume) {
        this.Volume = Volume;
    }

    public float getRaggio() {
        return raggio;
    }

    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}
