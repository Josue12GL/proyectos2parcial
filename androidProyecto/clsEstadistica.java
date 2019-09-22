package funciones;

public class clsEstadistica {
        private String[] arreglo;

        public clsEstadistica(String[] Arreglolleno){
            arreglo = Arreglolleno;
        }
        public double promedio(){
            double prom = 0.0;
            for(int i = 0; i<arreglo.length-1; i++){
                prom+= Integer.parseInt(arreglo[i]);
            }
            double prom2 = prom /(arreglo.length-1);
            return prom2;
        }

        public double desviacion(){
            double prom, sum = 0; int i, n =arreglo.length-1;
            prom = promedio();

            for(i = 0; i < n;i++){
                sum += Math.pow(Integer.parseInt(arreglo[i])- prom, 2);
            }
            double resul = Math.sqrt(sum/(double)n);
            return resul;
        }

        public double mediana(){
            int pos = 0, n = arreglo.length-1;
            double temp = 0, temp0 = 0;
            //ordenar de mayor a menor
            arreglo = burbuja(0);

            temp = n/2;
            if(n%2 ==0){
                pos=(int)temp;
                temp0 = (double)(Integer.parseInt(arreglo[pos]) / Integer.parseInt(arreglo[pos+1]));
            }
            if(n % 2 ==1){
                pos=(int)(temp + 0.5);
                temp0 = (double)(Integer.parseInt(arreglo[pos]));
            }
            return temp0;
        }

        public double rango(){
            //ordenar de mayor a menor
            arreglo = burbuja(0);
            double r = Integer.parseInt(arreglo[arreglo.length -2]) - Integer.parseInt(arreglo[0]);
            return r;
        }

        public int moda(){
            int i, j, moda = 0, n = arreglo.length-1, frec;
            int frecTemp, frecModa = 0, moda1 = -1;
            //ordenar de menor a mayor
            arreglo = burbuja(0);
            for(i = 0; i < n;i++){
                frecTemp = 1;
                for(j = i + 1;j < n; j++){
                    if(arreglo [i]==arreglo[j]){
                        frecTemp++;
                    }
                    if(frecTemp > frecModa){
                        frecModa = frecTemp;
                        moda1 = Integer.parseInt(arreglo[i]);
                    }
                }
            }
            return moda1;
        }


        public String[] burbuja(int ord){
            int i, j, n = arreglo.length-1, aux = 0;

            for(i = 0; i < n; i++){
                for(j=i+1; j<n; j++){
                    if(ord ==0){
                        if(Integer.parseInt(arreglo[i]) > Integer.parseInt(arreglo[j])){
                            aux = Integer.parseInt(arreglo[j]);
                            arreglo[j]= arreglo[i];
                            arreglo[i] = String.valueOf(aux);
                        }
                    }else if(ord ==1){
                        if(Integer.parseInt(arreglo[i])< Integer.parseInt(arreglo[j])){
                            aux = Integer.parseInt(arreglo[i]);
                            arreglo[i]= arreglo[j];
                            arreglo[j]= String.valueOf(aux);
                        }
                    }
                }
            }
            return arreglo;
        }

    }

