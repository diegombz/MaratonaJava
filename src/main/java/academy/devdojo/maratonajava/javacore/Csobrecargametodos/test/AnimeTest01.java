package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setNome("Naruto");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.init("Akudama Drive", "TV", 12, "TV");

        anime.imprimir();
    }
}
