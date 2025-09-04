import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    public static class History {
        private double valeur;
        private Instant date;
        private String motif;

        public History(double valeur, Instant date, String motif) {
            this.valeur = valeur;
            this.date = date;
            this.motif = motif;
        }

        
        public double getValeur() { return valeur; }
        public Instant getDate() { return date; }
        public String getMotif() { return motif; }
    }

    private Student etudiant;
    private Exam examen;
    private double valeurInitiale;
    private List<History> historique = new ArrayList<>();

    public Grade(Student etudiant, Exam examen, double valeurInitiale, Instant date, String motif) {
        this.etudiant = etudiant;
        this.examen = examen;
        this.valeurInitiale = valeurInitiale;
        this.historique.add(new History(valeurInitiale, date, motif));
    }

    public void changerValeur(double nouvelleValeur, Instant date, String motif) {
        this.historique.add(new History(nouvelleValeur, date, motif));
    }

    public double getValeurA(Instant t) {
        double valeur = valeurInitiale;
        for (History h : historique) {
            if (!h.getDate().isAfter(t)) {
                valeur = h.getValeur();
            }
        }
        return valeur;
    }

    
    public Student getEtudiant() { return etudiant; }
    public Exam getExamen() { return examen; }
    public List<History> getHistorique() { return historique; }
}
