import java.util.Random;

public class GeneratePass{
    public static final String UPPERCASE_CARACTERES = "ABCDEFGHIJKLMNOPQRSTVWXYZ";
    public static final String LOWER_CASE = "abcdefghijklmnopqrstvwxyz";
    public static final String NUMBER = "123456789";
    public static final String SPECIAL_SYMBOLS = "!@#$%¨&*()_-+=,.;<>/?";

    private final Random random;

    public GeneratePass(){
        random = new Random();
    }
 
    
    public String gerarSenha(int length, boolean minusculo, boolean maiusculo, boolean number, boolean simbolosEspeciais){
    
    
         StringBuilder senhaBuilder = new StringBuilder();
         
         String validarCaracter = "";
         
         if(maiusculo) validarCaracter += UPPERCASE_CARACTERES;
         if (minusculo) validarCaracter += LOWER_CASE;
         if (number) validarCaracter += NUMBER;
         if (simbolosEspeciais) validarCaracter += SPECIAL_SYMBOLS;
    
         for(int i = 0; i < length; i++){
         
         int randomIndex = random.nextInt(validarCaracter.length());
         
         
         char randomChar = validarCaracter.charAt(randomIndex);
         
         senhaBuilder.append(randomChar);
         
         
         
         }
        return senhaBuilder.toString();
           
    
    }
}
