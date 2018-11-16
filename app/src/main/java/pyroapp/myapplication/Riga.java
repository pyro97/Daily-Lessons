package pyroapp.myapplication;

public class Riga {
    private String classe,materia,orario;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    public Riga(String m, String c , String o){
        classe=c;
        materia=m;
        orario=o;

    }
}
