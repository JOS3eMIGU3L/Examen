package Examenparcial;
import java.util.Scanner;


public class Examenparcial {

    static Scanner st=new Scanner(System.in);

    public static void Npregunta1JMHP() {
        String Nl;
    double Nec, NE, Ntp; 
    System.out.println("Ingrese las notas: ");
    System.out.println("Ingresar nota del Examen de Conocimiento");
    Nec=st.nextDouble();
    System.out.println("Ingresar nota de la Entrevista Personal");
    NE=st.nextDouble();
    System.out.println("Ingresar nota del Test Psicologico");
    Ntp=st.nextDouble();

    

    double PEC = (Nec * 0.40);
    double PEP = (NE * 0.35);
    double PTP = (Ntp * 0.25);
    double promedio = (PEC + PEP + PTP);

    if (promedio>=17 && promedio<=20) {
        Nl="Su nivel es 4";
    } else if(promedio<17 && promedio>=14){
        Nl="Su nivel es 3";
    } else if(promedio<14 && promedio>=11){
        Nl="Su nivel es 2";
    } else if(promedio<11){
        Nl="no obtiene vacante";
    } else {
        Nl="Notas sin valides ";
    }
    
    System.out.println(Nl);

        
    }
    public static void Npregunta2JMHP() {
        double igv, precio, descuento, importetotal;

        Scanner st = new Scanner(System.in);
        System.out.println("ingresar monto inicial: ");
        precio = st.nextDouble();
        igv = precio+0.18 ;
        
        if (precio<2000){
            igv = precio*0.18;
            descuento = precio*0.10;
            importetotal = precio - descuento + igv ;
            
        }else  if (precio>1000){
                igv = precio*0.18;
                descuento = precio*0.05;
                importetotal = precio - descuento + igv ;
            }else if (precio>500){
                igv = precio*0.18;
                descuento = precio*0.02;
                importetotal = precio - descuento + igv ;
            }else{ 
                    descuento = 0;
                    importetotal =0;
                
            }
            
            System.out.println("el descuento es: "+ descuento);
            System.out.println(" Igv es: "+ igv);
            System.out.println(" total a pagar es : "+ importetotal);
        
        
    }
    public static void Npregunta3JMHP() {
        int v1, v2;
        double R;
        System.out.print("ingrese el primer numero: ");
        v1 = st.nextInt();
        System.out.print("ingrese el segundo numero: ");
        v2 = st.nextInt();
        char operador=st.next().charAt(0);
        R = Math.sqrt(v1);
    
        switch (operador){
            
            case '+': System.out.println(v1+v2); break;
            case '-': System.out.println(v1-v2); break;
            case '/': System.out.println(v1/v2); break;
            case 'x': System.out.println(v1*v2); break;
            case '%': System.out.println(v1%2); break;
            case '^': System.out.println(v1^v2); break;
            case 'R': System.out.println(+R); break;
            
            default: break;
        }
    }
   public static void Npregunta4JMHP() {
    int edad;
    String sexo;
    String v; 
    
    Scanner lt=new Scanner(System.in);
    System.out.print("Ingrese la edad de la persona:");
    edad=lt.nextInt();

    
    
    if (edad>69) {
        v="La vacuna que le corresponde es C";
    }else if(edad>16){
        System.out.println("Ingrese el sexo (F=femenino y M=masculino)");
        sexo=lt.next();
        v="La vacuna que le corresponde es B"; 
    } else if(edad<16){
        v="La vacuna que le corresponde es A";
    } else {
        v="La vacuna que le corresponde es  A";
    }    
    
    System.out.println(v);
}

   
    public static void main(String[] args) {
    
        System.out.println("Coloque la pregunta que desee");
        int pregunta = st.nextInt();
        switch (pregunta) {
          case 1:
            Npregunta1JMHP(); break;
          case 2:
            Npregunta2JMHP(); break;
          case 3:
            Npregunta3JMHP(); break;
          case 4:
            Npregunta4JMHP(); break;
            
            default: break;
        }
    }
}