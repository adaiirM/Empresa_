package reporte;

import DAO.DAOOperaciones;
import groovyjarjarantlr4.v4.runtime.misc.ObjectEqualityComparator;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import java.util.ArrayList;

public class DataSource implements JRDataSource {
    private final Object [][] objects;
    private int indice;

    public DataSource (ArrayList<Object> a){
        indice = -1;
        objects = getObject(a);
    }

    private Object[][] getObject(ArrayList<?> array){
        Object [][] array2 = new Object[array.size()][1];
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < 1 ; j++) {
                array2[i][j] = array.get(i);
            }
        }
        return array2;
    }

/*
    public void recorreMatriz(DTOPeliculas [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 1 ; j++) {
                System.out.println(a[i][j]);
            }
        }
    }*/

    @Override
    public boolean next() throws JRException {
        indice = indice + 1;
        return indice < objects.length;
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {
        Object valor = null;
        String campoNombre = jrField.getName();

        switch (campoNombre)
        {

        }
        return valor;
    }

    public static JRDataSource getDataSource(ArrayList<Object> a){
        return new DataSource(a);
    }
}
