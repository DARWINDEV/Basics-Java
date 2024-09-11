package ejerciciosPOO;

class Password{
    private final static int LONG_DEF=8;

    private int longitud;
    private String password;


    public Password(int longitud, String password) {
        this.longitud = longitud;
        this.password = password;
    }

    public Password(String password) {
        this.password = password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    public String randomPassword(){
        String password = "";

        for (int i=0; i< longitud; i++){
            int select = ((int)Math.floor(Math.random()*3+1));

            if(select == 1) {
                char minuscula = (char)((int)Math.floor(Math.random()*(123-97)+97));
                password += minuscula;
            } else if (select ==2){
                char mayuscula = (char)((int)Math.floor(Math.random()*(91-65)+65));
                password += mayuscula;
            } else{
                char numeros = (char)((int)Math.floor(Math.random()*(58-48)+48));
                password+=numeros;
            }
        }
        return password;
    }

    public boolean isStrong(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i=0; i< password.length(); i++){
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122){
                minusculas+=1;
            } else if (password.charAt(i) >= 65 && password.charAt(i) <= 90){
                mayusculas=+1;
            } else{
                numeros+=1;
            }
        }

        if (numeros>=5 && mayusculas>=1 && minusculas >=2){
            return true;
        } else {
            return false;
        }
    }
}

public class EjercicioPass {
}
