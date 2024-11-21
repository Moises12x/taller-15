public class Main {
    public class Libro {
        - String titulo;
        - String autor;
        - int anioPublicacion;
    }
        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
        }
        public class ReporteLibro {
            public String generarReporte(Libro libro) {
                return "Reporte del Libro:\n" +
                       "Título: " + libro.getTitulo() + "\n" +
                       "Autor: " + libro.getAutor() + "\n" +
                       "Año de Publicación: " + libro.getAnioPublicacion();
            }
            public String generarReporteDetallado(Libro libro) {
                return "Reporte Detallado del Libro:\n" +
                       "Título: " + libro.getTitulo() + "\n" +
                       "Autor: " + libro.getAutor() + "\n" +
                       "Año de Publicación: " + libro.getAnioPublicacion() + "\n" +
                       "Descripción: " + libro.obtenerDescripcion();
            }
        }
        public class PersistenciaLibro {
            public void guardar(Libro libro) {
                System.out.println("Guardando libro: " + libro.getTitulo());
            }
        }
}    
        
