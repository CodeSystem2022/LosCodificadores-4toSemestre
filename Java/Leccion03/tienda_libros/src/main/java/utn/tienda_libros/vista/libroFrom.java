package utn.tienda_libros.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class libroFrom extends JFrame {




@Component




    private JTable tablaLibros;
    private DefaultTableModel tablaModelosLibros;


    private JTextField idTexto;












        @Autowired


        agregarButton.addActionListener(e -> agregarLibro());





    
   
                cargarLibroSeleccionado();
   
   
   
   
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void cargarLibroSeleccionado(){
        //Los indices de las columnas inician en 0
        var renglon = tablaLibros.getSelectedRow();
        if(renglon != -1){
            String idLibro = tablaLibros.getModel().getValueAt(renglon, 0).toString();            
        }  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void createUIComponents(){
        idTexto = new JTextField("");
        idTexto.setVisible(false);    
        this.tablaModeloLibros = new DefaultTableModel(0, 5);
        String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
        this.tablaModeloLibros.serColumnIdentifiers(cabecera);
        // Instanciar el objeto de JTable
        this.tablaLibros = Jtable(tablaModeloLibros);
    }







    private void agregarLibro(){
        //Leer los valores del formulario
        if(libroTexto.getText().equals("")){
            mostrarMensaje("Ingresa el nombre del libro");
            libroTexto.requestFocusInWindow();
            return;
        }
        var nombreLibro = libroTexto.getText();
        var autor = autorTexto.getText();
        var precio = Double.parseDouble(precioTexto.getText());
        var existencias = Integer.parseInt(existenciasTexto.getText());
        //Creamos el objeto libro
        var libro = new Libro();
        libro.setNombreLibro(nombreLibro);
        libro.setAutor(autor);
        libro.setPrecio(precio);
        libro.setExistencias(existencias);
    }



    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void listarLibros() {
        //Limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        //Obtener los libros desde la base de datos
        var libros = libroServicio.listarLibros();
        //Iteramos cada libro
        libros.forEach((libro) -> {
            //Creamos cada registro para agregarlos a la tabla
            Object[] renglonLibro = {
                    libro.getIdLibro(),
                    libro.getNombreLibro(),
                    libro.getAutor(),
                    libro.getPrecio(),
                    libro.getExistencias()
            };
        });
    }
}


