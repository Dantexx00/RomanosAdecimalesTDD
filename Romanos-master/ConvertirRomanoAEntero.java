package src;

/*
 * @author Santiago Zapata
 * @version 1.0
 * Esta clase permite convertir numeros Romanos a enteros
*/
public class ConvertirRomanoAEntero{
    
    //Metodo que recibe un numero romano en string y lo convierte en entero.
	public int romanoAEntero(String roman)
	{
		int tamañoArreglo = roman.length();
		char[] split = roman.toCharArray();
		int[] enteros = new int[tamañoArreglo];
		for(int i=0; i<tamañoArreglo; i++){
			switch(split[i]){
                            case 'I':
                                    enteros[i]=1;
                                    break;
                            case 'V':
                                    enteros[i]=5;
                                    break;
                            case 'X':
                                    enteros[i]=10;
                                    break;
                            case 'L':
                                    enteros[i]=50;
                                    break;
                            case 'C':
                                    enteros[i]=100;
                                    break;
                            case 'D':
                                    enteros[i]=500;
                                    break;
                            case 'M':
                                    enteros[i]=1000;
                                    break;
			}
		}
		return UnificarNumero(enteros, tamañoArreglo);
	}
	
 //Metodo que unifica un arreglo de enteros en un unico entero.
        public int UnificarNumero(int[] Arreglo, int tamañoArreglo)
		{
			int i = 0, numeroUnificado = 0, primero, segundo;
			do{
						segundo = 0;
						primero=Arreglo[i];
						if(i+1<tamañoArreglo) segundo = Arreglo[i+1];
						//Si el primero es menor al segundo el numero es la resta de los dos ejemplo (IV ES 4 OSEA V=5 - I=1)
						if(primero<segundo){
							primero = segundo - primero;
							i++;
						}                    
						numeroUnificado+=primero;
						i++;
			}while(i<tamañoArreglo);
			return numeroUnificado;
		} 	
}