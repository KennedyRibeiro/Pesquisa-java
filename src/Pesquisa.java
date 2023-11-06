import java.util.Scanner;

public class Pesquisa {
    public static void main(String[] args) throws Exception {
        float altura, altmaior, altmenor, media, smAlt;
        String sexo;
        int qtdM, qtdH, i;
        
        Scanner scanner = new Scanner(System.in);
        
        altmaior = -111;
        altmenor = 111;
        qtdM = 0;
        smAlt = 0;
        qtdH = 0;
        
        for (i = 1 ; i <= 10 ; i++ ){  
        
            System.out.print("Digite a altura: ");
            altura = scanner.nextFloat();
        
            System.out.print("Digite o sexo: ");
            sexo = scanner.next();
        
            if (sexo.equals("m")){
                qtdH++;
                smAlt = smAlt + altura;        
             } else if (sexo.equals("f") ){
                qtdM++;
             }
            
            if(altura > altmaior){
                altmaior = altura;
            }
            
            if (altura < altmenor){
                altmenor = altura;
            }
        
        }
         
 
        media = smAlt / qtdH;
        
        System.out.print("\n media de altura dos homens !!! "+media);
        System.out.print("\n maior altura do grupo !!! "+altmaior);
        System.out.print("\n menor altura do grupo !!! "+altmenor);
        System.out.print("\n quantidade de mulheres no grupo !!! "+qtdM);
    }
}

