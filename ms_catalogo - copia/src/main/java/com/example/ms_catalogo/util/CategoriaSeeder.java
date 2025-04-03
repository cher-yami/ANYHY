package com.example.ms_catalogo.util;

import com.example.ms_catalogo.entity.Categoria;
import com.example.ms_catalogo.repository.CategoriaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CategoriaSeeder implements CommandLineRunner {

    private final CategoriaRepository categoriaRepository;

    public CategoriaSeeder(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public void run(String... args) {
        // Verificamos si ya existen datos para no duplicar
        if (categoriaRepository.count() == 0) {
            Categoria cat1 = new Categoria(null, "Electrónica");
            Categoria cat2 = new Categoria(null, "Ropa");
            Categoria cat3 = new Categoria(null, "Hogar");
            Categoria cat4 = new Categoria(null, "Juguetes");
            Categoria cat5 = new Categoria(null, "Libros");
            Categoria cat6 = new Categoria(null, "Deportes");
            Categoria cat7 = new Categoria(null, "Salud");
            Categoria cat8 = new Categoria(null, "Belleza");
            Categoria cat9 = new Categoria(null, "Automotriz");
            Categoria cat10 = new Categoria(null, "Mascotas");
            Categoria cat11 = new Categoria(null, "Herramientas");
            Categoria cat12 = new Categoria(null, "Computadoras");
            Categoria cat13 = new Categoria(null, "Celulares");
            Categoria cat14 = new Categoria(null, "Música");
            Categoria cat15 = new Categoria(null, "Jardín");
            Categoria cat16 = new Categoria(null, "Alimentos");
            Categoria cat17 = new Categoria(null, "Bebidas");
            Categoria cat18 = new Categoria(null, "Electrodomésticos");
            Categoria cat19 = new Categoria(null, "Joyería");
            Categoria cat20 = new Categoria(null, "Videojuegos");

            categoriaRepository.save(cat1);
            categoriaRepository.save(cat2);
            categoriaRepository.save(cat3);
            categoriaRepository.save(cat4);
            categoriaRepository.save(cat5);
            categoriaRepository.save(cat6);
            categoriaRepository.save(cat7);
            categoriaRepository.save(cat8);
            categoriaRepository.save(cat9);
            categoriaRepository.save(cat10);
            categoriaRepository.save(cat11);
            categoriaRepository.save(cat12);
            categoriaRepository.save(cat13);
            categoriaRepository.save(cat14);
            categoriaRepository.save(cat15);
            categoriaRepository.save(cat16);
            categoriaRepository.save(cat17);
            categoriaRepository.save(cat18);
            categoriaRepository.save(cat19);
            categoriaRepository.save(cat20);

            System.out.println("Datos de categorías insertados correctamente.");
        } else {
            System.out.println("Las categorías ya existen, no se insertaron datos.");
        }
    }
}
