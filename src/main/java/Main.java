import API.ApiReader;

public class Main {
    public static void main(String[] args) {

        ApiReader.apiGet("Roskilde");
        ApiReader.apiGet("København");
        ApiReader.apiGet("Odense");
        ApiReader.apiGet("Hillerød");
        ApiReader.apiGet("Albertslund");
        ApiReader.apiGet("Amager");
    }
}
