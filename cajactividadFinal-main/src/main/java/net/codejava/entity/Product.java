package net.codejava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    private Long id;
    private String nombrecompleto;
    private float peso;
    private float altura;
    private String alt;
    private float imc;
    private String imr;
    private String results;
    private int edad;
    private String resul;

    public Product() {
    }

    protected Product(Long id, String nombrecompleto, float peso, float altura,  String alt, float imc, String imr, String results, int edad, String resul) {
        super();
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
         this.imr = imr;
        this.results = results;
        this.edad = edad;
        this.alt = alt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public float getPeso() {
        return peso;
    }
        public void setPeso(float peso) {
        this.peso = peso;
    }


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String getAlt() {
        if(altura<1){ return alt= "ALTURA INVALIDA (MUY BAJA)";
        }else if (altura>2.5){ return alt ="ALTURA INVALIDA (MUY ALTA)";
        }else { String alt=Float.toString(altura); return alt;
        }
        
    }

    
     public void setAlt(String Alt) {
        this.alt = alt;
    }

    public float getImc() {
        return imc=peso/(altura*altura);
    }   
    
    public void setImc() {
        this.imc=imc;
    }

    public String getImr() {
        if (imc<14) { return imr="No se puede realizar";
        } else if (imc>69) { return imr="No se puede realizar";
        } else { String imr=Float.toString(imc); return imr;
        }
    }
    public void setImr(String imr) {
        this.imr=imr;
    }
    
    public String getResults(){
        if (imc<14.00){ return results="no se pudo realizar";
        } else if (imc<=14.00  ||   imc<=15.99) {return results="Delgadez Severa";
        } else if (imc<=16.00  ||   imc<=16.99) {return results="Delgadez Moderada";
        } else if (imc<=17.00  ||   imc<=18.49) {return results="Bajo Peso";
        } else if (imc<=18.50  ||   imc<=24.99) {return results="Peso Normal";
        } else if (imc<=25.00  ||   imc<=29.99) {return results="Sobrepeso";
        } else if (imc<=30.00  ||   imc<=34.99) {return results="Obesidad Tipo 1";
        } else if (imc<=35.00  ||   imc<=40.00) {return results="Obesidad Tipo 2";
        }else {return results= "no se pudo realizar";
        }
    }
    
    public void setResults(String results) {
        this.results= results;
    }
    public int getEdad(){
        return edad;
    }
    
   public void setEdad(int edad){
       this.edad = edad;
   }
   public String getResul(){
     if (edad<15){ return resul="Edad invalida (menor)";
     }else if (edad>123) { return alt="Edad invalida (imposible)";
     }else { String resul=Integer.toString(edad); return resul;
     }  
     
   }
   
   public void setResul (String resul){
       this.resul =resul;
   }
    
    

}
