/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smelly;

/**
 *
 * @author bravo
 */
public interface FiguraPiana {
    int type; //0=Cerchio
    
    
    public FiguraPiana(float r){
        this.type=0;
        this.raggio=r;
        Calcola();
    }
    public static float CalcoloAreaCerchio(float r){
        return (float)(Math.pow(r,2)*Math.PI);
    }

    public float getArea() {
        return Area;
    }

    public void setArea(float Area) {
        this.Area = Area;
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
    
    void Calcola() {
        switch(type) 
        {
            case 0:
                Area=CalcoloAreaCerchio(this.getRaggio());
                break;
        }
    }
    
