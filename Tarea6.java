
package tarea6;
/**
 *
 * @author yadira Dubon , kevin Inestra , Maynor Cruz
 */
public class Tarea6
{
	//Realizar la siguiente funcion recursiva
	//ejercicio1(n) = ejercicio1(n-1) + ejercicio1(n-2)
	//Dados los siguientes caso base
	//ejercicio1(0)=0
	//ejercicio1(1)=1
	static int ejercicio1(int n)
	{
	//Este ejercicio en si se me dificulto un poco ya que en clase no ponia mucha atencion solo tomaba fotos
         //pero gracias ala ayuda del libro pude entender muchas cosas y esto me sirvio de ayuda para el examen..   
            if (n==0)
                return 0; 
             if(n==1)
                return 1;
                    return ejercicio1(n-1)  + ejercicio1(n-2);
	}
	
	
	//Realizar la siguiente funcion recursiva
	//ejercicio2(n) = ejercicio2(n-1) - ejercicio2(n-2)
	//Dados los siguientes caso base
	//ejercicio2(0)=2
	//ejercicio2(1)=3
	static int ejercicio2(int n)
	{
            // ensi este ejercico es el mismo que el anterior...con diferente formula,
            if (n==0)  
		return 2; 
            if (n==1)
                return 3;
                    return ejercicio2(n-1) - ejercicio2(n-2);
	}
	
        
        
	//Realizar la siguiente funcion recursiva
	//ejercicio3(n) = ejercicio3(n-1) * ejercicio3(n-2) - ejercicio3(n-2) + 12
	//Dados los siguientes caso base
	//ejercicio3(0)=0
	//ejercicio3(1)=1
	//ejercicio3(2)=2
	static int ejercicio3(int n)
	{ 
            // es igual al anteriror cn diferente formulas alas otras..
            if (n==0)
		return 0;
            if (n==1)
                return 1;
            if (n==2)
                return 2;
                    return ejercicio3(n-1)  * ejercicio3(n-2) - ejercicio3(n-2) + 12; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
