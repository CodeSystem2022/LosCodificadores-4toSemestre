package utn.tienda_libros.vista;

import javax.swing.*;

public class libroFrom extends JFrame {








































    private void listarLibros(){
        //Limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        //Obtener los libros desde la base de datos
        var libros = libroServicio.listarLibros();
        //Iteramos cada libro
        libros.forEach((libro) ->{
            //Creamos cada registro para agregarlos a la tabla
            Object [] renglonLibro = {
                    libro.getIdLibro(),
                    libro.getNombreLibro(),
                    libro.getAutor(),
                    libro.getPrecio(),
                    libro.getExistencias()
            };
        });
    }
}
